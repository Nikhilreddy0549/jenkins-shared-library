def call(String imageName = 'myapp:latest') {
    echo "Building Docker image: ${imageName}"

    sh "docker build -t ${imageName} ."
}
