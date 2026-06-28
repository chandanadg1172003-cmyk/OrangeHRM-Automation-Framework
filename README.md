# HRMS Automation Framework

## Project Overview

This project is a Selenium-based automation framework developed for testing the OrangeHRM web application. The framework is built using Java, Selenium WebDriver, TestNG, and Maven while following the Page Object Model (POM) design pattern to improve maintainability, reusability, and scalability.

The primary objective of this project is to automate critical HR workflows, provide fast feedback to developers, and reduce regression defects through reliable automated testing.

---

# Technology Stack

* Java 17
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Git & GitHub
* ChromeDriver
* GitHub Actions (CI/CD)

---

# Project Features

* Login functionality testing
* Invalid login validation
* Logout functionality testing
* Reusable Page Object Model
* Utility classes for browser and configuration management
* Configurable test data using properties files
* Maven-based project structure
* TestNG test execution
* HTML test reports

---

# Folder Structure

```text
OrangeHRM-Automation-Framework/
│
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── base
│   │   │   ├── pages
│   │   │   ├── tests
│   │   │   └── utilities
│   │   └── resources
│
├── test-output
├── pom.xml
├── testng.xml
├── README.md
└── .github
    └── workflows
```

---

# Installation

## Prerequisites

* Java JDK 17 or later
* Maven
* Eclipse or IntelliJ IDEA
* Google Chrome
* ChromeDriver

## Clone Repository

```bash
git clone https://github.com/chandanadg1172003-cmyk/OrangeHRM-Automation-Framework.git
```

Open the project in your IDE and update Maven dependencies.

---

# How to Run the Application

1. Clone the repository.
2. Import the project into Eclipse or IntelliJ.
3. Update Maven dependencies.
4. Configure the browser settings if required.
5. Ensure ChromeDriver is compatible with your Chrome version.

---

# How to Run Tests

### Using TestNG

```bash
Right Click → testng.xml → Run As → TestNG Suite
```

### Using Maven

```bash
mvn clean test
```

---

# Test Strategy Summary

The automation framework follows a **risk-based testing strategy**, focusing on the application's most important business workflows.

### Automated Scenarios

* Valid Login
* Invalid Login
* Logout
* User Authentication
* Navigation Verification

As the framework grows, additional high-priority HR workflows such as Employee Management, Leave Management, and Attendance can be added.

The framework is designed using the Page Object Model to reduce code duplication and improve maintainability.

---

# CI/CD

The framework is designed to integrate with GitHub Actions.

Typical pipeline:

1. Checkout source code
2. Install Java
3. Download Maven dependencies
4. Build project
5. Execute TestNG suite
6. Generate test reports

This ensures automated validation on every code change.

---

# Test Reports

After execution, TestNG generates reports in:

```text
test-output/
```

These reports include:

* Passed tests
* Failed tests
* Execution time
* Stack traces
* Test summary

---

# Future Improvements

* API automation using REST Assured
* Cross-browser execution
* Parallel execution
* Docker support
* Jenkins/GitHub Actions integration
* Allure or Extent Reports
* Data-driven testing
* Screenshot capture on failures

---

# Author

**Chandana D G**
