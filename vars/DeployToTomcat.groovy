def call()
{
remote = [:]
remote.name = 'azurevm'
//remote.host = '40.85.162.228'
remote.user = 'arti'
remote.password = 'Arti123'
remote.allowAnyHosts = true
remote.host = powershell script: "Get-Content output.txt", returnStdout: true
echo remote.host
sshPut remote: remote, from: 'LoginWebApp.war', into: '/opt/tomcat/9_37/webapps'
}
