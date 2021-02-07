pipeline {
    agent { docker 'maven:3.2.5' }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}