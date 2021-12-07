# QueryIT
QueryIT is a platform used to manipulate data from a database.

Due the fact that is a faculty project, I tried to implement as much as possible, most of the technologies which are used to perform a stable project, using latest versions.

Stack used in this project is:

* Java with Spring, Spring Boot, to perform backend part
* Database is a PostgreSQL, connected using Hibernate and HikariCP (Already implemented by Spring). To acces data from database I used JPA Repositories. I wanted to version database, so I used flyway for that. When application runs, flyway execute .sql files and database is populated with tables and data. 
* Typescript with Angular, to perform frontend part
* I wanted to containerize the app, so I used Docker for that. Due the fact I needed a database, I host database on docker, using one container and another for running the app. This thing is possible having a docker-compose, a thing that Docker uses if I want to have more containers for an app.

QueryIT is based on microservices, is not a monolith and looks like that:

![](https://mermaid.ink/img/eyJjb2RlIjoiZ3JhcGggTFJcbiAgICBBW1F1ZXJ5SVRdIC0tPiBCe0JhY2tlbmR9XG4gICAgQiAtLT4gQ1tDb3JlXVxuICAgIEIgLS0-IERbQXV0aF1cbiAgICBBIC0tPiBFe0Zyb250ZW5kfVxuICAgIEUgLS0-IEZbQ29yZV0iLCJtZXJtYWlkIjp7InRoZW1lIjoiZGVmYXVsdCJ9LCJ1cGRhdGVFZGl0b3IiOmZhbHNlfQ)

Every microservice is part of this project as submodule and can be found on the project, if you click on them and you will be redirected to their repositories where you will found files of every microservice.

I wanted to have some reports about code and in every microservice you will found Code Quality Core and Code Grade, performed by Codiga.

When I writed code, I was careful to avoid some [pitfalls](https://thorben-janssen.com/lombok-hibernate-how-to-avoid-common-pitfalls/):
- Don’t Use @EqualsAndHashCode
- Be Careful with @ToString (Not use on @OneToMany and @ManyToOne)
- Avoid @Data
- Every Entity class should implement Serializable