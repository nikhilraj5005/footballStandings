pipeline {
      environment { 
        registry = "nikhilraj50005/football-standings" 
        registryCredential = 'nikhilraj50005'
        dockerImage = '' 
    }
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {
        stage ('Initialize') {
            steps {
                git 'https://github.com/nikhilraj5005/footballStandings.git'
                bat '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage ('Build maven') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true install' 
            }
        }
        stage('Building docker image') { 
            steps { 
                script { 
                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 
                }
            } 
        }
        stage('Deploy docker image') { 
            steps { 
                script { 
                    docker.withRegistry( '', registryCredential ) { 
                        dockerImage.push() 
                    }
                } 
            }
        } 
    }
}
