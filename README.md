# Hibernate CRUD Application

## 📌 Overview

This project demonstrates how to perform CRUD (Create, Read, Update, Delete) operations using Hibernate ORM with MySQL Database. Hibernate simplifies database interaction by mapping Java objects to relational database tables.

---

## 🚀 Features

* Create Student Records
* Read Student Records
* Update Student Records
* Delete Student Records
* Hibernate ORM Integration
* MySQL Database Connectivity
* JPA Annotations

---

## 🛠️ Tech Stack

* Java 17
* Hibernate ORM
* MySQL
* Maven
* JPA

---

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   ├── Main.java
│   │   └── Student.java
│   └── resources
│       └── hibernate.cfg.xml
└── pom.xml
```

## 🗄️ Database Configuration

Create a database:

```sql
CREATE DATABASE studentdb;
```

Configure `hibernate.cfg.xml`:

```xml
<property name="hibernate.connection.driver_class">
com.mysql.cj.jdbc.Driver
</property>

<property name="hibernate.connection.url">
jdbc:mysql://localhost:3306/studentdb
</property>

<property name="hibernate.connection.username">
root
</property>

<property name="hibernate.connection.password">
your_password
</property>
```

## ▶️ How to Run

### Clone Repository

```bash
git clone https://github.com/your-username/hibernate-crud-app.git
```

### Navigate to Project

```bash
cd hibernate-crud-app
```

### Run Application

Run `Main.java`

---

## 📖 Hibernate Workflow

1. Configure Hibernate
2. Build SessionFactory
3. Open Session
4. Begin Transaction
5. Perform CRUD Operation
6. Commit Transaction
7. Close Session

---

## 📸 Sample Output

```text
Student Saved Successfully

Student Retrieved Successfully

Student Updated Successfully

Student Deleted Successfully
```

---

## 🎯 Learning Objectives

* Understand Hibernate Architecture
* Learn ORM Concepts
* Work with SessionFactory and Session
* Perform CRUD Operations
* Connect Java Applications with MySQL

---

## 👨‍💻 Author

**Anupam Bhunia**

---

## 📄 License

This project is for learning and educational purposes.
