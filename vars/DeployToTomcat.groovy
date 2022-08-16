def call()
{
powershell label: '', script: '''
$vm = Get-Content output.txt
echo $vm '''
bat label:'', script: 'scp ./LoginWebApp.war arti@13.65.198.208:/opt/tomcat/9_37/webapps'
}
