val libraries = Libraries()

class Libraries {
    val kotlin = Kotlin()
    val gradle = Gradle()
    val android = Android()
    val ktx = Ktx()
    val koin = Koin()
}

class Kotlin {
    companion object {
        private const val VERSION = "1.3.61"
    }

    val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VERSION"
    val core = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$VERSION"
}

class Gradle {
    val plugin = "com.android.tools.build:gradle:3.6.3"
}

class Android {
    val compat = "androidx.appcompat:appcompat:1.1.0"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
}

class Ktx {
    val core = "androidx.core:core-ktx:1.2.0"
    val fragment = "androidx.fragment:fragment-ktx:1.2.4"
    val navigation = Navigation()

    class Navigation {
        companion object {
            private const val VERSION = "2.2.2"
        }

        val fragment = "androidx.navigation:navigation-fragment-ktx:$VERSION"
        val ui = "androidx.navigation:navigation-ui-ktx:$VERSION"
    }
}

class Koin {
    companion object {
        private const val VERSION = "2.1.5"
    }

    val core = "org.koin:koin-core:$VERSION"
    val android = "org.koin:koin-android:$VERSION"
    val viewModel = "org.koin:koin-androidx-viewmodel:$VERSION"
}
