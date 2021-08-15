pipeline {

environment { 
	registry = "shankarcit/spring-boot-demoapp" 
	registryCredential = 'docker-hub' 
	dockerImage = '' 
	}
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
                script { 
                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 
                }
            }
        }
		stage("Push image to repository") {
			steps {
				script {
					docker.withRegistry( '', registryCredential ) {
						dockerImage.push()
						}
				}
			}
		}
		
		
    }
}