pluginManagement {
    repositories {
        gradlePluginPortal()
        flatDir {
            dirs(file("sdk"))
        }
    }
}

buildscript {
    repositories {
        flatDir {
            dirs(file("sdk"))
        }
    }
    dependencies {
        classpath(files("sdk/xed-editor-sdk.jar"))
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "examplePlugin"

