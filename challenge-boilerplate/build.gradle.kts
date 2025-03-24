plugins {
    kotlin("jvm") version "2.1.10"
    application
}

group = "com.nimbus154"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.nimbus154.MainKt")
}