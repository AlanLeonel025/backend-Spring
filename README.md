**Examen Cash**

Tecnologías usadas:

- Java 8

- SpringBoot (MVC y JPA)

- Hibernate

- Base de Datos MySQL.

- Repositorio Git para la entrega del código (se recomienda Bitbucket o Github)

Repositorio Git: https://github.com/AlanLeonel025/backend-Spring

**Apis:**

- USER:

**GET-user**

http://localhost:8080/users/1

**POST-user**

http://localhost:8080/users

{

"first_name":"Leonel",

"last_name":"Gonzalez",

"email":"cash3@cash3.com"

}

**DELETE-user**

https://localhost:8080/users/12

- LOANS

https://localhost:8080/loans?limit=0&offset=0&user_id=1

<hr>

Para levantar la aplicacion localmente con una base vacia, descargar el proyecto, importarlo en un ide como maven project, importar la base de datos mysql que adjunte al proyecto (rest_Spring.sql).


spring.datasource.url=jdbc:mysql://localhost:3306/rest_Spring

spring.datasource.username=root

spring.datasource.password=root
