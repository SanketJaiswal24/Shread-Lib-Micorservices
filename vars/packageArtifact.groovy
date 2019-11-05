def call()
{
    stage("Package artifact") {
        sh "mvn package"
    }
}