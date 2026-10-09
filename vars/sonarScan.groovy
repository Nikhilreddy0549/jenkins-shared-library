def call() {
    echo 'Running SonarQube analysis'

    withSonarQubeEnv('SonarQube') {
        sh 'mvn -B sonar:sonar'
    }
}
