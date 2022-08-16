def call()
{
powershell label:'', script:'Invoke-WebRequest -Method GET "http://localhost:8081/service/rest/v1/search/assets/download?sort=version&repository=maven-snapshots&maven.groupId=com.javawebtutor&maven.artifactId=LoginWebApp&maven.extension=war"  -ContentType "application/json" -OutFile LoginWebApp.war'
}
