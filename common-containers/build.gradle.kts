plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0.0"
    }
}

dependencies {
    implementation(project(":common-navigation"))

    implementation(libraries.kotlin.core)
    implementation(libraries.android.compat)
    implementation(libraries.ktx.core)
    implementation(libraries.android.constraintLayout)
    implementation(libraries.ktx.fragment)

    implementation(libraries.ktx.navigation.fragment)
    implementation(libraries.ktx.navigation.ui)

    implementation(libraries.koin.core)
    implementation(libraries.koin.android)
}
