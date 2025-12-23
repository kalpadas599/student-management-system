# 📘 Student Management System  
A full-stack *Spring Boot MVC* web application for managing student records with CRUD operations.  
This project demonstrates concepts of **Spring Boot, Spring MVC, Spring Data JPA, Hibernate, Thymeleaf, and MySQL**.

<img width="1892" height="779" alt="Image" src="https://github.com/user-attachments/assets/ce2da909-30d4-46af-ba6f-374ecd0ffdc2" />

## 🚀 Features

- ✔ View all students  
- ✔ Add new students  
- ✔ Edit/update student details  
- ✔ Delete students  
- ✔ MVC architecture  
- ✔ Service & Repository layers  
- ✔ JPA + Hibernate ORM  
- ✔ Thymeleaf-based UI  
- ✔ MySQL database integration  

---

## 🛠️ Technologies Used

### Backend
- Java 17  
- Spring Boot  
- Spring MVC  
- Spring Data JPA  
- Hibernate  
- MySQL  

### Frontend
- Thymeleaf  
- HTML5  
- CSS3  

### Build Tool
- Maven

### IDE
- Spring Tool Suite (STS) / Eclipse

## 🗂️ Project Structure
```
student-management-system/
│
├── src/main/java/com.smskd.sms
│   ├── controller/StudentController.java
│   ├── entity/Student.java
│   ├── repository/StudentRepository.java
│   ├── service/StudentService.java
│   ├── service/impl/StudentServiceImpl.java
│   └── StudentManagementSystemApplication.java
│
├── src/main/resources/
│   ├── templates/
│   │   ├── students.html
│   │   ├── create_student.html
│   │   └── edit_student.html
│   ├── static/
│   └── application.properties
│
├── pom.xml
└── README.md
```


---

## ⚙️ Installation & Setup

### 1. Clone the repository
```bash
git clone https://github.com/kalpadas599/student-management-system.git
```
### 2. Open the project in STS/Eclipse/IntelliJ
### 3. Create MySQL Database
```
CREATE DATABASE student_management;
```
### 4. Configure `application.properties`
```
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
### 5. Run the Application
```
mvn spring-boot:run
```
Or run the main class:
```
StudentManagementSystemApplication.java
```
### 🌐 Access the Application
http://localhost:8080/students
[There is extra file 1. Dockerfile and 2.render.yaml]

