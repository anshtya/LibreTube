// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.gradle)
        classpath(libs.kotlin.gradle.plugin)
        classpath(libs.kotlin.serialization)

        // NOTE: Do not place your application dependencies here, they belong
        // in the individual module build.gradle.kts files
    }
}

plugins {
    id("com.google.devtools.ksp") version("1.9.0-1.0.12") apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
