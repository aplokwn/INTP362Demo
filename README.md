# INTP362Demo

<a name="readme-top"></a>

<br />
<div align="center">
  <a href="https://github.com/aplokwn/INTP362Demo">

  </a>

<h3 align="center">Spring Boot CRUD web via Database Sample</h3>

  <p align="center">
    Spring Boot CRUD web via Database Sample for in-class tutorial blog
    <br />
    <a href="https://apsslok.wordpress.com/2022/04/10/spring-boot-crud-web-via-database/"><strong>Explore the blog content »</strong></a>
    <br />
    <br />
    <a href="https://apsslok.wordpress.com/2022/04/10/spring-boot-crud-web-via-database/3/">View Demo</a>
    
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      <li><a href="#dependency">Dependency</a>
      </li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#license">License</a></li>
      </ul>
    </li>
  </ol>
</details>
<br/>

<!-- ABOUT THE PROJECT -->

## About The Project

![Product Name Screen Shot][product-screenshot]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

- [![SpringBoot][springboot]][springboot-url]
- [![Thymeleaf][thymeleaf]][thymeleaf-url]
- [![Bootstrap][bootstrap]][bootstrap-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- Dependency -->

### Dependency

```XML
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->

## Getting Started

<p>This is an example code of a Spring Boot project with CRUD web via H2 Database.</p>

### Prerequisites

For building and running the application you need:

- [JDK 1.8](https://www.oracle.com/java/technologies/downloads/#java8)
- [Maven 3](https://maven.apache.org/)
- [H2 Datatbase](https://www.h2database.com/html/main.html)
- Prefer IDE: [Eclipse](https://www.eclipse.org/ide/)
  <br/><br/>

### Installation

Running the project locally: to execute the main method in the ca.sait.itsd.HelloWorld01Application.Application class from your IDE.

1. Download the repo

2. Install Spring Boot Plugin

3. Install H2 Database

4. Unzip then import the project to IDE

5. config the application.properties
   <br/> <br/>

```
application.properties
# Application context
server.servlet.context-path=/

# H2 Console http://localhost:8080/h2-console
spring.h2.console.enabled=true

# Console path http://localhost:8080/h2
spring.h2.console.path=/h2

# H2 DB Configuration - Persist data in file
spring.datasource.url = jdbc:h2:file:C:/data/sample

#spring.datasource.url = jdbc:h2:mem:h2db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=none

spring.jpa.show-sql=true
spring.jpa.open-in-view = false
```

- Run the project, reach the broswer database at
- http://localhost:8080/h2
  <br/><br/>

  6.Run the SQL script in the H2 database.

```sql
schema.sql
DROP TABLE IF EXISTS STUDENTS;

CREATE TABLE STUDENTS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);
```

<br/>

```sql
dummydata.sql
INSERT INTO STUDENTS (firstname, lastname, email) VALUES
  ('Alice', 'Smith', 'a123@gmail.com'),
  ('Ben', 'Miller', 'b123@gmail.com'),
  ('Chase', 'Jones', 'c123@gmail.com');
```

7. Switch back to http://localhost:8080 for the CRUD page.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->

## License

Apache License, Version 2.0

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: https://raw.githubusercontent.com/aplokwn/INTP362Demo/main/image/12-1.webp
[springboot]: https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white
[springboot-url]: https://spring.io/projects/spring-boot
[bootstrap]: https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white
[bootstrap-url]: https://getbootstrap.com/
[thymeleaf]: https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white
[thymeleaf-url]: https://www.thymeleaf.org/
