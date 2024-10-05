@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Git checkOut') {
            steps {
                gitCheckOut{
                 url: "https://github.com/Srinu-rj/spring-food-app.git",
                 branch: "main"

                }

            }
        }
    }
}
