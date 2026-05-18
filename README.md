# DSA Tracker

A Backend web application to track Data Structures and Algorithms (DSA) problem-solving progress.

## 🚀 Features

- Add DSA problems
- Update problem status
- Delete solved problems
- Track difficulty level
- Store problem links
- REST API integration
- MySQL database connectivity

---

## 🛠️ Technologies Used

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST API
- Maven

### Database
- MySQL

---

## 📂 Project Structure

tracker
├──src
 ├──com.dsa.tracker
 ├── com.dsa.tracker.controller
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

## ▶️ Run the Project

### Backend

```bash
mvn spring-boot:run
```


---

## 📸 Project Purpose

This project was created to improve problem-solving consistency and track DSA practice progress efficiently.

---

## 👩‍💻 Author

Ratnmala Shendge
