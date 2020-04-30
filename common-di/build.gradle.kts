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
    implementation(project(":feature-countries"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")

    val koinVersion="2.1.5"
    implementation("org.koin:koin-core:$koinVersion")
    implementation("org.koin:koin-android:$koinVersion")
}
