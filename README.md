# Spring Boot multiple modules
This project is a Spring Boot application structured into multiple modules for improved maintainability, reusability, and modularity. It leverages Gradle as the build system.

## Project Structure
A typical layout for a Gradle-based Spring Boot multi-module project looks like this:

```
project-root/
├── settings.gradle    # Includes all child modules
├── build.gradle        # Top-level Gradle configuration
├── module-a/
│   ├── build.gradle      # Module-specific build configuration
│   └── src/main/java/...  # Java source code for module-a
├── module-b/
│   ├── build.gradle      # Module-specific build configuration
│   └── src/main/java/...  # Java source code for module-b
└── ...                   # Additional modules as needed
```
This is a flexible structure, and you can adapt it to your project's needs. Common module types include:

- **Model:** Contains domain objects (entities) representing business concepts.
- **Service:** Encapsulates business logic and interactions with other modules or external systems.
- **Repository:** Handles data persistence using repositories or data access objects (DAOs).
- **API:** Provides a well-defined interface for exposing services or functionalities to other applications.
- **Web:** Implements the web layer with controllers, views, and resources for handling HTTP requests.

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

