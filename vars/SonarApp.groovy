def call()
{
bat label: '', script: 'H:\\apache-maven-3.8.6-bin\\apache-maven-3.8.6\\bin\\mvn.cmd clean verify sonar:sonar -Dsonar.projectKey=ar.sample.java.war.app -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_4c372e2dd6aa7368d2c087c624a1f687aaf1f456'
}
