node {
    stage('SCM Checkout') {
        git "https://github.com/johnvarkas1/jenkins"
    }
    stage('Compile-Package') {
        sh 'mvn package'
    }
}
