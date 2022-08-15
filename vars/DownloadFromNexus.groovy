def call()
{
curl -L -X GET "http://localhost:8081/service/rest/v1/search/assets/download?sort=version&repository=maven-snapshots&maven.groupId=com.javawebtutor&maven.artifactId=LoginWebApp&maven.extension=war"  -H "accept: application/json" --output LoginWebApp.war
}
