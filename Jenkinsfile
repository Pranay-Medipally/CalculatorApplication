pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/Ashapriya01/CalculatorApplication.git'
            }
        }

        stage('Build, Test & Package') {
            steps {
                sh 'mvn clean install'
            }
        }
    }

    post {
        success {
            echo 'Build success!'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        failure {
            echo 'Build failed'
        }
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
