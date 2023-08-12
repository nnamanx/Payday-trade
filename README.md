<h1> Payday bank </h1>
Payday bank is implementing brand new Trading solution. The customers now should be able to purchase stocks from partner brokers through their bank account.

<h2>Task</h2>
<ul>
<li>Implement rest APIs given in the user stories</li>
<li>Create necessary artifacts to run application locally</li>
<li>Follow coding standards and best practices</li>
<li>Provide at least 80% unit test coverage</li>
<li>Nice to have integration tests</li>
<li>The application must be highly scalable</li>
<li>Provide artifacts to deploy the application to kubernetes cluster</li>
<li>Provide proper isolation mechanism for test and prod envs. Assume we will deploy the
application to the same kubernetes cluster and use namespaces as to isolate each env.</li>
</ul>

<h2>Used Tools</h2>
<ul>
<li>Spring Boot</li>
<li>Rest API</li>
<li>Spring Mail</li>
<li>JWT</li>
<li>MapStruct</li>
<li>Feign Client</li>
<li>Liquibase</li>
<li>Swagger</li>
</ul>

markdown
Copy code
# Payday Trading Solution

This project is an implementation of the Payday bank's trading solution, allowing customers to purchase stocks from partner brokers through their bank accounts.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Payday Trading Solution is a web application that provides customers with the ability to buy and sell stocks using their bank accounts. It implements a set of REST APIs for various functionalities and ensures secure authentication using JWT (JSON Web Tokens).

## Features

- User sign-up and authentication
- Listing available stocks with current prices
- Depositing cash into the account
- Placing buy and sell orders for stocks
- Email notifications for order fulfillment

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Spring Boot CLI (optional)
- PostgreSQL database
- Docker and Docker Compose (for database setup)

### Installation

1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/payday-trading-solution.git
   cd payday-trading-solution
Set up the PostgreSQL database using Docker Compose:
sh
Copy code
docker-compose up -d
Configure the database connection in src/main/resources/application.properties.
Build and run the application:
sh
Copy code
./mvnw spring-boot:run
Usage

Access the API documentation to understand the available endpoints and their usage.
Use an API client (e.g., Postman) to test the endpoints.
API Documentation

The API documentation is generated using Swagger. Access it at: http://localhost:8080/swagger-ui.html.

Technologies Used

Java with Spring Boot
PostgreSQL
JWT for authentication
Swagger for API documentation
Contributing

Contributions are welcome! If you find any issues or want to enhance the project, feel free to submit a pull request.

License

This project is licensed under the MIT License.

sql
Copy code

Please replace placeholders like `yourusername` with your actual GitHub username and adjust other details as needed. Also, remember to add any additional sections or information that might be specific to your project.







