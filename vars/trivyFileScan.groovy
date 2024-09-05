def call(){
    sh 'trivy fs > trivtScanResults.txt'
}