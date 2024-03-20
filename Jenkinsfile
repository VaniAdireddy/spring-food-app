pipeline {
    agent any

    stages {
        stage('Git ChequOut') {
            steps {
             git credentialsId: 'github-auth', url: 'https://github.com/Srinu-rj/spring-food-app.git'
            }
        }
        stage('Hello') {
              steps {
                echo 'Hello World'
              }
        }
    }
}
