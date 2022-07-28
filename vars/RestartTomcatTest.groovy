def call()
{
  powershell label: "", script: "start-sleep 10"
  bat "H://ar.sample.java.war.app//copy.bat"
}
