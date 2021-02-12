pipeline {
    agent any

    stages {
        stage('pull project') {
            steps {
                echo "start checkout"
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '523ea8aa-f740-43e5-b310-620378f0e9e9', url: 'https://github.com/hyfsy/learn-jenkins.git']]])
                echo "checkout success!"
            }
        }
        stage('package project') {
            steps {
                echo "start package"
                sh 'mvn clean package'
                echo "package success!!"
            }
        }
        stage('deploy project') {
            steps {
                echo "start deploy"
                deploy adapters: [tomcat8(credentialsId: '607821d0-0267-43ad-b4ff-5aa5c9272aa0', path: '', url: 'http://192.168.190.188:8040/')], contextPath: '/learn-jenkins4', war: 'target/*.war'
                echo "deploy success!!!"
            }
        }
    }
}