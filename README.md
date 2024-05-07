# Spring Boot with Springdoc-OpenAPI
Springdoc-OpenAPI is a powerful library that simplifies the process of generating OpenAPI (formerly Swagger) documentation for your Spring Boot 3 REST APIs. This documentation serves as a valuable tool for both developers and API consumers, providing clear insights into API endpoints, request/response structures, and authentication methods.

### Spring Boot Swagger Gradle dependency
– **For Spring Boot 3:**
To use Swagger 3 in your Gradle project, you need to add the springdoc-openapi-starter-webmvc-ui dependency to your project’s build.gradle file:
```
implementation group: 'org.springdoc', name: 'springdoc-openapi-starter-webmvc-ui', version: '2.5.0'
```
– **For Spring Boot 2:**
With earlier version of Spring Boot, you can use springdoc-openapi-ui dependency:
```
implementation group: 'org.springdoc', name: 'springdoc-openapi-ui', version: '1.6.15'
```
### Run and Check
- Run Spring Boot project and hit url: http://localhost:8080/swagger-ui/index.html to access swagger.
- To see document in Json format hit url: http://localhost:8080/v3/api-docs

### Swagger Configuration in Spring Boot
```
#Open Api Swagger
openapi.dev-url=http://localhost:8080
# replace with prod url
openapi.prod-url=http://localhost:8080 
springdoc.swagger-ui.path=/swagger-ui.html
springdoc.api-docs.path=/api-docs
springdoc.packages-to-scan=com.developer.controller
springdoc.swagger-ui.tryItOutEnabled=true
springdoc.swagger-ui.operationsSorter=method
springdoc.swagger-ui.tagsSorter=alpha
springdoc.swagger-ui.filter=true
#springdoc.api-docs.enabled=false
#springdoc.swagger-ui.enabled=false
```

– Use **api-docs.enabled=false** if you want to disable springdoc-openapi endpoints.
– Use **swagger-ui.enabled=false** to disable the swagger-ui endpoint.

– **api-docs.path** is for custom path of the OpenAPI documentation in Json format. Now it is http://localhost:8080/api-docs.

– **swagger-ui.path** is for custom path of the Swagger documentation. If you visit http://localhost:8080/swagger-ui.html, the browser will redirect you to http://localhost:8080/swagger-ui/index.html

– **packages-to-scan=packageA,packageB:** list of packages to scan with comma separated. We also have **packages-to-exclude, paths-to-match, paths-to-exclude.**

– **swagger-ui.tryItOutEnabled** if you want to enable “Try it out” section by default.
– **swagger-ui.operationsSorter:** ‘alpha’ (sort by paths alphanumerically), ‘method’ (sort by HTTP method) or a function.
– **swagger-ui.tagsSorter:** ‘alpha’ (sort by paths alphanumerically) or a function.

– **swagger-ui.filter:** true/false to enable or disable filter the tagged operations. We can set a string, the filtering will be enabled using that string as the filter expression which is case sensitive matching anywhere inside the tag.

**You can also use enable-spring-security, enable-hateoas, enable-data-rest... etc.**

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.3/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.3/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.3/reference/htmlsingle/index.html#web)
* [Springdoc-openapi Properties](https://springdoc.org)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

