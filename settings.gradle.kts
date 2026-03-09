rootProject.name = "msaitodev-quiz-engine"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    // 依存先（core/feature）をローカルMavenから取得するために必要
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal() 
    }
}

// Quiz Core モジュール
include(":quiz-core-domain")
include(":quiz-core-data")
include(":quiz-core-navigation")

// Quiz Feature モジュール
include(":quiz-feature-main")
include(":quiz-feature-history")
include(":quiz-feature-result")
include(":quiz-feature-review")
include(":quiz-feature-analysis")