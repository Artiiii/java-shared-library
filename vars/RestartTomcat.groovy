def call()
{
  bat label: "", script: "call C:/Users/Arti Pal/Documents/tools/apache-tomcat-10.0.23-windows-x64/apache-tomcat-10.0.23/bin/shutdown.bat"
  powershell label: "" , script: "Start-Sleep 4"
  bat label: "", script: "C://Users//Arti Pal//Documents//tools//apache-tomcat-10.0.23-windows-x64//apache-tomcat-10.0.23//bin//startup.bat"
}
