# Spring Boot RestFull API 

## Description:
This is a Spring Boot RestFull API student application. It includes CRUD operations.

For DataBase connection used PostgreSQL.

Only BackEnd without any FrontEnd.

Simple application project for learning Spring Boot.

# Structure 
## Folders:
1. Service > Student Service (Java interface) - includes CRUD methods  
2. Controller > Student Controller (Java class) - includes endpoints
3. Model > Student Model (Java class) - includes student properties (name, age, email, etc.)
4. Implement > In Memory and DB Service Implement (Java classes) - includes implementation of Student Service methods
5. Repository > In Memory Student DAO and Student Repository (Java class and interface) - for storing students in memory and in DataBase

## Dependencies
1. Spring Web - for building RestFull API
2. Lombok - for decrease Getter, Setter and Constructor codes using Annotations
3. Data JPA - for data access in Java Application
4. Postgres - Driver for PostgreSQL

## Configuration
Used application.yaml file for set up.

## Endpoints:
@RequestMapping("api/v1/students") - starter endpoint

@GetMapping
("api/v1/students") - for get list of students

@PostMapping
("api/v1/students/create-student") - for create/save a student

@GetMapping
("api/v1/students/{email}") - for get student by email

@PutMapping
("api/v1/students/update-student") - for update student

@DeleteMapping
("api/v1/students/delete-student/{email}") - for delete student by email


