repositories {
	maven(url = "https://maven.wispforest.io/") {
		name = "WispForest"
	}
}

dependencies {
	"api"(project(":projects:pswg", configuration = "namedElements"))

	"modImplementation"("io.github.kostaskougios:cloning:1.10.3")
	"include"("io.github.kostaskougios:cloning:1.10.3")

	"modImplementation"("io.github.spair:imgui-java-binding:1.86.6")
	"include"("io.github.spair:imgui-java-binding:1.86.6")
	"modImplementation"("io.github.spair:imgui-java-lwjgl3:1.86.6")
	"include"("io.github.spair:imgui-java-lwjgl3:1.86.6")
	"modImplementation"("io.github.spair:imgui-java-natives-windows:1.86.6")
	"include"("io.github.spair:imgui-java-natives-windows:1.86.6")

	"modImplementation"("io.wispforest:worldmesher:0.2.14+1.19.3")
	"include"("io.wispforest:worldmesher:0.2.14+1.19.3")
	//	"modImplementation"(files("/home/cnewman/IdeaProjects/worldmesher/build/libs/worldmesher-0.2.13+build.11+1.19.jar"))
	//	"include"(files("/home/cnewman/IdeaProjects/worldmesher/build/libs/worldmesher-0.2.13+build.11+1.19.jar"))
}
