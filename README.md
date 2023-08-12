<h1> Payday Trading Bank </h1>
Payday bank is implementing brand new Trading solution. The customers now should be able to purchase stocks from partner brokers through their bank account.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Technologies Used](#technologies-used)
- [License](#license)


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

## Technologies Used

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


## Introduction

The Payday Trading Solution is a web application that provides customers with the ability to buy and sell stocks using
their bank accounts. It implements a set of REST APIs for various functionalities and ensures secure authentication
using JWT (JSON Web Tokens).

## Features

- User sign-up and authentication
- Listing available stocks with current prices
- Depositing cash into the account
- Placing buy and sell orders for stocks
- Email notifications for order fulfillment

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Spring Boot CLI (optional)
- PostgreSQL database
- Docker and Docker Compose (for database setup)

### Installation

Clone this repository:
   ```sh
   git clone https://github.com/nnamanx/payday-trade.git
   cd payday-trade.git

## License

This project is licensed under the [MIT License](LICENSE).







