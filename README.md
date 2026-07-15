# 📚 DSA Tracker Backend

A **Spring Boot REST API** application that helps users track their **Data Structures and Algorithms (DSA)** problem-solving journey. It enables users to securely manage solved problems, monitor progress, and organize coding practice efficiently.

---

# 🚀 Features

## 🔐 Authentication & Security

- User Registration
- User Login
- JWT Authentication
- Spring Security
- Password Encryption (BCrypt)

## 📋 Problem Management

- Add a new problem
- Get all problems
- Get problem by ID
- Update problem
- Partial Update (PATCH)
- Delete problem

## 🔍 Filtering & Pagination

- Filter problems by difficulty
- Filter problems by platform
- Pagination support

## 📊 Dashboard & Statistics

- Monthly solved problems statistics
- Track solved problems by difficulty
- Store problem links
- Dashboard summary API

## ⚙️ Other Features

- Global Exception Handling
- Input Validation
- Swagger API Documentation
- SLF4J Logging
- RESTful API Design

---

# 🛠️ Tech Stack

## Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- Maven
- REST APIs

## Database

- MySQL

## Deployment

- Docker
- Google Cloud VM (Compute Engine)

## Tools

- IntelliJ IDEA / STS
- Postman
- Swagger UI
- Git & GitHub

---

# 📂 Project Structure

```
tracker
│
├── src
│   └── main
│       └── java
│           └── com.dsa.tracker
│               ├── controller
│               ├── dto
│               ├── entity
│               ├── exception
│               ├── repository
│               ├── security
│               ├── service
│               └── TrackerApplication.java
│
└── resources
    └── application.yml
```

---

# ⚙️ API Endpoints

## Authentication

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/auth/register` | Register User |
| POST | `/auth/login` | Login User |

## Problem APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/problems` | Get All Problems |
| GET | `/problems/{id}` | Get Problem By ID |
| POST | `/problems` | Add New Problem |
| PUT | `/problems/{id}` | Update Problem |
| PATCH | `/problems/{id}` | Partial Update |
| DELETE | `/problems/{id}` | Delete Problem |

## Filter APIs

| Method | Endpoint |
|---------|----------|
| GET | `/problems/difficulty/{difficulty}` |
| GET | `/problems/platform/{platform}` |

## Pagination

| Method | Endpoint |
|---------|----------|
| GET | `/problems/paged?page=0&size=5` |

## Dashboard

| Method | Endpoint |
|---------|----------|
| GET | `/problems/dashboard` |

---

# 🗄️ Database Configuration

Update the database configuration in:

```
src/main/resources/application.yml
```


The application supports both environment variables and default values.

Example:

```yaml
spring:
  datasource:
    url: ${SPRING_DATASOURCE_URL:jdbc:mysql://localhost:3306/dsa_tracker}
    username: ${SPRING_DATASOURCE_USERNAME:root}
    password: ${SPRING_DATASOURCE_PASSWORD:root}
```

If environment variables are not provided, the application uses:

- Database: `dsa_tracker`
- Username: `root`
- Password: `root`

---

# ▶️ Running the Application

Clone the repository

```bash
git clone https://github.com/Ratnmala1007/dsa-tracker-backend.git
```

Navigate to the project

```bash
cd tracker
```

Build the project

```bash
mvn clean install
```

Run the application

```bash
mvn spring-boot:run
```

---

# 🐳 Docker

Build Docker Image

```bash
docker build -t dsa-tracker .
```

Run Docker Container

```bash
docker run -p 8080:8080 dsa-tracker
```

---

# ☁️ Deployment

The application is successfully deployed on **Google Cloud Compute Engine** using Docker.

Deployment includes:

- Docker Containerization
- Google Cloud VM
- MySQL Database
- Linux Environment
- Swagger UI

---

# 📖 API Documentation

After starting the application, open:

```
http://localhost:8080/swagger-ui/index.html
```

For deployed application:

```
http://35.200.189.74/:8080/swagger-ui/index.html
```

---

# 🎯 Project Purpose

This project was developed to strengthen backend development skills using Spring Boot while tracking DSA problem-solving progress.

It demonstrates:

- REST API Development
- Spring Security
- JWT Authentication
- CRUD Operations
- Pagination
- Filtering
- Validation
- Exception Handling
- Logging
- MySQL Integration
- Docker Deployment
- Google Cloud Deployment

---

# 👩‍💻 Author

**Ratnmala Shendge**

Java Full Stack Developer

GitHub:
https://github.com/Ratnmala1007


