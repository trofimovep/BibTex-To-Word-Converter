pipeline {
    agent any 
    stages {
        stage('Stage: Build') {
            steps {
                echo 'Starting Building application'
                sh "chmod +x ./build.sh"
                sh "./build.sh"
            }
        }
        stage('Stage: Stopping docker containers') {
            agent any
            steps {
                echo 'Stopping application...'
                sh "/usr/bin/docker-compose down"
            }
        }
        stage('Stage: Starting containers') {
            agent any
            steps {
                echo 'Starting application...'
                sh "/usr/bin/docker-compose -f docker-compose.yml restart -d --build"
            }
        }
    }
}
