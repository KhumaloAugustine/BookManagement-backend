# bookmanagement

You'll need [Java 11 or 17](https://www.oracle.com/java/technologies/downloads/).

Clone this repo and execute `mvnw spring-boot:run`. Or inside an IDE, execute the class `com.augustinekhumalo.bookmanagement.BookManagementApplication`.

To access the database, you can go to [http://localhost:8080/h2-console/login.jsp](http://localhost:8080/h2-console/login.jsp) and enter the following information:
- JDBC URL: jdbc:h2:mem:testdb
- User Name: sa
- Password: <blank>

Or go to [http://localhost:8080/graphiql](http://localhost:8080/graphiql) to start executing queries. For example:
```
{
  findAllBooks": [
            {
                "id": "1",
                "title": "Java: A Beginner's Guide, Sixth Edition",
                "description": "A comprehensive guide to Java programming",
                "author": {
                    "id": "1",
                    "name": "Herbert Schildt",
                    "__typename": "Author"
                },
                "__typename": "Book"
            }
}

# Extras

  * Launch with `mvn spring-boot:run`
  * Open a browser to view UIs at the following links:
    * [GraphiQL](http://localhost:8080/graphiql)
  

