def call()
{
  bat "start C:/Windows/System32/cmd.exe /c 'C:/Users/Arti Pal/Documents/tools/apache-tomcat-10.0.23-windows-x64/apache-tomcat-10.0.23/bin/shutdown.bat'"
  // "C://Users//Arti Pal//Documents//tools//apache-tomcat-10.0.23-windows-x64//apache-tomcat-10.0.23//bin//startup.bat"
  powershell label: "" , script: "Start-Sleep 4"
  bat label: "", script: "C://Users//Arti Pal//Documents//tools//apache-tomcat-10.0.23-windows-x64//apache-tomcat-10.0.23//bin//startup.bat"
}
