def call()
{
  //cp "target/war.app.war" "C:/Users/Arti Pal/Documents/tools/apache-tomcat-10.0.23-windows-x64/apache-tomcat-10.0.23/webapps"
  
  fileOperations([fileCopyOperation(
  excludes: '',
  flattenFiles: false,
  includes: 'target/war.app.war',
  targetLocation: "C:/Users/Arti Pal/Documents/tools/apache-tomcat-10.0.23-windows-x64/apache-tomcat-10.0.23/webapps"
)])
}
