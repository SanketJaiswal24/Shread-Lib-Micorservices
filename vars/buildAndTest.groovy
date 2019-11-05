def buildAndTest(){
    stage("Backend tests"){
        sh "mvn test"
    }
}