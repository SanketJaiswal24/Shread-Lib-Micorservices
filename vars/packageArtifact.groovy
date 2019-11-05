def packageArtifact(){
    stage("Package artifact") {
        sh "mvn package"
    }
}