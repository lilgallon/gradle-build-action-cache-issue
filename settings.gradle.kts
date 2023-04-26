rootProject.name = "gradle-build-action-cache-issue"

include(
    "systems:common",
    "systems:core",
)

plugins {
    id("com.gradle.enterprise").version("3.11.4")
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
