def call(String dockerHubUsername,String imageName){
    //Build docker image
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=cdf26397b6msh70be98846bcc9dep194b65jsn07a6225308e5 -t ${imageName} ."
    //Tag a docker image 
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    //Push the Docker Image
    withDockerRegistry(credentialsId: 'docker-hub-cred', url: 'https://index.docker.io/v1/') {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    // some block
}
}