# Selenium UI Automation Maven Project
Below is the IDE run of the Project

https://github.com/user-attachments/assets/c70cdf3d-a4a9-4201-9bbd-0facdcf1b9bd

## Project Overview
This project is a Selenium-based UI automation framework using Maven, designed for end-to-end parallel testing of web applications. The framework supports test execution and generates detailed ExtentReports.

---

## Prerequisites
Before cloning and running this project, ensure the following are installed on your machine:
1. **Java Development Kit (JDK)** (Version 8 or higher)
2. **Apache Maven** (Verify installation by running `mvn -version` in the terminal)
3. **ChromeDriver/GeckoDriver** (Matching the browser version installed on your machine)
4. **Git** (For cloning the repository)

---

## Clone and Setup Instructions

### 1. Clone the Repository
Run the following commands in your terminal to clone the code:
```bash
git clone https://github.com/Adnan-Aashiq/SeleniumParallelBrowserTesting.git
```

Goto the Project diretory like the below command that will let you go to the Project directory.
```bash
cd SeleniumParallelBrowserTesting
```

This command will install all the local dependencies
```bash
mvn dependency:purge-local-repository 
```

### 2. Run Maven Commands
Clean, compile, and test the project using Maven:
```bash
mvn clean install
mvn test
```
### 3. View the Test Reports
After running the tests, navigate to the Project folder and open the extentReports.html file in a browser to view detailed execution results.

<img width="1512" alt="Screenshot 2025-01-13 at 9 15 47 PM" src="https://github.com/user-attachments/assets/1ef65b5e-7cff-474c-9593-c8a9e01bf1f8" />

## Contact
If you encounter any issues or have questions, feel free to contact me at **adnanaashiq457@gmail.com** and WhatsApp me on **+92-302-2149193**.
