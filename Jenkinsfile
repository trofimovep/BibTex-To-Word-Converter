pipeline {
    agent any 
    stages {
        stage('Stage: Build') {
            tools {
                jdk 'JDK 17'
            }
            steps {
                echo 'Starting Building application'
                sh "./b2w-converter/gradlew clean build"
            }
        }
        stage('Stage: Stopping docker containers') {
            steps {
                echo 'Stopping application...'
                sh "docker compose down"
            }
        }
        stage('Stage: Starting containers') {
            steps {
                echo 'Starting application...'
                sh "docker compose up"
            }
        }
    }
}
