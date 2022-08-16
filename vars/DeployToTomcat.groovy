def call()
{
powershell label: '', script: '''
$vm = Get-Content output.txt
scp ./LoginWebApp.war arti@${vm}:/opt/tomcat/9_37/webapps
'''
}
