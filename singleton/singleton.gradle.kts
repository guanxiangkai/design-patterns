dependencies {
    testImplementation(platform(libs.junit.bom.get().toString()))
    testImplementation(libs.junit.jupiter.get().toString())
    implementation(libs.logback.classic.get().toString())
}
