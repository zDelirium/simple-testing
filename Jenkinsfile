pipeline {
    //Agent - another remote machine
    //Jenkins has master - node
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean verify'
            }
        }
    }
}