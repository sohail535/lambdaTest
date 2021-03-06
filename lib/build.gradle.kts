/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.7/userguide/building_java_projects.html
 */

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    id("com.github.johnrengelman.shadow") version "6.1.0"
    kotlin("kapt") version "1.4.32"
    java

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use JCenter for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // java lambda core
    implementation("com.amazonaws:aws-lambda-java-core:1.2.1")
    implementation("com.google.dagger:dagger:2.33")
    kapt("com.google.dagger:dagger-compiler:2.33")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("io.mockk:mockk:1.11.0")
}

//val compileKotlin: KotlinCompile by tasks
//compileKotlin.kotlinOptions.jvmTarget = "11"

tasks.withType<KotlinCompile>().all {
    kotlinOptions {
        jvmTarget = "11"
    }
}