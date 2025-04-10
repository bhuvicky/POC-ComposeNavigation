pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "POC-ComposeNavigation"
include(":app")
include(":features:feature-auth")
include(":features:feature-home")
include(":features:feature-profile")
include(":features:feature-settings")
include(":features:feature-details")
include(":features:common")
include(":designlib")
