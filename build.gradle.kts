plugins {
    kotlin("jvm") version "1.4-M2"
}

group = "me.camdenorrb"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

dependencies {
    implementation(files("libs/FastAsyncWorldEdit-1.15-260.jar"))
    implementation(kotlin("stdlib"))
}
