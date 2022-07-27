def call()
{
  //cp "target/war.app.war" "C:/Users/Arti Pal/Documents/tools/apache-tomcat-10.0.23-windows-x64/apache-tomcat-10.0.23/webapps"
  
//bat label: '', script: 'xcopy "target\war.app.war" "C:\Users\Arti Pal\Documents\tools\apache-tomcat-10.0.23-windows-x64\apache-tomcat-10.0.23\webapps"'
 // bat label: '', script: 'xcopy "H:\yes.txt" "H:\tools" \Y'
powershell label: '', script: 'Copy-Item "H:/yes.txt" "H:/tools" -Force -Verbose'
//powershell  label: '', script: 'xcopy "target\war.app.war" "C:\Users\Arti Pal\Documents\tools\apache-tomcat-10.0.23-windows-x64\apache-tomcat-10.0.23\webapps"'
}
