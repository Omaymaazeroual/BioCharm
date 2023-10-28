# BioCharm E-commerce Website

BioCharm is an e-commerce platform dedicated to cosmetic products, offering a user-friendly experience to browse, shop, and manage orders. The project is developed using Spring Boot following the MVC architecture, incorporating Spring Security for user authentication and authorization, and utilizing MariaDB as the database management system.

## Features

- **Product Browsing & Search:** Users can easily browse, search, and find preferred cosmetic products.
- **Shopping Cart:** Add products to the cart for later purchase or checkout.
- **Product Categories:** Explore various categories to find desired products quickly.
- **User Account & Ordering:** Register an account to place orders by filling out required information.
- **Admin Panel:** Admins have access to manage product categories, products, and monitor sales analytics for past months.

## Technologies Used

- **Spring Boot:** MVC-based application using Spring framework.
- **Spring Security:** Handles user authentication and authorization.
- **MariaDB:** Database system storing product, user, and order information.

## Setup Instructions

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/biocharm-ecommerce.git
   ```

2. **Database Configuration:**
   - Set up a MariaDB database and configure the connection in `application.properties`.

3. **Run the Application:**
   - Navigate to the project directory.
   - Execute:
     ```bash
     ./mvnw spring-boot:run
     ```

4. **Accessing the Application:**
   - By default, the application runs at: `http://localhost:8080`
   - Use a web browser to access the website.

## Usage

- **User Access:**
  - Register for an account or log in to shop and place orders.

- **Admin Access:**
  - Utilize admin credentials to manage products, categories, and view sales analytics.

## Support

For inquiries or issues, please contact [oumeima.azeroual@gmail.com].
