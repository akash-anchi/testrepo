pipeline{
    agent any
    stages{
        stage('clone repository'){
            steps{
                git 'https://github.com/akash-anchi/testrepo.git'
            }
        }
        stage('build'){
            steps{
                sh 'pip install -r requirements.txt'
            }
        }
        stage('test'){
            steps{
                sh 'pytests test/'
            }
        }
    }      
}