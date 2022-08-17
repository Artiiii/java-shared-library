def call(user, passwd)
{
remote = [:]
remote.name = 'azurevm'
remote.user = user
remote.password = passwd
remote.allowAnyHosts = true
remote.host = "20.231.229.16"
sshPut remote: remote, from: 'LoginWebApp.war', into: '/opt/tomcat/9_37/webapps'
}
