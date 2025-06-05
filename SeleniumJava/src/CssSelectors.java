import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelectors {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
        
        // Example: Using ID Selector
        // Syntax: css= <HTML tag> <#> <Value of ID attribute>
        driver.findElement(By.cssSelector("#email")).sendKeys("chetannrevankar@gmail.com");

        // Example: Using Class Selector
        // Syntax: css= <HTML tag> <.> <Value of Class attribute>
        // (Note: Check the actual class value on the element, replace 'inputtext' with correct value)
        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("password123");

        // Example: Using Attribute Selector
        // Syntax: css= <HTML tag>[attribute=Value]
        driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("password123");

        // Example: Sub-String StartsWith Selector (^)
        // Syntax: css= <HTML tag>[attribute^=prefix]
        // For example, if an input placeholder starts with 'En'
        // driver.findElement(By.cssSelector("input[placeholder^='En']")).sendKeys("prefix test");

        // Example: Sub-String EndsWith Selector ($)
        // Syntax: css= <HTML tag>[attribute$=suffix]
        // For example, if an input placeholder ends with 'il'
        // driver.findElement(By.cssSelector("input[placeholder$='il']")).sendKeys("suffix test");

        driver.quit();
    }
}
