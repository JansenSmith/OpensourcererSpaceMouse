// Bowler Studio lets you call other scripts from inside of your scripts
// it is how we can have totally cloud based robots. 
//You can load files directly from git
File servo = ScriptingEngine
	.fileFromGit(
		"https://github.com/NeuronRobotics/BowlerStudioVitamins.git",//git repo URL
		"master",//branch
		"BowlerStudioVitamins/stl/servo/smallservo.stl"// File from within the Git repo
	);
println "File cached to: "+ servo
// you can cast the object you get back and use it in your script like any other object. 
ScriptingEngine.gitScriptRun(
	                "https://gist.github.com/d4312a0787456ec27a2a.git", // git location of the library
	                      "helloWorld.groovy" , // file to load
	                      null// no parameters (see next tutorial)