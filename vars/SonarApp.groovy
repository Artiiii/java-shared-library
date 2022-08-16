def call()
{
bat label: '', script: """mvn clean verify sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=${login}"""
}
