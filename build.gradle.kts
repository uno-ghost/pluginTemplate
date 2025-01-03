pluginInfo {
    //display name of the plugin
    pluginName = "examplePlugin"

    // Version displayed to the user.
    versionName = "1.0-ALPHA"

    // Increment this with each update to avoid plugin update issues.
    versionCode = 1

    // Unique package name to avoid conflicts.
    packageName = "com.example"

    // Main entry class for the plugin.
    mainClass = "com.example.Main"

    // Optional: Settings class for user customization.
    settingsClass = "com.example.Settings"

    // Developer's name.
    author = "Your Name"

    // Optional: URL for documentation or website.
    pluginWebsite = null
}

dependencies {
    // Add any required external libraries here.
}

repositories {
    // Add extra repositories for dependencies if needed.
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

plugins {
    kotlin("jvm") version "2.0.10"
    id("com.rk.XedSdk")
}
