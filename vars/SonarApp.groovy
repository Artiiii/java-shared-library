def call(login)
{
bat label: '', script: 'H:\\apache-maven-3.8.6-bin\\apache-maven-3.8.6\\bin\\mvn.cmd clean verify sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=$login'
}
