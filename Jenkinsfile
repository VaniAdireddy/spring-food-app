pipeline {
    agent any

    tools {
        jdk 'jdk17'
        maven 'maven3'
    }

    environment {
            DB_HOST = 'jdbc:mysql://localhost'   // Replace with your MySQL server host
            DB_PORT = '3306'                 // Default MySQL port
            DB_NAME = 'foodapp'              // Replace with your database name
            DB_USER = 'root'                 // Your MySQL username
            DB_PASS = 'raju'                 // Your MySQL password
    }

    stages {
        stage('Git Check Out') {
            steps {
                git branch: 'main', url: 'https://github.com/Srinu-rj/spring-food-app.git'
            }
        }
        stage('Compile') {
            steps {
                sh "mvn compile"
            }
        }

                stage('Test') {
                    steps {
                        script {
                            // Debug connectivity issues
                            sh '''
                            echo "Testing database connection..."
                            nc -zv $DB_HOST $DB_PORT || echo "Failed to connect to the database"
                            '''

                            // Run Maven tests
                            sh '''
                            mvn test -Ddb.host=$DB_HOST -Ddb.port=$DB_PORT -Ddb.name=$DB_NAME -Ddb.user=$DB_USER -Ddb.pass=$DB_PASS
                            '''
                        }
                    }
                }




//         stage('Test') {
//             steps {
//                 sh "mvn test"
//             }
//         }
    }
}