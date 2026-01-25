# Employee Management System

## Description
The Employee Management System (EMS) is a Spring Boot-based project that provides a RESTful API for managing employee data. The system incorporates essential CRUD (Create, Read, Update, Delete) operations, role-based access control via Spring Security, and JPA for database interactions. The EMS is designed for scalability, security, and easy integration.

## Features
- Role-based access control using Spring Security.
- CRUD operations on employee records.
- MySQL database integration with schema management.
- RESTful API endpoints.
- Hibernate ORM for seamless data interaction.
- Actuator for monitoring and management.

---

## Workflow

1. **Database Initialization**
   - The database schema is defined in the `EMS.sql` file.
   - It includes tables for employees, users (authentication), and authorities (roles).

2. **Starting the Application**
   - Main class: `EmsApplication.java` initializes and starts the Spring Boot application.

3. **API Endpoints**
   - **Base URL**: `/api/employees`
   - **Endpoints**:
     - `GET /employees` - Retrieve all employees.
     - `GET /employees/{id}` - Get details of a specific employee by ID.
     - `POST /employees` - Add a new employee.
     - `PUT /employees` - Update an existing employee.
     - `DELETE /employees/{id}` - Delete an employee by ID.

4. **Security Configuration**
   - Security roles are defined as `EMPLOYEE`, `MANAGER`, and `ADMIN`.
   - Each role has specific access permissions to endpoints.

5. **Entity Definition**
   - `Employee.java` maps to the database table `employee` using JPA annotations.
   - Contains fields such as `id`, `firstName`, `lastName`, `email`, `salary`.

6. **Build and Dependencies**
   - Managed via Maven (`pom.xml`).
   - Key dependencies include:
     - Spring Boot
     - Hibernate
     - Spring Security
     - MySQL Connector
     - Lombok

---

## File Structure
```
EMSRestApi/
├── EMS/
│   ├── HELP.md                  # Spring documentation and guides.
│   ├── README.md                # Project overview (this file).
│   ├── EMS.sql                  # SQL file for database schema.
│   ├── src/main/java/
│   │   ├── com/springboot/ems/
│   │   │   ├── EmsApplication.java  # Main application file.
│   │   ���   ├── entity/Employee.java  # Employee entity model.
│   │   │   ├── controller/EmployeeRestController.java  # REST API controller.
│   │   │   ├── service/
│   │   │   │   ├── EmployeeService.java  # Employee service interface.
│   │   │   │   ├── EmployeeServiceImplementation.java  # Service implementation.
│   │   │   ├── security/EmployeeSecurityConfig.java  # Security configuration.
│   ├── pom.xml                 # Dependencies and build configuration.
│   ├── application.properties  # Database and JPA configuration.
```

---

## Getting Started

1. **Clone the repository**
```bash
git clone https://github.com/Daniel-Cva/Spring-Projects.git
```

2. **Set Up Database**
   - Configure the `application.properties` file for MySQL with your credentials.
   - Run `EMS.sql` to initialize the database schema.

3. **Build and Run the Application**
```bash
mvn clean install
mvn spring-boot:run
```

4. **Access the API**
   - Use tools like Postman or cURL to interact with API endpoints.

---

## Technologies Used
- **Framework**: Spring Boot
- **Database**: MySQL
- **Security**: Spring Security
- **ORM**: Hibernate
- **Language**: Java
- **Build Tool**: Maven

---

## Contribution Guidelines

1. Fork the repository.
2. Create a new branch (`feature-branch`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.