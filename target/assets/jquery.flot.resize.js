!function($,e,t){"$:nomunge";function h(t){r===!0&&(r=t||1);for(var s=i.length-1;s>=0;s--){var l=$(i[s]);if(l[0]==e||l.is(":visible")){var f=l.width(),c=l.height(),d=l.data(m);!d||f===d.w&&c===d.h||(l.trigger(u,[d.w=f,d.h=c]),r=t||!0)}else d=l.data(m),d.w=0,d.h=0}null!==a&&(r&&(null==t||1e3>t-r)?a=e.requestAnimationFrame(h):(a=setTimeout(h,n[o]),r=!1))}var a,i=[],n=$.resize=$.extend($.resize,{}),r=!1,s="setTimeout",u="resize",m=u+"-special-event",o="pendingDelay",l="activeDelay",f="throttleWindow";n[o]=200,n[l]=20,n[f]=!0,$.event.special[u]={setup:function(){if(!n[f]&&this[s])return!1;var e=$(this);i.push(this),e.data(m,{w:e.width(),h:e.height()}),1===i.length&&(a=t,h())},teardown:function(){if(!n[f]&&this[s])return!1;for(var e=$(this),t=i.length-1;t>=0;t--)if(i[t]==this){i.splice(t,1);break}e.removeData(m),i.length||(r?cancelAnimationFrame(a):clearTimeout(a),a=null)},add:function(e){function a(e,n,a){var r=$(this),s=r.data(m)||{};s.w=n!==t?n:r.width(),s.h=a!==t?a:r.height(),i.apply(this,arguments)}if(!n[f]&&this[s])return!1;var i;return $.isFunction(e)?(i=e,a):(i=e.handler,void(e.handler=a))}},e.requestAnimationFrame||(e.requestAnimationFrame=function(){return e.webkitRequestAnimationFrame||e.mozRequestAnimationFrame||e.oRequestAnimationFrame||e.msRequestAnimationFrame||function(t){return e.setTimeout(function(){t((new Date).getTime())},n[l])}}()),e.cancelAnimationFrame||(e.cancelAnimationFrame=function(){return e.webkitCancelRequestAnimationFrame||e.mozCancelRequestAnimationFrame||e.oCancelRequestAnimationFrame||e.msCancelRequestAnimationFrame||clearTimeout}())}(jQuery,this),function($){function init(plot){function onResize(){var placeholder=plot.getPlaceholder();0!=placeholder.width()&&0!=placeholder.height()&&(plot.resize(),plot.setupGrid(),plot.draw())}function bindEvents(plot){plot.getPlaceholder().resize(onResize)}function shutdown(plot){plot.getPlaceholder().unbind("resize",onResize)}plot.hooks.bindEvents.push(bindEvents),plot.hooks.shutdown.push(shutdown)}var options={};$.plot.plugins.push({init:init,options:options,name:"resize",version:"1.0"})}(jQuery);