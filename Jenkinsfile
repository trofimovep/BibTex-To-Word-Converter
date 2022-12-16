pipeline {
    agent any 
    stages {
        stage('Stage: Build') {
            steps {
                echo 'Starting Building application'
                sh "./build.sh"
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
