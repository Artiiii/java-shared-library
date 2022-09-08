def call(user, passwd)
{
ip = powershell label:'', script: 'Get-Content output.txt', returnStdout: true
remote = [:]
remote.name = 'azurevm'
remote.user = user
remote.password = passwd
remote.allowAnyHosts = true
remote.host = ip
sshPut remote: remote, from: 'LoginWebApp.war', into: '/opt/tomcat/9_37/webapps'
}
