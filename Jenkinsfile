@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Git checkOut') {
            steps {
                script {
                    // Proper way to pass named parameters to a method in Groovy
                    gitCheckOut(
                        branch: 'master',
                        url: 'https://github.com/Srinu-rj/spring-food-app.git'
                    )
                }
            }
        }
    }
}

//
// @Library('my-shared-library') _
//
// pipeline {
//     agent any
//
//     stages {
//         stage('Git checkOut') {
//             steps {
//                 script {
//                     // Proper method invocation for Git checkout
//                     gitCheckOut(
//                         url: 'https://github.com/Srinu-rj/spring-food-app.git',
//                         branch: 'main'
//                     )
//                 }
//             }
//         }
//     }
// }