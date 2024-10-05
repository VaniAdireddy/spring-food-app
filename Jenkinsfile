@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Git checkOut') {
            steps {
                script {
                    // Proper way to pass named parameters to a method in Groovy
                    gitCheckOut(
                        url: 'https://github.com/Srinu-rj/spring-food-app.git',
                        branch: 'main'
                    )
                }
            }
        }
    }
}


