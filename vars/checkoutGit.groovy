def call(String gitUrl,String gitbranchName ){
    checkout(
    [
        $class:'GitSCM',
        branches: [[name: gitbranchName]],
         userRemoteConfigs: [[url: gitUrl]]
    ]
    )
}