plugins {
  kotlin("jvm") version "1.7.22"
  kotlin("plugin.spring") version "1.7.22"
  kotlin("plugin.jpa") version "1.7.22"
  id("org.springframework.boot") version "3.0.0"
  id("io.spring.dependency-management") version "1.1.0"
}

repositories {
  mavenCentral()
}

dependencies {
  annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
  annotationProcessor("jakarta.persistence:jakarta.persistence-api")
  annotationProcessor("com.querydsl:querydsl-apt::jpa")

  implementation(kotlin("stdlib-jdk8"))
  implementation(kotlin("reflect"))
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("it.ozimov:embedded-redis:0.7.3") {
    exclude(group = "org.slf4j", module = "slf4j-simple")
  }

  developmentOnly("com.h2database:h2")
  developmentOnly("org.springframework.boot:spring-boot-devtools")
}
