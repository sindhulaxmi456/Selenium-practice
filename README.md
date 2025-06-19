# Selenium Form Automation Project

This is a beginner-friendly Selenium automation project created by **Sindhusha Korupolu** to practice end-to-end form automation using Java and Selenium WebDriver.

## 🔧 Tools Used
- Java
- Selenium WebDriver
- ChromeDriver
- Eclipse IDE
- HTML (custom form)

## 💻 What It Does
The script performs the following:
- Opens a local HTML form
- Fills in user details:
  - Text fields (First Name, Last Name, Email)
  - Date of Birth
  - Gender (Radio button)
  - Skills (Checkboxes)
  - Country (Dropdown)
- Submits the form
- Displays a success message

## 📂 Files Included
- `form.html`: Custom form created for automation
- `FormAutomation.java`: Selenium script to automate form
- `pom.xml`: Maven configuration file
- `README.md`: Project description

## 🚀 How to Run
1. Clone this repo or download ZIP
2. Open the project in Eclipse
3. Update the ChromeDriver path in `FormAutomation.java`
4. Update the local file path in:
   ```java
   driver.get("file:///your/path/to/form.html");
