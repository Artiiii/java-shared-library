def call()
{
  bat """
  cd 'C:\Users\Arti Pal\Documents\tools\apache-tomcat-10.0.23-windows-x64\apache-tomcat-10.0.23\bin'
  shutdown
  """
  bat """
  cd 'C:\Users\Arti Pal\Documents\tools\apache-tomcat-10.0.23-windows-x64\apache-tomcat-10.0.23\bin'
  startup
  """
}
