def COLOR_MAP = [
    'FAILURE' : 'danger',
    'SUCCESS' : 'good'
]

post {
    always {
        echo 'Slack Notifications'
        slackSend (
            channel: '#channel name',   #change your channel name
            color: COLOR_MAP[currentBuild.currentResult],
            message: "*${currentBuild.currentResult}:* Job ${env.JOB_NAME} \n build ${env.BUILD_NUMBER} \n More info at: ${env.BUILD_URL}"
        )
    }
}