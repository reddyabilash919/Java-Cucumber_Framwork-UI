# Java Cucumber Framework for UI Testing

A robust, scalable, and maintainable UI test automation framework using Java, Cucumber, and Selenium WebDriver.

## Features

- **Behavior-Driven Development (BDD)** with Cucumber
- **Selenium WebDriver** for browser automation
- **Page Object Model (POM)** for maintainable code
- **JUnit** integration for test execution
- **Maven** for build and dependency management
- **Cross-browser testing** support
- **Detailed HTML reports**

## Prerequisites

- Java 8 or higher
- Maven 3.x
- Chrome/Edge browser
- IDE (Visual Studio Code)

## Getting Started

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-org/java-cucumber-framework.git
   cd java-cucumber-framework
   ```

2. **Install dependencies:**

   ```bash
   mvn clean install
   ```

3. **Run tests:**
   ```bash
   mvn test
   ```

## Project Structure

## Project Structure

```plaintext
src/
├── main/
│   └── java/
│       ├── driver/                 # WebDriver management classes
│       ├── pages/                  # Page Object classes
│       └── utils/                  # Utility/helper classes
└── test/
    ├── java/
    │   ├── stepdefinitions/        # Cucumber step definitions
    │   ├── runners/                # Cucumber test runners
    │   └── hooks/                  # Test hooks (e.g., setup/teardown)
    └── resources/
        └── features/               # Gherkin feature files
```

- `driver`: WebDriver initialization and management
- `pages`: Page Object classes
- `utils`: Utility/helper classes
- `stepdefinitions`: Cucumber step definitions
- `runners`: Test runner classes
- `hooks`: Test setup and teardown hooks
- `features`: Gherkin feature files
- `stepdefinitions`: Cucumber step definitions
- `pages`: Page Object classes
- `runners`: Test runner classes
- `features`: Gherkin feature files

## Writing Tests

1. **Create a feature file** in `src/test/resources/features`.
2. **Implement step definitions** in `src/test/java/com/automationpractice/stepdefinitions`.
3. **Add page objects** in `src/main/java/pages` as needed.

## Reporting

Test execution generates HTML reports in the `target/cucumber-reports` directory.
