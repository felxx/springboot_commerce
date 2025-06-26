# Spring Boot E-commerce API

An e-commerce system project developed with Java and the Spring Boot framework. This project establishes a RESTful API for managing users, products, categories, and orders.

---

## ⚡ Features

- RESTful API for core e-commerce functionalities.
- CRUD operations for Users (Create, Read, Update, Delete).
- Endpoints to retrieve Products, Categories, and Orders.
- A pre-configured test profile for easy setup and demonstration.
- Centralized exception handling for API errors.

---

## ⚙️ Tech Stack

- Java 24
- Spring Boot 3.5.3
- Hibernate
- H2 In-Memory Database
- Maven

---

## 🚀 Getting Started
Prerequisites:
- Java Development Kit (JDK) version 24 or later.
- Apache Maven.

Installation & Running the Application
Clone the repository:

Bash

```
git clone <your-repository-url>
cd springboot-commerce
```

Run the application using the Maven wrapper:

```
./mvnw spring-boot:run
```

The application will start on http://localhost:8080. The test profile is active by default, which will populate the H2 database with sample data from the TestConfig.java class.
