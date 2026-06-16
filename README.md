# Ecommerce Spring Boot API

This project is a backend e-commerce application built using Spring Boot. The goal was to understand how modern backend applications handle authentication, database operations, business logic, and API development.

While working on this project, I explored concepts such as JWT authentication, Spring Security, JPA/Hibernate relationships, REST API design, and database management using H2.

## What I Built

The application includes APIs for:

- User registration and login
- JWT-based authentication
- Product management
- Category management
- Shopping cart operations
- Order management
- Image handling
- User role management

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Lombok
- ModelMapper

## Project Structure

The application follows a layered architecture:

```text
Controller → Service → Repository → Database
```

- Controllers handle incoming requests
- Services contain business logic
- Repositories interact with the database
- Entities represent database tables

## Authentication Flow

1. User registers using the registration API.
2. User logs in with email and password.
3. Server validates credentials.
4. JWT token is generated and returned.
5. Protected APIs require the token in the Authorization header.

## Running the Project

Clone the repository:

```bash
git clone https://github.com/Vivekr0102/ecommerce-springboot.git
```

Move into the project directory:

```bash
cd ecommerce-springboot
```

Run the application:

```bash
mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

H2 Console:

```text
http://localhost:8080/h2-console
```

## What I Learned

This project gave me practical experience with:

- Building REST APIs
- Spring Boot project structure
- Authentication and authorization
- Database relationships using JPA
- Exception handling
- Dependency injection
- Debugging backend applications
- Working with Git and GitHub

## Future Improvements

Some areas I would like to improve in future versions:

- Swagger/OpenAPI documentation
- MySQL/PostgreSQL integration
- Docker support
- Unit and integration testing
- Deployment to a cloud platform

## Author

Vivek Rathod

GitHub: https://github.com/Vivekr0102
