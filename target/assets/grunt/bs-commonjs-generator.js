"use strict";var fs=require("fs"),path=require("path"),COMMONJS_BANNER="// This file is autogenerated via the `commonjs` Grunt task. You can require() this file in a CommonJS environment.\n";module.exports=function(grunt,srcFiles,destFilepath){function srcPathToDestRequire(srcFilepath){var requirePath=path.posix.relative(destDir,srcFilepath);return"require('"+requirePath+"')"}var destDir=path.dirname(destFilepath),moduleOutputJs=COMMONJS_BANNER+srcFiles.map(srcPathToDestRequire).join("\n");try{fs.writeFileSync(destFilepath,moduleOutputJs)}catch(err){grunt.fail.warn(err)}grunt.log.writeln("File "+destFilepath.cyan+" created.")};