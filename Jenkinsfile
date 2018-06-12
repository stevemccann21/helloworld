pipeline {
    agent any
    environment {
        mavenHome = tool 'Maven'
    }
    tools {
        maven 'Maven'
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
    }
}
