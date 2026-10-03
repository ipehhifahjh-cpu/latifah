plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.latihan.logisticstrackerapp"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.latihan.logisticstrackerapp"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // Dependensi Bawaan Project
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

    // 1. Networking Engine: Square Retrofit 2 & Gson Converter (Dari Dosen)
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")

    // 2. OkHttp Logging Interceptor (Dari Dosen)
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    // 3. Kotlin Coroutines & Lifecycle Scope (Jika diminta pada modul dosen)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.0")
}
