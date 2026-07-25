# JapanLearn 🇯🇵

A full-stack Japanese N5 vocabulary quiz app built with Spring Boot + MySQL.

## Features
- 30 N5 vocabulary flashcards
- Quiz mode with reveal button
- Score tracker (correct / wrong / total)
- REST API backend
- Japanese charset support (utf8mb4)

## Tech Stack
- **Backend**: Java Spring Boot 4.1
- **Database**: MySQL 8 with JPA/Hibernate
- **Frontend**: HTML, CSS, JavaScript
- **Build Tool**: Maven

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/vocabulary | Get all words |
| GET | /api/vocabulary/random | Get random word |
| GET | /api/vocabulary/{id} | Get word by ID |
| POST | /api/vocabulary | Add new word |
| DELETE | /api/vocabulary/{id} | Delete word |

## How to Run
1. Create MySQL database: `japanlearn_db`
2. Update `application.properties` with your MySQL credentials
3. Run: `./mvnw spring-boot:run`
4. Open: `http://localhost:8080`

## Developer
Vaibhav Gupta | SJBIT Bengaluru | BE-CS 2027