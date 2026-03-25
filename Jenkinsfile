pipeline {
    agent any

    tools {
        maven 'Maven'   // Make sure this name matches Jenkins Global Tool Configuration
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/Ashapriya01/CalculatorApplication.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Package JAR') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Install to Local Repo') {
            steps {
                sh 'mvn install'
            }
        }
    }

    post {
        always {
            // Publish test results safely
            junit allowEmptyResults: true, testResults: '**/target/surefire-reports/*.xml'
        }

        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }
    }
}
