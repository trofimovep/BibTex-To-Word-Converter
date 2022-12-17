pipeline {
    agent any 
    stages {
        stage('Stage: Gradle Build') {
            steps {
                echo 'Starting Building application'
                sh "chmod +x ./build.sh"
                sh "./build.sh"
            }
        }
         stage('Stage: Build services') {
                    steps {
                        sh "docker build . -f gateway/Dockerfile gateway"
                        sh "docker build . -f discovery-service/Dockerfile discovery-service"
                        sh "docker build . -f b2w-converter/Dockerfile b2w-converter"
                        sh "./build.sh"
                    }
                }
        stage('Stage: Stopping docker containers') {
            agent any
            steps {
                echo 'Stopping application...'
                sh "docker compose down"
            }
        }
        stage('Stage: Starting containers') {
            agent any
            steps {
                echo 'Starting application...'
                sh "docker compose up --build"
            }
        }
    }
}
