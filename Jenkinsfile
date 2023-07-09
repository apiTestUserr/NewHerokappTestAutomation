pipeline {
    agent any

    tools {
        maven 'Maven 3.8.7' 
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/username/repository.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    cucumber '**/target/cucumber-report.json'
                }
            }
        }
    }
}
