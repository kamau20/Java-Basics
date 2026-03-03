pipeline {
    agent any

    triggers {
        githubPush()
    }

    tools {
        maven 'Maven'   // Make sure Maven3 is configured in Jenkins Global Tools
    }

    environment {
        BUILD_DIR = "built"
        REPO_URL = "https://github.com/kamau20/Java-Basics.git"
        BRANCH = "main"
        PROJECT_DIR = "country-name"
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: "${BRANCH}",
                    credentialsId: 'GitHubToken',
                    url: "${REPO_URL}"
            }
        }

        stage('Build with Maven') {
            steps {
                dir("${PROJECT_DIR}") {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Create built Directory') {
            steps {
                sh '''
                    mkdir -p ${BUILD_DIR}
                    cp ${PROJECT_DIR}/target/*.jar ${BUILD_DIR}/
                '''
            }
        }
    }

    post {
        success {
            echo "Build successful. .jar stored in built/"
            archiveArtifacts artifacts: 'built/*.jar', fingerprint: true
        }
        failure {
            echo "Build failed"
        }
    }
}