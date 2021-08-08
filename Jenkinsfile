pipeline {
    agent any

    triggers{
        githubPush()
    }

    stages {
        stage("Build") {
            steps {
                sh './gradlew assemble'
            }
        }
        stage("Test") {
            steps {
                sh './gradlew test'
            }
        }
        stage("Build Docker image") {
            steps {
                docker.build(shankarcit/spring-boot-demoapp)
            }
        }
    }
}