pipeline {
    agent any
    stages {
        stage('Gradle Build') {
            steps {
                echo 'Starting Building services'
                sh 'chmod +x -R .'
//                 sh './discovery-service/gradlew -p discovery-service clean build'
//                 sh './gateway/gradlew -p gateway clean build'
//                 sh './b2w-converter/gradlew -p b2w-converter clean build'
                sh './build.sh'
            }
        }
        stage('Get info') {
            steps {
                echo 'docker compose ps'
                echo 'docker ps'
            }
        }
        stage('Stopping docker containers') {
            steps {
                echo 'Stopping application...'
                sh "docker compose down"
            }
        }
        stage('Starting containers') {
            steps {
                echo 'Starting application...'
                sh "docker compose build"
                sh "docker compose up -d"
            }
        }
    }
}
