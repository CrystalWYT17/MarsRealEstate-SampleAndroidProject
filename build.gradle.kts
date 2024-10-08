// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}

buildscript {
    dependencies {
        classpath("androidx.navigation.safeargs.kotlin:androidx.navigation.safeargs.kotlin.gradle.plugin:2.7.7")
    }
}
//
//buildscript {
//
//    ext {
//        // Versions for all the dependencies we plan to use. It's particularly useful for kotlin and
//        // navigation where the versions of the plugin needs to be the same as the version of the
//        // library defined in the app Gradle file
//        version_android_gradle_plugin = '8.4.2'
//        version_core = "1.13.1"
//        version_constraint_layout = "2.1.4"
//        version_glide = "4.16.0"
//        version_gradle = '8.4.2'
//        version_kotlin = '1.9.24'
//        version_kotlin_coroutines = "1.8.1"
//        version_lifecycle = '2.8.2'
//        version_moshi = "1.15.1"
//        version_navigation = '2.7.7'
//        version_retrofit = "2.9.0"
//        version_retrofit_coroutines_adapter = "0.9.2"
//        version_recyclerview = "1.3.2"
//    }
//
//    repositories {
//        mavenCentral()
//        google()
//    }
//    dependencies {
//        classpath "com.android.tools.build:gradle:$version_android_gradle_plugin"
//        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$version_kotlin"
//        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$version_navigation"
//    }
//}
//
//allprojects {
//    repositories {
//        google()
//    }
//}
//
//task clean(type: Delete) {
//    delete rootProject.buildDir
//}
