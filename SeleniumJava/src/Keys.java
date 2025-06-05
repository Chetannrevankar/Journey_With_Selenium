import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Keys {

    public static void main(String[] args) {
        // Set the path to your Edge WebDriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new EdgeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com");

        // Create Actions object
        Actions a = new Actions(driver);

        // Locate elements
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));

        // Type "Chetan" in email field
        email.sendKeys("Chetan");

        // CTRL+A, CTRL+C on email, then click password and CTRL+V
        a.click(email)
         .keyDown(org.openqa.selenium.Keys.CONTROL)
         .sendKeys("a")
         .sendKeys("c")
         .keyUp(org.openqa.selenium.Keys.CONTROL)
         .click(pass)
         .keyDown(org.openqa.selenium.Keys.CONTROL)
         .sendKeys("v")
         .keyUp(org.openqa.selenium.Keys.CONTROL)
         .build()
         .perform();
    }
}
