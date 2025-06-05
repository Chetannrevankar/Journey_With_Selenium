<h1 align="center">🧠 Selenium Automation with Java</h1>

This repository documents my complete learning journey of **Selenium Automation using Java**, along with a real time automation framework project built for **Flipkart**, using **TestNG**, **Maven**, and the **Page Object Model (POM)** design pattern.

---

## 🌟 Why I Learned Selenium Automation Testing

As a developer aiming for a career in **Quality Assurance (QA)**, especially in domains like **Digital Health and eCommerce**, I understand the **critical role of software testing** in delivering high quality user experiences. I took up this course to:

* ✅ Learn **end to end web automation** using Selenium WebDriver.
* 🔍 Understand how **automated testing** ensures faster, more reliable releases.
* ⚙️ Gain experience with **SCRUM aligned test cycles**.
* 💡 Prepare for industry practices like **test strategy, defect tracking**, and **UAT support**.

---

## 📚 Learning Summary

I have created detailed notes covering the Selenium ecosystem and built several example scripts that align with QA job responsibilities. Here's a summary:

### 🛠️ Setup & Installation

* Installed: **JDK 24**, **Eclipse IDE**, **Selenium JARs**, **EdgeDriver / ChromeDriver**
* Configured WebDriver manually using `.jar` files for standalone projects.
* Switched to **Maven** for better dependency and test lifecycle management.

### 🔍 Selenium Concepts Mastered

#### ➔ WebDriver Basics

* `get()`, `getTitle()`, `getCurrentUrl()`, `close()`, `quit()`.
* Launching multiple browsers and setting up browser specific drivers.

#### ➔ Element Locators

* Basic: `id`, `name`, `className`, `tagName`, `linkText`, `partialLinkText`.
* Advanced:

  * **XPath** (Absolute, Relative, Axes: `ancestor`, `child`, `sibling`, etc.).
  * **CSS Selectors** (ID, class, attributes, `starts-with`, `contains`, etc.).

#### ➔ WebElement Interaction

* `click()`, `sendKeys()`, `clear()`, `getText()`, `isDisplayed()`, `isEnabled()`.

#### ➔ Advanced Interactions

* Mouse actions (hover, right-click, drag-drop) using `Actions` class.
* Keyboard automation with **Java Robot Class**.

#### ➔ Frames, Windows, Alerts

* Handling multi-tab/window flows and browser alerts.

#### ➔ Data Handling

* Reading configs from `.properties`, `.txt`, `.xls` files.
* Implemented **data driven testing** using the **JXL library**.

#### ➔ Selenium Grid

* Built understanding of **Hub-Node** architecture for cross-browser and parallel testing.

---

## 🛒 Flipkart Automation Project

A real time e-commerce test automation framework built to simulate a user journey on [https://www.flipkart.com](https://www.flipkart.com), using **Selenium**, **TestNG**, and **Page Object Model**.

### ✅ Functional Scope

* 🔍 Search products (e.g., "iPhone").
* 📦 Apply filters (e.g., memory 128 GB).
* 📱 Select specific product details.
* 📄 Generate test reports using TestNG.

---

## 🖼️ Project Snapshots

Below are the snapshots from the actual test run:

| 🌀 Loading Page | 🧲 Filter Applied | 📱 Product Selected |
|----------------|------------------|----------------------|
| ![Loading](./Loading.png) | ![Filtering](./Filtering.png) | ![Selected](./Selected.png) |

---

### 🎥 Demo Video

Watch the automation test in action:

📹 **Project Demo**: [▶ProjectDemo.mp4](./ProjectDemo.mp4)


## 🗂️ Project Structure

```
FlipkartAutomation/
|
├── base/
│   └── BaseTest.java              # Sets up and tears down WebDriver
|
├── pages/
│   ├── HomePage.java              # Handles home page and search bar actions
│   ├── SearchResultsPage.java     # Applies filters and selects products
│   ├── CartPage.java              # Handles cart actions
│   └── AddressPage.java           # Manages address entry and confirmation
|
├── testcases/
│   └── SearchAndBuyTest.java      # End-to-end test scenario for buying a product
|
├── testng.xml                     # TestNG suite configuration
├── pom.xml                        # Maven dependencies and build setup
└── README.md                      # Project documentation

```

---

## 🧑‍💻 Technologies Used

| Tool / Framework     | Version / Notes                 |
| -------------------- | ------------------------------- |
| Java                 | 21                              |
| Selenium WebDriver   | 4.19.1                          |
| TestNG               | 7.9.0                           |
| Maven                | Yes (for dependency management) |
| Microsoft EdgeDriver | v137+                           |
| Eclipse IDE          | Oxygen / Latest                 |

---

## 🚀 How to Run This Project

### 🔧 Prerequisites

* Java 17 or above.
* Maven installed and added to PATH.
* EdgeDriver or ChromeDriver configured in PATH.

### ▶️ Steps

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/FlipkartAutomation.git
   cd FlipkartAutomation
   ```

2. **Install Dependencies via Maven**

   ```bash
   mvn clean install
   ```

3. **Update WebDriver Path (If Needed)**

   ```java
   System.setProperty("webdriver.edge.driver", "your/path/to/msedgedriver.exe");
   ```

4. **Run the Tests**

   ```bash
   mvn test
   ```

   Or run `SearchAndBuyTest.java` using Eclipse's TestNG runner.

### ⚠️ Known Limitations

* ❌ CAPTCHA and OTP flows are not automatable.
* 🚧 Dynamic JS models and iframes need explicit waits.

---

## 👨‍💼 Author

**Chetan N Revankar**
🎓 B.E. in Computer Science | 2025 Batch
📬 [LinkedIn Profile](https://www.linkedin.com/in/chetannrevankar)

---

## 📄 License

This repository is for **educational and interview preparation purposes**.
Not affiliated with or endorsed by Flipkart.

---

🧺 **QA-Aligned Ready**: This automation framework mirrors real world QA practices, such as:

* 📜 Writing and managing test cases for user stories.
* ✅ Supporting UAT, regression, and system integration testing.
* 🐞 Logging bugs via test reports.
* 📊 Creating artifacts like test strategies, checklists, and E2E coverage reports.
* 🧩 Practicing agile methodologies and collaborative QA planning.

📀 **Status:** Ready for internship and entry level QA job roles.
