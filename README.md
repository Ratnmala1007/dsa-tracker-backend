📚 DSA Tracker Backend

A Spring Boot REST API application that helps users track their Data Structures and Algorithms (DSA) problem-solving journey. It allows users to securely manage solved problems, monitor progress, and organize practice efficiently.

🚀 Features

🔐 Authentication & Security
User Registration
User Login
JWT Authentication
Spring Security
Password Encryption (BCrypt)

📋 Problem Management
Add a new problem
Get all problems
Get problem by ID
Update problem
Partial update (PATCH)
Delete problem

🔍 Filtering & Pagination
Filter problems by difficulty
Filter problems by platform
Pagination support

📊 Dashboard & Statistics
Monthly problem-solving statistics
Track solved problems
Track problem difficulty
Store problem links

⚙️ Other Features
Global Exception Handling
Input Validation
Swagger API Documentation
SLF4J Logging
RESTful API Design
---

🛠️ Tech Stack
Backend
Java 21
Spring Boot
Spring Security
Spring Data JPA
Hibernate
Maven
REST APIs

Database
MySQL

Tools
IntelliJ IDEA / Spring Tool Suite (STS)
Postman
Swagger UI
Git & GitHub

---

## 📂 Project Structure

tracker
├──src
 ├──com.dsa.tracker
 ├── com.dsa.tracker.controller
 ├── com.dsa.tracker.dto
 ├── com.dsa.tracker.entity
 ├── com.dsa.tracker.exception
 ├── com.dsa.tracker.repository
 └── com.dsa.tracker.security
 └── com.dsa.tracker.service

---

## ⚙️ API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /auth/register | register the user
| POST | /auth/login | login the user
| GET | /problems | Get all problems |
| POST | /problems | Add new problem |
| PUT | /problems/{id} | Update problem |
| DELETE | /problems/{id} | Delete problem |
| PATCH | /problems/{id} | partialupdate problem |
| GET| /problems/{id} | GET  problem by id |
| GET| /problems/difficulty/{difficulty}|Get        problems by difficulty
| GET| /problems/platform/{platform}|Get        problems by platform
|GET |/problems/paged?page=0&size=3|get problems by page number
|GET/problems/dashboard |problem get by how many solved easy,medium,hard in month




---

## 🗄️ Database Configuration

Update the database configuration in:

```properties
src/main/resources/application.yml
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/dsa_tracker
spring.datasource.username=root
spring.datasource.password=root
```

---

▶️ Running the Application

Clone the repository:

git clone <https://github.com/Ratnmala1007/dsa-tracker-backend.git 

Navigate to the project:

cd tracker

Run the application:

mvn spring-boot:run

```bash
mvn spring-boot:run
```

📖 API Documentation

After starting the application, open:

<http://localhost:8080/swagger-ui/index.html

---

🎯 Project Purpose

This project was developed to strengthen backend development skills using Spring Boot and to provide an efficient way to track DSA problem-solving progress. It demonstrates authentication, authorization, REST API development, pagination, filtering, validation, exception handling, logging, and database integration.
---

## 👩‍💻 Author

Ratnmala Shendge
Java Full Stack Developer
<https://github.com/Ratnmala1007