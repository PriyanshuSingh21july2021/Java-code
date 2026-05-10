pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/PriyanshuSingh21july2021/Java-code.git'
            }
        }

        stage('Compile Java Code') {
            steps {
                echo 'Compiling Java Program...'
                sh 'javac Queues.java'
            }
        }

        stage('Run Java Program') {
            steps {
                echo 'Running Java Program...'
                sh 'java Queues'
            }
        }

    }

    post {
        success {
            echo "Build Successful 🚀"
        }

        failure {
            echo "Build Failed ❌"
        }
    }
}
