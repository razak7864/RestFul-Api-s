🎓 Student Management RESTful API – Spring Boot Project
=================================================



A 🚀 beginner-friendly yet powerful application to manage student records using Spring Boot, MySQL, and RESTful APIs. Designed to perform complete CRUD operations with clean architecture and real-world practices.




✨ Key Highlights
=================================================


🔧 Built with Spring Boot

🗄️ Connected to MySQL Database

🧪 Tested using Postman

📁 Code managed with Git & GitHub

✅ Demonstrates full CRUD operations (Create, Read, Update, Delete)



🛠️ Tech Stack
=================================================


🔹 Tech	🔸 Tool

☕ Java	: Spring Boot

🐬 Database	: MySQL

🔍 API Testing	: Postman

💻 IDE	: Spring Tool Suite (STS)

🗃️ Version Control :	Git & GitHub



🔗 Features
=================================================
➕ Add a new student.

📄 Get all students.

🔍 Get a student by ID.

✏️ Update student details.

❌ Delete a student.




⚙️ Configuration
=================================================
Database connection is configured in the application.properties file to link Spring Boot with MySQL.



🧭 How to Run the Project
=================================================

✅ Step-by-Step Guide:
1. 🔁 Clone the Repository

{ git clone https://github.com/your-username/student-management-api.git }

2. 💻 Open in Your IDE (e.g., Spring Tool Suite, IntelliJ, etc.)

3. 🛠️ Set Up MySQL Database

Create a database:
CREATE DATABASE student_db;


4. 📝 Configure application.properties

   
   spring.datasource.url=jdbc:mysql://localhost:3306/student_db
   
   spring.datasource.username=your_username
   
   spring.datasource.password=your_password
   
   spring.jpa.hibernate.ddl-auto=update

6. ▶️ Run the Project


Using IDE: Right-click → Run as → Spring Boot App

Or via terminal:

{ mvn spring-boot:run }


6. 📬 Test API Endpoints in Postman

POST /students → ➕ Add Student

GET /students → 📄 View All

GET /students/{id} → 🔍 View by ID

PUT /students/{id} → ✏️ Update Student

DELETE /students/{id} → ❌ Delete Student



   




✅ Results
=================================================
All CRUD operations were tested successfully using Postman, and the expected results were obtained.


📁 Repository Structure
=================================================
 
```text
src/
 └── main/
     ├── java/
     │   └── com.example.student/
     │       ├── repository/
     │       ├── service/
     │       ├── controller/
     │       └── entity/
     └── resources/
     │     ├── application.properties
     └──pom.xml
```


