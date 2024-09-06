def call(String name,String ImageName){
    sh "docker run -d --name ${name} -p 3000:3000 sunkarisomasekhar/${ImageName}:latest"
}