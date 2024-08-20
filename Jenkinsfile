pipeline {
    agent any

    tools {
        // Ensure Maven is installed and available
        maven 'Maven 3.9.9'
    }

    environment {
        // Define the path to the ChromeDriver
        CHROME_DRIVER_PATH = '/path/to/chromedriver'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub
                git url: 'https://github.com/your-username/login-test-project.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Run Maven build
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run Maven tests
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            // Archive test results and reports
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
