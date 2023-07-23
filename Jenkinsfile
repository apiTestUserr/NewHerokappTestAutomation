pipeline {
    agent any

    tools {
        maven 'Maven 3.8.7' 
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/apiTestUserr/NewRepoInternetHerookapp.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn verify'
            }
            
    post {
        always {
            // Archiver le fichier JSON du rapport
            archiveArtifacts artifacts: 'target/cucumber.json', fingerprint: true
            
            // Publier le rapport HTML à l'aide du plugin "HTML Publisher Plugin"
            publishHTML target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/cucumber-html-reports',
                reportFiles: 'cucumber.html',
                reportName: 'Cucumber HTML Report'
            ]
        }
    }
        }
    }
}
