plugins {
  id("java")
}

group = "io.github.aaronchenwei.example"
version = "0.0.1-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.google.dagger:dagger:2.44.1")
  annotationProcessor("com.google.dagger:dagger-compiler:2.44.1")

  testImplementation(platform("org.junit:junit-bom:5.9.2"))
  testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
  useJUnitPlatform()
}
