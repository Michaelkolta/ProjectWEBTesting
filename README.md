# 🚀 SwagLabs Automation Test Suite

A fully automated UI testing framework for **SwagLabs** ([https://www.saucedemo.com](https://www.saucedemo.com)) built using modern testing technologies including **Java**, **Selenium WebDriver**, **Cucumber BDD**, **TestNG**, **Maven**, and the **Page Object Model (POM)** design pattern. Reporting is powered by **Extent Reports** and **Allure Reports**.

---

## 🧰 **Tech Stack**

| Category                 | Tool / Framework               |
| ------------------------ | ------------------------------ |
| **Programming Language** | Java                           |
| **Automation Framework** | Selenium WebDriver             |
| **Test Framework**       | TestNG                         |
| **BDD Framework**        | Cucumber (Gherkin)             |
| **Build Tool**           | Maven                          |
| **Design Pattern**       | Page Object Model (POM)        |
| **Reporting**            | Extent Reports, Allure Reports |

---

## 📖 **Overview**

This project automates end-to-end test scenarios for SwagLabs including login, product selection, shopping cart validation, checkout workflow, and logout. Both **positive** and **negative** test scenarios are included to ensure robust and reliable test coverage.

---

## 📦 **Project Structure**

```
src
├── main
│   └── java/com/swaglabs/
│       ├── pages/                 # Page Objects (POM Structure)
│       └── utils/                 # Driver Factory, Config Loader
└── test
    └── java/com/swaglabs/
        ├── steps/                 # Step Definitions
        ├── runners/               # Cucumber + TestNG Runners
        └── resources/features/    # Gherkin Feature Files

pom.xml
README.md
```

---

# ✅ **Positive Test Scenarios**

### **1. Verify That User Can Log In Successfully**

* Navigate to login page
* Enter valid username & password
* User should be redirected to Products page

### **2. Add First Product to Cart**

* Add first product
* Verify cart counter updates to **1**

### **3. Add Second Product to Cart**

* Add another product
* Verify cart badge is **2**

### **4. Verify Total Price Calculation**

* Navigate to cart
* Ensure individual prices match
* Verify tax and total price accuracy on checkout overview

### **5. Proceed to Checkout**

* Enter checkout details
* Verify navigation to confirmation page
* Successfully complete order

### **6. Verify Logout Functionality**

* Open burger menu
* Click **Logout**
* Verify user is redirected to login page

---

# ❌ **Negative Test Scenarios**

### **1. Invalid Login Credentials**

* Enter invalid username/password
* Validate the error message displayed

### **2. Locked-Out User**

* Attempt login with `locked_out_user`
* Expect appropriate locked-out error message

### **3. Checkout With Missing Information**

* Attempt checkout with empty form fields
* Validate error message (e.g., *"First Name is required"*)

### **4. Remove Item From Cart**

* Add product to cart
* Remove item
* Verify cart is empty

---

## ▶️ **Running Tests**

Run full suite:

```
mvn clean test
```

Run specific TestNG-Cucumber runner:

```
mvn -Dtest=TestRunner test
```

Run with different browser:

```
mvn clean test -Dbrowser=firefox
```

---

## 📊 **Reporting**

### **Extent Report**

Generated under:

```
target/extent-report/index.html
```

### **Allure Report**

Generate report via:

```
allure serve allure-results
```

---

## 🧱 **Framework Highlights**

* Clean & maintainable POM structure
* BDD approach for readability
* Centralized WebDriver factory
* Reusable utilities and helper functions
* Configurable execution via Maven parameters

---

## 🤝 **Contributing Guidelines**

1. Fork repository
2. Create your feature branch
3. Commit changes
4. Run full test suite
5. Submit Pull Request

---

## 📜 **License**

MIT License

---

### ✨ *Professional, scalable, and reliable automation — powered by SwagLabs Test Suite!* ✨
