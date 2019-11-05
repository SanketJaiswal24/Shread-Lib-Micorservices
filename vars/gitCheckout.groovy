
checkout([
    $class: 'GitSCM', 
    branches: [[name: '*/master']], 
    doGenerateSubmoduleConfigurations: false, 
    extensions: [], 
    submoduleCfg: [], 
    userRemoteConfigs: [[credentialsId: '6d188a18-bd4c-4443-b424-6cc27c223e66', url: 'git@github.com:SanketJaiswal24/Shread-Lib-Micorservices.git']]
    ])
