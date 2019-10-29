pipelne {
    agent any
    stages {
        stage ('Checkout ') {
            steps {
                checkout scm
            }
        }
        stage ('Build') {
            steps {
                echo 'Builiding'
            }
        }
        stage ('Deploy') {
            steps {
                echo ('Deploying')
            }
        }
    }
}