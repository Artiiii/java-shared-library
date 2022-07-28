def call()
{
powershell  label: '', script: 'Copy-Item "target/war.app.war" "C:/Users/Arti Pal/Documents/tools/apache-tomcat-10.0.23-windows-x64/apache-tomcat-10.0.23/webapps" -Force -Verbose'
}
