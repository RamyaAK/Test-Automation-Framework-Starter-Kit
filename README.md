**Test Automation Framework Starter Kit**

A Java-based test automation framework for UI/API testing with Selenium, TestNG, and Allure Reports.

**Features**

- Selenium WebDriver for UI testing
- TestNG for test execution
- Allure Reports for test reporting
- Ready to use Maven-based project

**Requirements**

- Java 11+
- Maven 3.x
- Chrome WebDriver

**Setup**

1. Clone the repository:
   git clone https:https://github.com/RamyaAK/Test-Automation-Framework-Starter-Kit/
   Download Chrome WebDriver and set its path in the WebDriverFactory class.

2. Run tests with Maven:
   mvn test
3. To view the Allure report:
   mvn allure:serve

**Contributing:**

Feel free to fork this repo and create your own PRs for improvements and fixes!

**License:**

This project is licensed under the MIT License.

**gitignore File**

Create a `.gitignore` file to ignore unnecessary files:

```bash
# Maven
target/

# IDEs
.idea/
.vscode/

# OS generated files
.DS_Store
Thumbs.db
