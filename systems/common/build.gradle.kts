plugins {
    kotlin("jvm") version "1.8.0"
}

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
//    testImplementation("junit:junit:4.13.1")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.1.9")
}
