# **Inventory Management System**

## **Description**

A simple Inventory Management System built with Spring Boot and MySQL, providing full CRUD operations for managing products.

## **Technologies**

- **Spring Boot**  
- **Spring Data JPA**  
- **MySQL**  
- **Swagger** for API Documentation  

## **Features**

- Full CRUD functionality for products  
- API documentation via Swagger  
- Error handling and validation  

## **Setup**

1. Clone the repository:  

   ```bash
   git clone https://github.com/gabrielpit/inventory-management-system.git
   ```

2. Set up your MySQL database and update the `application.properties` file with your credentials.  

3. Build and run the project:  

   ```bash
   mvn spring-boot:run
   ```

4. Access the API:  

   ```bash
   http://localhost:8080/api/products
   ```

## **API Endpoints**

- **GET** `/api/products` - List all products  
- **GET** `/api/products/{id}` - Get a product by ID  
- **POST** `/api/products` - Create a new product  
- **PUT** `/api/products/{id}` - Update a product  
- **DELETE** `/api/products/{id}` - Delete a product  

## **License**

MIT License
