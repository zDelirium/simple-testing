pipeline {
    //Agent - another remote machine
    //Jenkins has master - node
    agent any

    tools {
        maven 'maven-3.8.4'
        jdk 'JDK 17'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean verify'
                // This line is for java reporting
                junit 'target/surefire-reports/*.xml'
                // This line is for (java) code coverage
                publishCoverage adapters: [jacocoAdapter('target/site/jacoco/jacoco.xml')]
            }
        }
    }
}