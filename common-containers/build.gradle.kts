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

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.fragment:fragment-ktx:1.2.4")

    val navigationVersion="2.2.2"
    implementation("androidx.navigation:navigation-fragment-ktx:$navigationVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navigationVersion")

    val koinVersion="2.1.5"
    implementation("org.koin:koin-core:$koinVersion")
    implementation("org.koin:koin-android:$koinVersion")
}
