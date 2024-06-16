BookManagement
Welcome to the BookManagement project! This repository contains both the frontend and backend applications for managing books and authors.

Backend (BookManagement-backend)
The backend provides a GraphQL API for managing books and authors. It is built using Java and Spring Boot.

Prerequisites
Java: Ensure you have Java 11 or 17 installed.
Database: The application uses an in-memory H2 database.
Getting Started
Follow these steps to set up and run the backend:

Clone the repository:

bash
Copy code
git clone https://github.com/KhumaloAugustine/BookManagement-backend.git
cd BookManagement-backend
Run the application:

Using Maven:

bash
Copy code
./mvnw spring-boot:run
Using an IDE:
Execute the BookManagementApplication class.

Access the database:

H2 Console: Open http://localhost:8080/h2-console/login.jsp
JDBC URL: jdbc:h2:mem
User Name: sa
Password: (leave it blank)
GraphQL Endpoint:

GraphiQL UI: Open http://localhost:8080/graphiql
Example Query:
graphql
Copy code
{
  findAllBooks {
    id
    title
    description
    author {
      id
      name
    }
  }
}
Contributing
Contributions to the backend are welcome! If you'd like to contribute to this project, please follow these guidelines:

Fork the repository and create your branch from main.
Make your changes, test thoroughly.
Ensure your code follows the project's coding style.
Create a pull request with a clear description of your changes.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
Augustine Khumalo - Email

Backend Project Link: https://github.com/KhumaloAugustine/BookManagement-backend

Frontend (BookManagement-frontend)
The frontend application provides a user interface to interact with the BookManagement backend.

Prerequisites
Node.js: Ensure you have Node.js installed.
Getting Started
Follow these steps to set up and run the frontend:

Clone the repository:

bash
Copy code
git clone https://github.com/KhumaloAugustine/BookManagement-frontend.git
cd BookManagement-frontend
Install dependencies:

bash
Copy code
npm install
Run the application:

bash
Copy code
npm start
This will start the frontend application on http://localhost:3000.

Features
Manage Books: Add, update, delete books.
Manage Authors: Add authors and associate them with books.
User Interface: Intuitive UI for managing books and authors.
Contributing
Contributions to the frontend are welcome! If you'd like to contribute to this project, please follow these guidelines:

Fork the repository and create your branch from main.
Make your changes, test thoroughly.
Ensure your code follows the project's coding style.
Create a pull request with a clear description of your changes.
License
This project is licensed under the MIT License - see the LICENSE file in the frontend repository for details.

Contact
Augustine Khumalo - Email

Frontend Project Link: https://github.com/KhumaloAugustine/BookManagement-frontend

