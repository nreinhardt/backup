/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm").version("1.3.11")

    // Apply the application plugin to add support for building a CLI application.
    application
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenCentral()
}

dependencies {
    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(group="com.google.guava", name="guava", version= "27.0.1-jre")
    implementation(group = "com.fasterxml.jackson.core", name="jackson-core", version="2.9.8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.8")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.9.8")
    implementation("com.github.salomonbrys.kodein:kodein:4.1.0")
    implementation("com.github.kittinunf.fuel:fuel:1.15.1")
    implementation("org.json:org.json:2.0")
    implementation("io.github.microutils:kotlin-logging:1.6.22")
    implementation("org.apache.logging.log4j:log4j-api:2.11.1")
    implementation(group = "org.apache.logging.log4j", name = "log4j-core", version = "2.11.1")
    implementation(group = "org.apache.logging.log4j", name = "log4j-slf4j-impl", version = "2.11.1")
    implementation("io.arrow-kt:arrow-core:0.8.2")


    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("org.mockito:mockito-android:2.23.4")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0")
    testImplementation("org.assertj:assertj-core:3.11.1")
}

application {
    // Define the main class for the application.
    mainClassName = "backupKotlin.AppKt"
}
