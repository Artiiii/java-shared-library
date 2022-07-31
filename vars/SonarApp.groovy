def call()
{
bat label: '', script: 'mvn clean verify sonar:sonar -Dsonar.projectKey=ar.sample.java.war.app -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_8d416d2a6afd97b608af543e2f6dc823ff237754'
}
