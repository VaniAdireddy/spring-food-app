pipeline {
    agent any

    stages {
        stage('Git checkOut') {
            steps {
                sh 'echo Git checkOut'
                git branch: 'main', url: 'https://github.com/Srinu-rj/spring-food-app.git'
            }
        }
    }
}
