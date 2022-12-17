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
        stage('Stage: Get info') {
                    agent any
                    steps {
                        echo 'docker compose ps'
                        echo 'docker ps'
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
                sh "docker compose build"
                sh "docker compose up -d"
            }
        }
    }
}
