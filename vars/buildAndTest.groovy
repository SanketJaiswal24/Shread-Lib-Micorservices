def call()
{
    stage("Backend tests"){
        sh "mvn test"
}
}