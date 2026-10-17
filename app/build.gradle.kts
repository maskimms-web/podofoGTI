plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.golfcockpit.podofo"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.golfcockpit.s10test"
        minSdk = 29
        targetSdk = 29
        versionCode = 1
        versionName = "S10-0.1"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
