pipeline {
    agent any
    environment {
        mavenHome = tool 'Maven'
        scannerHome = tool 'SonarQubeScanner';
    }
    stages {
        stage ('Checkout') {
            steps {
                git 'https://github.com/stevemccann21/helloworld.git'
            }
        }
        stage ('Build') {
            steps {
                echo "Maven home is ${mavenHome}"
                sh "${mavenHome}/bin/mvn -DskipTests clean package"
            }
        }
        stage ('Test') {
            steps {
                sh "${mavenHome}/bin/mvn clean install"
            }
        }
        stage('SonarQube') {
            steps {
                sh "/usr/bin/sonar-scanner/bin/sonar-scanner -Dsonar.projectKey=hello_world -Dsonar.sources=. -Dsonar.host.url=http://jenkins:9000 -Dsonar.login=helloworld"
            }
        }
    }
}
