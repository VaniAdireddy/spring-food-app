@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Git checkOut') {
            steps {
                gitCheckOut{
                 branch: "main",
                 url: "https://github.com/Srinu-rj/spring-food-app.git"

                }

            }
        }
    }
}
