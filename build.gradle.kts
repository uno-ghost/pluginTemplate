pluginInfo {
    // The display name of the plugin.
    pluginName = "examplePlugin"
    description = "An example plugin"

    // The version name displayed to the user.
    versionName = "1.0-ALPHA"

    // Increment this value with each update to ensure proper plugin updates
    // and to avoid potential conflicts or outdated installations.
    versionCode = 1

    // A unique package name to prevent conflicts with other plugins.
    packageName = "com.example"

    // The main entry point class for the plugin. This class must extend `ExtensionAPI`.
    mainClass = "com.example.Main"

    // The name of the plugin developer.
    author = "Your Name"

    // Optional: URL for the plugin's documentation, website, or source code repository.
    pluginWebsite = null


    //NOTE : This is not implemented
    // Optional: The class for settings or configuration, allowing users to customize the plugin.
    // Uncomment and set this if the plugin provides customizable settings.
    // settingsClass = "com.example.Settings"
}

dependencies {
    // Add any external libraries required by the plugin here.

    // Note: Warnings about this library not being packaged can be safely ignored.
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
}

repositories {
    // Specify additional repositories for dependency resolution if needed.
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

plugins {
    kotlin("jvm") version "2.0.10"
    id("com.rk.XedSdk")
    id("java")
}
