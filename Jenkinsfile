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
                // Next lines are for java testing reports
                junit 'target/surefire-reports/*.xml'
                publishCoverage adapters: [jacocoAdapter('target/site/jacoco/jacoco.xml')]
            }
        }
    }
}