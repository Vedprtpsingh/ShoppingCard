# ShoppingCard

ShoppingCard is a Spring Boot based e-commerce web application designed to provide a seamless shopping experience. It supports user registration, product browsing, cart management, order placement, and admin management functionalities.

## Technologies Used

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL Database
- Thymeleaf (for server-side HTML templates)
- Maven (build tool)
- Bootstrap, CSS, JavaScript (frontend)
- SMTP Email (for password reset and order notifications)

## Features

### User Features
- User registration and login with secure password encryption.
- Browse products by category with pagination and search functionality.
- View detailed product information.
- Add products to cart and manage cart quantities.
- Place orders with order summary and status tracking.
- Reset forgotten password via email link.
- Manage user profile and change password.

### Admin Features
- Admin login with role-based access control.
- Manage product categories: add, edit, delete, and list with pagination.
- Manage products: add, edit, delete, and list with pagination and search.
- View and manage all user accounts (users and admins).
- View and update order statuses with email notifications.
- Admin profile management and password change.

## Project Structure Overview

- `com.ved.shoppingcard` - Main application package.
- `controller` - Contains controllers for handling web requests (HomeController, UserController, AdminController).
- `model` - Entity classes representing database tables (Product, Category, UserDtls, Cart, OrderRequest, ProductOrder, etc.).
- `repository` - Spring Data JPA repositories for data access.
- `service` and `service.impl` - Business logic services and their implementations.
- `config` - Security configuration and authentication handlers.
- `util` - Utility classes for common functions and constants.
- `resources` - Static assets (CSS, JS, images) and Thymeleaf HTML templates.
- `application.properties` - Application configuration including database and mail settings.

## Configuration

- Database: MySQL configured with URL `jdbc:mysql://localhost:3306/shoppingcardDB`, username `root`, and password `password`.
- Mail: SMTP configured for Gmail with authentication and TLS enabled for sending password reset and order notification emails.
- File Upload: Maximum file size for uploads set to 50MB.

## Running the Project

1. Ensure MySQL is installed and running. Create a database named `shoppingcardDB`.
2. Update database credentials in `src/main/resources/application.properties` if needed.
3. Configure your Gmail SMTP credentials in `application.properties` for email functionality.
4. Build the project using Maven:
   ```
   mvn clean install
   ```
5. Run the Spring Boot application:
   ```
   mvn spring-boot:run
   ```
6. Access the application at `http://localhost:8080`.

## Notes

- The application uses role-based security with roles `USER` and `ADMIN`.
- Thymeleaf templates are used for rendering views.
- Email functionality requires valid SMTP credentials.
- Static resources like images and CSS are located under `src/main/resources/static`.

---

This README provides an overview of the ShoppingCard project, its features, structure, and how to run it locally.
