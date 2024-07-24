import javax.swing.Spring

plugins {
    java
    application
    id("org.springframework.boot") version "3.2.4"
    id("io.spring.dependency-management") version "1.1.4"
}

application {
	mainClass.set("org.infnet.infnetapiwebrestful.InfnetApiWebRestfulApplication")
}

group = "org.infnet"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web-services")
    implementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:4.1.0")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2")


}

tasks.named<JavaExec>("run") {
    // Configuração dos argumentos para a tarefa run
    if (project.hasProperty("args")) {
        args(*(project.property("args") as String).split(" ").toTypedArray())
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
