defaultTasks("build")

tasks.wrapper {
    description = "Regenerates the Gradle Wrapper files"
    gradleVersion = "7.4"
    distributionUrl = "https://services.gradle.org/distributions/gradle-${gradleVersion}-all.zip"
}
