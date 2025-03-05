pluginManagement {
	repositories {
		gradlePluginPortal()
		google()
		mavenCentral()
		maven("https://maven.brott.dev/")
	}
}

rootProject.name = "PedroPathing"
include(":FtcRobotController")
include(":TeamCode")
