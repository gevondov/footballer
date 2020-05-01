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

    viewBinding.isEnabled = true
}

dependencies {
    implementation(project(":common-resources"))
    implementation(project(":common-models-feature"))
    implementation(project(":core-screen-views"))
    implementation(project(":delegate-text-single-row"))

    implementation(libraries.kotlin.core)
    implementation(libraries.android.compat)
    implementation(libraries.ktx.core)
    implementation(libraries.ktx.fragment)
    implementation(libraries.android.constraintLayout)
    implementation(libraries.android.recyclerView)

    implementation(libraries.koin.core)
    implementation(libraries.koin.android)
    implementation(libraries.koin.viewModel)
}
