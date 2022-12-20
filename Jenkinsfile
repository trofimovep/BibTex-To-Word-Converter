pipeline {
    agent any
    stages {
        stage('Gradle Build') {
            steps {
                echo 'Building services...'
                sh 'chmod +x build.sh'
                sh './build.sh'
            }
        }
        stage('Stopping application') {
            steps {
                echo 'Stopping docker containers...'
                sh "docker compose down"
            }
        }
        stage('Starting application') {
            steps {
                echo 'Starting docker containers...'
                sh "docker compose up -d"
            }
        }
    }
}
