// Bowler Studio lets you call other scripts from inside of your scripts
// it is how we can have totally cloud based robots. 
//You can load files directly from git
// you can cast the object you get back and use it in your script like any other object. 
CSG ref = ScriptingEngine.gitScriptRun(
	                "https://github.com/JansenSmith/OpensourcererSpaceMouse.git", // git location of the library
	                      "v2-frame.stl" , // file to load
	                      null)// no parameters (see next tutorial)

CSG title = CSG.text("Opensourcerer",5.0, 30.0, "FreeSerif")
			.movey(40)

CSG ret = ref.union(title)