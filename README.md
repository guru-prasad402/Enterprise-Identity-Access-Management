05/08
`I Installed PostgreSQL and connected it with the Spring Boot. I completed the User Module, Role Module and implemented and tested all CRUD operations.

06/08
Created the Spring Boot 3.x project using Java 21 and configured the Maven project structure. Set up PostgreSQL for the application and initialized the Git repository by uploading the project to GitHub. Created the Entity layer for the User, Role, and Permission modules and implemented entity relationships using JPA annotations such as @OneToMany, @ManyToMany, and @JoinTable. Used Lombok annotations to reduce boilerplate code.
Completed the Repository layer implementation and created the DTO package. Implemented the Service and Controller layers and developed REST APIs for the User, Role, and Permission modules. Implemented the User–Role Assignment and Role–Permission Assignment functionalities, added a Global Exception Handler for centralized exception handling, and successfully tested all REST APIs using Postman.

07/08
Implemented Authentication and Password Recovery Features. Completed JWT Authentication using Spring Security with token generation and validation. Implemented Refresh Token generation, validation, and logout functionality. Added Forgot Password and Reset Password flow with OTP generation, verification, and expiry validation. Added OTP utility class for reusable OTP generation and tested all authentication flows using Postman.

10/08
I worked on active sessions, logout, login history, and audit logging in the IAM project. I checked the session and login history details in PostgreSQL and tested the APIs using Postman. I also worked on Swagger and tested the APIs to make sure they are working properly.

11/08
I learned the basics of Microservices, including the difference between Monolithic and Microservices architecture. I understood how services communicate with each other using HTTP and what happens when one service is unavailable also completed the practical work for User Service and Order Service. I tested the APIs successfully and checked the communication between both services.

12/08
Completed Day 2 of my Microservices learning. Today I improved my Day 1 services by working on DTOs, API responses, error handling, and configuration. I also tested service failure scenarios and verified that both services continue to communicate properly.

13/08
I learned how the User Service and Order Service communicate with each other and understood the flow of data between them. I also learned that each service owns and manages its own data, so the User Service manages user information, and the Order Service manages order information. This helped me understand the basic architecture and responsibilities of different microservices.

14/08
Today, I focused on how services handle failures and recover smoothly. I practiced timeout, retry, circuit breaker, and fallback concepts and understood how they help keep an application stable when another service is slow or unavailable.
