plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
    kotlin("kapt")
}
group = "com.example.movieapp"
version = "1.0-SNAPSHOT"
androidExtensions {
    isExperimental = true
}
repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
dependencies {
    implementation(project(":movieApi"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("com.android.support:multidex:1.0.3")
    implementation("io.ktor:ktor-client-android:1.4.0")
    implementation("com.github.bumptech.glide:glide:4.11.0")
    kapt("com.github.bumptech.glide:compiler:4.11.0")
    implementation("com.badoo.reaktive:reaktive:1.1.18")
    implementation("org.kodein.di:kodein-di-framework-android-x:7.1.0")
}
android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.example.movieapp.androidApp"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}