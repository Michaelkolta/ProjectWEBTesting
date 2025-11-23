# SauceDemo Test Automation Framework

# 🧩 Tools & Technologies

| Component             | Technology              |
| --------------------- | ----------------------- |
| UI Automation         | Selenium WebDriver      |
| BDD                   | Cucumber + Gherkin      |
| Test Runner           | TestNG                  |
| Language              | Java                    |
| Reporting             | Extent, Allure          |
| Design Pattern        | Page Object Model (POM) |
| Dependency Management | Maven                   |

***


# 🧪 Positive Test Scenarios

Below are the key end-to-end scenarios automated in this framework:

### ✅ 1. Verify User Can Log In Successfully

* Enter valid credentials
* Click Login
* Assert user is redirected to **Products** page

### ✅ 2. Add First Product to Cart

* Select first product
* Click **Add to Cart**
* Verify cart badge = 1

### ✅ 3. Add Second Product to Cart

* Add another item
* Verify cart badge = 2

### ✅ 4. Verify Total Price Calculation

* Go to cart
* Proceed to **Checkout: Overview** page
* Validate item total, tax, and final total

### ✅ 5. Proceed to Checkout

* Fill First Name, Last Name, Zip Code
* Continue → Finish
* Verify **Order Confirmation** message

### ✅ 6. Verify Logout Functionality

* Open burger menu
* Click Logout
* User is redirected to login page

---

# ❌ Negative Test Scenarios

### ❗ 1. Invalid Login Credentials

* Enter invalid username/password
* Verify error message

### ❗ 2. Locked-Out User

* Login using `locked_out_user`
* Verify blocked access message

### ❗ 3. Checkout With Missing Information

* Leave First Name / Last Name / Zipcode empty
* Verify mandatory field validation messages

### ❗ 4. Remove Item From Cart

* Add product
* Remove product from cart page
* Verify the item is removed

---

# 📁 Framework Structure

```
ProjectWEBTesting
│── src/test/java
│   ├── features
│   ├── stepDefinitions
│   ├── runners
│   └── pages (POM)
│
│── src/main/java
│   └── utilities
│
│── src/test/resources
│   ├── extent-config.xml
│   └── allure.properties
│
│── pom.xml
│── testng.xml
│── README.md
```

---

# 🧩 Tools & Technologies

| Component             | Technology              |
|-----------------------|-------------------------|
| UI Automation         | Selenium WebDriver      |
| BDD                   | Cucumber + Gherkin      |
| Test Runner           | TestNG                  |
| Language              | Java                    |
| Reporting             | Extent, Allure          |
| Design Pattern        | Page Object Model (POM) |
| Dependency Management | Maven                   |

***

# 📊 Reporting

### **Extent Report**

* Auto-generated HTML report after execution

### **Allure Report**

* Rich graphical test analytics
* Includes screenshots for failed tests

---

# ▶️ How to Run Tests

```
mvn clean test
```

Or run via **TestNG XML** or **Cucumber Runner Class**.

---

If you want:
✨ badges,
📌 screenshots,
📁 diagrams,
⚙️ setup instructions, or
🚀 CI/CD pipeline…
just tell me and I’ll add them! 😄
