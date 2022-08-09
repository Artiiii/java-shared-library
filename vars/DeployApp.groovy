def call()
{
powershell  label: '', script: 'Copy-Item "target/war.app.war" "H:/apache-tomcat-10.0.23-windows-x64/apache-tomcat-10.0.23/webapps" -Force -Verbose'
}
