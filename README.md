# Library Management System

[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Database](https://img.shields.io/badge/Database-MySQL-blue)](https://www.mysql.com/)

**Academic Project / Assignment**

## Overview
This repository contains a robust Library Management System developed in Java. Originally created as an academic assignment, this application serves as a practical implementation of Object-Oriented Programming (OOP) principles and relational database management. 

The system leverages the Java Database Connectivity (JDBC) framework via the `java.sql` package to perform CRUD (Create, Read, Update, Delete) operations on a local MySQL database. It provides a comprehensive command-line interface for managing library inventory, user records, and borrowing transactions.

## Key Features
The application supports the following core operations:
* **Inventory Management:** Add new books to the database and view the complete library catalog.
* **User Management:** Register new users/students into the system.
* **Transaction Processing:** Handle the borrowing and returning of books, dynamically updating their status.
* **Search Functionality:** Query the database to find specific books using either the Book ID or the Book Title.
* **Availability Tracking:** Real-time checking of a book's current availability status within the library.

## Technical Stack
* **Language:** Java
* **Database:** MySQL
* **API/Framework:** JDBC (`java.sql`)

## Database Architecture
The application is configured to interact with a local MySQL server. The schema consists of:
* **Database Name:** `student`
* **Tables:**
  * `user`: Stores registered member data.
  * `book`: Stores library inventory and availability metadata.

## Local Installation & Setup

### 1. Prerequisites
* **Java Development Kit (JDK):** Ensure Java is installed and added to your system path.
* **MySQL Server:** Install and configure a local MySQL database instance.
* **JDBC Driver:** Ensure the MySQL Connector/J is included in your project's build path/classpath.

### 2. Database Initialization
Before running the application, you must configure your local database:
1. Open your MySQL client (e.g., MySQL Workbench or CLI).
2. Create a new database named `student`.
3. Create the required tables (`user` and `book`) ensuring the attributes match the expected inputs in the Java application.

### 3. Application Configuration
You must link the Java application to your specific local database instance:
1. Open the project in your preferred Java IDE (Eclipse, IntelliJ IDEA, VS Code).
2. Locate the `DB` class (or the class handling the database connection).
3. Update the connection string with your local MySQL credentials:
   * **URL:** `jdbc:mysql://localhost:3306/student`
   * **Username:** *Your MySQL username (e.g., root)*
   * **Password:** *Your MySQL password*

### 4. Execution
Once the database is configured and the credentials are updated, compile and run the main application file through your IDE or via the terminal:

```bash
javac *.java
java Main
