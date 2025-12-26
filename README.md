# E-Commerce Website Automation Testing Framework

## 📖 Project Description
This project is an end-to-end automation testing framework developed to validate the core functionalities of an e-commerce web application using **Selenium WebDriver**, **Cucumber (BDD)**, and **Jenkins CI/CD**.  
The framework is designed following industry best practices such as **Page Object Model (POM)**, reusable utilities, and configuration-driven execution to ensure scalability and maintainability.

🔗 **Application URL:**  
https://rahulshettyacademy.com/client/#/auth/login

---

## 🛠️ Tech Stack & Tools
- **Programming Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **BDD Framework:** Cucumber  
- **Build Tool:** Maven  
- **Test Runner:** Cucumber Runner  
- **CI/CD Tool:** Jenkins  
- **Design Pattern:** Page Object Model (POM)  
- **Reporting:** Cucumber Reports / Extent Reports  
- **Version Control:** Git & GitHub  

---

## 📂 Project Structure
├── src/main/java
│ ├── pageObjects # Page Object classes
│ ├── utils # Utility and helper classes
│
├── src/test/java
│ ├── stepDefinitions # Cucumber step definitions
│ ├── runners # Cucumber test runners
│
├── src/test/resources
│ ├── features # Feature files (BDD scenarios)
│ ├── config.properties # Application configuration
│
├── pom.xml # Maven dependencies
├── README.md # Project documentation


---

## ✅ Features Automated
- User Login
- Product Listing
- Add to Cart
- Checkout Process
- Order Placement
- UI and Validation Checks

---

## ⚙️ Prerequisites
Ensure the following tools are installed on your system:
- Java **JDK 17**
- Maven
- Git
- Google Chrome Browser
- Jenkins (for CI/CD execution)

---

---

## 🔁 Jenkins Integration (CI/CD)
1. Install Jenkins and required plugins (Git, Maven)
2. Create a new Jenkins job (Freestyle or Pipeline)
3. Configure:
   - Git Repository URL
   - Maven Goal: `clean test`
4. Build the job to execute tests automatically

✔ Jenkins enables automated execution on every code commit.

---

## 📊 Test Reports
- Reports are generated after each execution
- Reports include:
  - Scenario execution status
  - Step-wise results
  - Failure details (with screenshots if enabled)

📁 Report Location:

---

## 🌐 Configuration
Application URL and browser settings are managed in:

Example:
appURL=https://rahulshettyacademy.com/client/#/auth/login

browser=chrome


---

## ⭐ Key Highlights
- Behavior Driven Development (BDD) approach
- Jenkins CI/CD integration
- Scalable and maintainable framework
- Industry-standard automation practices

---

## 👤 Author
**Rahul Joshi**  
Automation Test Engineer  
Selenium | Java | Cucumber | Jenkins

---

## 🚀 Future Enhancements
- Parallel test execution
- Cross-browser testing
- Docker integration
- Cloud execution using Selenium Grid or BrowserStack


## ▶️ How to Run Tests Locally

### Step 1: Clone the Repository
