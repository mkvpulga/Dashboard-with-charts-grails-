!function($){function init(plot){function processOptions(plot,options){options.series.curvedLines.active&&plot.hooks.processDatapoints.unshift(processDatapoints)}function processDatapoints(plot,series,datapoints){var nrPoints=datapoints.points.length/datapoints.pointsize,EPSILON=.005,invalidLegacyOptions=hasInvalidParameters(series.curvedLines);if(!invalidLegacyOptions&&1==series.curvedLines.apply&&void 0===series.originSeries&&nrPoints>1+EPSILON)if(series.lines.fill){var pointsTop=calculateCurvePoints(datapoints,series.curvedLines,1),pointsBottom=calculateCurvePoints(datapoints,series.curvedLines,2);datapoints.pointsize=3,datapoints.points=[];for(var j=0,k=0,i=0,ps=2;i<pointsTop.length||j<pointsBottom.length;)pointsTop[i]==pointsBottom[j]?(datapoints.points[k]=pointsTop[i],datapoints.points[k+1]=pointsTop[i+1],datapoints.points[k+2]=pointsBottom[j+1],j+=ps,i+=ps):pointsTop[i]<pointsBottom[j]?(datapoints.points[k]=pointsTop[i],datapoints.points[k+1]=pointsTop[i+1],datapoints.points[k+2]=k>0?datapoints.points[k-1]:null,i+=ps):(datapoints.points[k]=pointsBottom[j],datapoints.points[k+1]=k>1?datapoints.points[k-2]:null,datapoints.points[k+2]=pointsBottom[j+1],j+=ps),k+=3}else series.lines.lineWidth>0&&(datapoints.points=calculateCurvePoints(datapoints,series.curvedLines,1),datapoints.pointsize=2)}function calculateCurvePoints(datapoints,curvedLinesOptions,yPos){if("undefined"!=typeof curvedLinesOptions.legacyOverride&&0!=curvedLinesOptions.legacyOverride){var defaultOptions={fit:!1,curvePointFactor:20,fitPointDist:void 0},legacyOptions=jQuery.extend(defaultOptions,curvedLinesOptions.legacyOverride);return calculateLegacyCurvePoints(datapoints,legacyOptions,yPos)}return calculateSplineCurvePoints(datapoints,curvedLinesOptions,yPos)}function calculateSplineCurvePoints(datapoints,curvedLinesOptions,yPos){for(var points=datapoints.points,ps=datapoints.pointsize,splines=createHermiteSplines(datapoints,curvedLinesOptions,yPos),result=[],j=0,i=0;i<points.length-ps;i+=ps){var curX=i,curY=i+yPos,xStart=points[curX],xEnd=points[curX+ps],xStep=(xEnd-xStart)/Number(curvedLinesOptions.nrSplinePoints);result.push(points[curX]),result.push(points[curY]);for(var x=xStart+=xStep;xEnd>x;x+=xStep)result.push(x),result.push(splines[j](x));j++}return result.push(points[points.length-ps]),result.push(points[points.length-ps+yPos]),result}function createHermiteSplines(datapoints,curvedLinesOptions,yPos){for(var points=datapoints.points,ps=datapoints.pointsize,segmentLengths=[],segmentSlopes=[],i=0;i<points.length-ps;i+=ps){var curX=i,curY=i+yPos,dx=points[curX+ps]-points[curX],dy=points[curY+ps]-points[curY];segmentLengths.push(dx),segmentSlopes.push(dy/dx)}var gradients=[segmentSlopes[0]];if(curvedLinesOptions.monotonicFit)for(var i=1;i<segmentLengths.length;i++){var slope=segmentSlopes[i],prev_slope=segmentSlopes[i-1];if(0>=slope*prev_slope)gradients.push(0);else{var length=segmentLengths[i],prev_length=segmentLengths[i-1],common=length+prev_length;gradients.push(3*common/((common+length)/prev_slope+(common+prev_length)/slope))}}else for(var i=ps;i<points.length-ps;i+=ps){var curX=i,curY=i+yPos;gradients.push(Number(curvedLinesOptions.tension)*(points[curY+ps]-points[curY-ps])/(points[curX+ps]-points[curX-ps]))}gradients.push(segmentSlopes[segmentSlopes.length-1]);var coefs1=[],coefs2=[];for(i=0;i<segmentLengths.length;i++){var m_k=gradients[i],m_k_plus=gradients[i+1],slope=segmentSlopes[i],invLength=1/segmentLengths[i],common=m_k+m_k_plus-slope-slope;coefs1.push(common*invLength*invLength),coefs2.push((slope-common-m_k)*invLength)}for(var ret=[],i=0;i<segmentLengths.length;i++){var spline=function(x_k,coef1,coef2,coef3,coef4){return function(x){var diff=x-x_k,diffSq=diff*diff;return coef1*diff*diffSq+coef2*diffSq+coef3*diff+coef4}};ret.push(spline(points[i*ps],coefs1[i],coefs2[i],gradients[i],points[i*ps+yPos]))}return ret}function calculateLegacyCurvePoints(datapoints,curvedLinesOptions,yPos){var points=datapoints.points,ps=datapoints.pointsize,num=Number(curvedLinesOptions.curvePointFactor)*(points.length/ps),xdata=new Array,ydata=new Array,curX=-1,curY=-1,j=0;if(curvedLinesOptions.fit){var fpDist;if("undefined"==typeof curvedLinesOptions.fitPointDist){var minX=points[0],maxX=points[points.length-ps];fpDist=(maxX-minX)/5e4}else fpDist=Number(curvedLinesOptions.fitPointDist);for(var i=0;i<points.length;i+=ps){var frontX,backX;curX=i,curY=i+yPos,frontX=points[curX]-fpDist,backX=points[curX]+fpDist;for(var factor=2;frontX==points[curX]||backX==points[curX];)frontX=points[curX]-fpDist*factor,backX=points[curX]+fpDist*factor,factor++;xdata[j]=frontX,ydata[j]=points[curY],j++,xdata[j]=points[curX],ydata[j]=points[curY],j++,xdata[j]=backX,ydata[j]=points[curY],j++}}else for(var i=0;i<points.length;i+=ps)curX=i,curY=i+yPos,xdata[j]=points[curX],ydata[j]=points[curY],j++;var n=xdata.length,y2=new Array,delta=new Array;y2[0]=0,y2[n-1]=0,delta[0]=0;for(var i=1;n-1>i;++i){var d=xdata[i+1]-xdata[i-1];if(0==d)return[];var s=(xdata[i]-xdata[i-1])/d,p=s*y2[i-1]+2;y2[i]=(s-1)/p,delta[i]=(ydata[i+1]-ydata[i])/(xdata[i+1]-xdata[i])-(ydata[i]-ydata[i-1])/(xdata[i]-xdata[i-1]),delta[i]=(6*delta[i]/(xdata[i+1]-xdata[i-1])-s*delta[i-1])/p}for(var j=n-2;j>=0;--j)y2[j]=y2[j]*y2[j+1]+delta[j];var step=(xdata[n-1]-xdata[0])/(num-1),xnew=new Array,ynew=new Array,result=new Array;for(xnew[0]=xdata[0],ynew[0]=ydata[0],result.push(xnew[0]),result.push(ynew[0]),j=1;num>j;++j){xnew[j]=xnew[0]+j*step;for(var max=n-1,min=0;max-min>1;){var k=Math.round((max+min)/2);xdata[k]>xnew[j]?max=k:min=k}var h=xdata[max]-xdata[min];if(0==h)return[];var a=(xdata[max]-xnew[j])/h,b=(xnew[j]-xdata[min])/h;ynew[j]=a*ydata[min]+b*ydata[max]+((a*a*a-a)*y2[min]+(b*b*b-b)*y2[max])*h*h/6,result.push(xnew[j]),result.push(ynew[j])}return result}function hasInvalidParameters(curvedLinesOptions){if("undefined"!=typeof curvedLinesOptions.fit||"undefined"!=typeof curvedLinesOptions.curvePointFactor||"undefined"!=typeof curvedLinesOptions.fitPointDist)throw new Error("CurvedLines detected illegal parameters. The CurvedLines API changed with version 1.0.0 please check the options object.");return!1}plot.hooks.processOptions.push(processOptions)}var options={series:{curvedLines:{active:!1,apply:!1,monotonicFit:!1,tension:.5,nrSplinePoints:20,legacyOverride:void 0}}};$.plot.plugins.push({init:init,options:options,name:"curvedLines",version:"1.1.1"})}(jQuery);