plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")

    defaultConfig {
        applicationId = "com.gevondov.footballer"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0.0"
    }
}

dependencies {
    implementation(project(":common-resources"))
    implementation(project(":common-containers"))
    implementation(project(":common-di"))

    implementation(libraries.kotlin.core)
    implementation(libraries.android.compat)
    implementation(libraries.ktx.core)
}
