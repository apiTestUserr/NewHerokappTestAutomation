pipeline {
    agent any

    tools {
        maven 'Maven 3.8.7' 
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/apiTestUserr/HerokupTestAutomation.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    cucumber '**/target/cucumber-report.html'
                }
            }
        }
    }
}
