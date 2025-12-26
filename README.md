# RahulShetty E‑Commerce Website — Automated Tests (Cucumber framework)

Automated test suite for the Rahul Shetty E‑Commerce demo website implemented using a BDD-style Cucumber framework with Selenium WebDriver (Java). This repository contains end-to-end UI tests, step definitions, page objects, and configuration to run tests locally or in CI.

> Note: This README is a general, ready-to-use guide. Adjust commands and paths to fit the project's exact build tool and directory layout if you have custom settings.

## Table of contents
- [Features](#features)
- [Tech stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Getting started](#getting-started)
- [Run tests](#run-tests)
- [Run a specific scenario or tag](#run-a-specific-scenario-or-tag)
- [Test reports](#test-reports)
- [Project structure (suggested)](#project-structure-suggested)
- [Contributing](#contributing)
- [Troubleshooting](#troubleshooting)
- [License & contact](#license--contact)

## Features
- BDD test scenarios written in Gherkin (.feature files)
- Step definitions in Java using Cucumber
- Page Object Model (POM) to organize UI interactions
- Cross-browser support via Selenium WebDriver (configurable)
- Test reporting (Cucumber HTML / Allure / other reporters — configurable)
- Example tests cover common e‑commerce flows (search, add to cart, checkout, form validations)

## Tech stack
- Language: Java (recommended 11+)
- Test framework: Cucumber (Gherkin) + JUnit or TestNG
- Browser automation: Selenium WebDriver
- Build tool: Maven (or Gradle) — adjust commands accordingly
- Optional: Allure for advanced reporting

## Prerequisites
- Java JDK 11 or later installed and JAVA_HOME configured
- Maven (if Maven is used) or Gradle (if Gradle is used)
- Chrome, Firefox, or other browsers you plan to test against
- Optional: Allure CLI (for generating Allure reports locally)

Verify installations:
- java -version
- mvn -v (or ./gradlew -v for Gradle)

## Getting started
1. Clone the repository:
   git clone https://github.com/romiljoshi/RahulShettyE-Commerce-website-Testing-Cucumberr-framework-.git
   cd RahulShettyE-Commerce-website-Testing-Cucumberr-framework-

2. Configure browser driver:
   - Option A: Use WebDriverManager (recommended) so you don't need local driver binaries.
   - Option B: Place the chromedriver/geckodriver in your PATH or configure the driver path in your test config.

3. Adjust test configuration:
   - Check `src/test/resources` (or `config` folder) for environment settings, base URL, browser, timeouts, etc.
   - You can often override settings via system properties or environment variables:
     -DbaseUrl=https://example.com -Dbrowser=chrome

## Run tests
Using Maven (most common):
- Run all tests:
  mvn clean test

- Run with a specific profile or options (example):
  mvn clean test -Denv=qa -Dbrowser=chrome

Using Gradle:
- ./gradlew clean test

If the project uses a JUnit runner with Cucumber:
- mvn test -Dcucumber.options="--plugin pretty --plugin html:target/cucumber-html-report"

If using TestNG:
- mvn -Dtestng -Dtest=TestRunner test

(Adapt the commands to the runner specified in the repository: JUnit/TestNG and the runner class.)

## Run a specific scenario or tag
- Run scenarios with a tag:
  mvn test -Dcucumber.options="--tags @smoke"

- Run a single feature file:
  mvn test -Dcucumber.options="classpath:features/login.feature"

- Run a single scenario by line number:
  mvn test -Dcucumber.options="classpath:features/login.feature:12"

Again, exact flags depend on the Cucumber and build tool versions; the examples above work with standard cucumber-jvm integrations.

## Test reports
- Cucumber HTML report (built-in plugin) typically appears under:
  target/cucumber-html-report or target/cucumber-report.html

- Allure (if configured):
  mvn test
  mvn allure:serve
  (or generate with: allure generate target/allure-results -o target/allure-report)

- CI systems (GitHub Actions, Jenkins, GitLab CI) can publish the generated HTML or Allure reports.

## Project structure (suggested)
This is a commonly used structure for Cucumber+Selenium Java projects. Update according to the repository actual layout.

- src
  - main
    - java
      - (shared utilities / helpers)
  - test
    - java
      - runners (Test runners / test entry points)
      - stepdefinitions (Cucumber step definitions)
      - pageobjects (Page Object Model classes)
      - utils (helpers, hooks)
    - resources
      - features (Gherkin .feature files)
      - testdata (JSON / CSV / properties)
      - config (environment properties)
- pom.xml (Maven) or build.gradle (Gradle)
- README.md
- .github/workflows (CI workflows, optional)
- target / build (generated on test run)

## Best practices / tips
- Keep step definitions focused (call page object methods rather than direct Selenium calls in steps).
- Use tags to group slow vs fast tests (e.g., @smoke, @regression, @slow).
- Use environment-specific configuration and do not hardcode test URLs or credentials.
- Secrets and credentials: do not store in repo. Use CI secret stores or environment variables.

## Contributing
- Fork the repository
- Create a feature branch: git checkout -b feat/my-test
- Add tests/code, run locally
- Create a PR describing changes and test coverage

Please include clear changelog notes and add/update feature files and step definitions as needed.

## Troubleshooting
- Tests failing due to timeouts: increase explicit/implicit wait timeouts or use WebDriverWait for expected conditions.
- Browser driver mismatch errors: ensure browser and driver versions are compatible or use WebDriverManager.
- Network or CI-specific failures: confirm base URL and any proxy/CI environment variables.

## License & contact
- License: Add or update a LICENSE file in the repository to indicate the project's license (MIT, Apache 2.0, etc.).
- Maintainer / contact: romiljoshi (GitHub: @romiljoshi)

---
