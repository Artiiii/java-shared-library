def remote = [:]
remote.name = 'azurevm'
//remote.host = '40.85.162.228'
remote.user = 'arti'
remote.password = 'Arti123'
remote.allowAnyHosts = true
  
def call()
{
remote.host = powershell("Get-content output.txt")
sshPut remote: remote, from: 'LoginWebApp.war', into: '/opt/tomcat/9_37/webapps'
}
