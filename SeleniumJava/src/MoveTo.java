import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        Actions a = new Actions(driver);

        driver.get("https://www.facebook.com");
        Thread.sleep(3000); // Wait for the page to load

        WebElement Unm = driver.findElement(By.id("email"));
        WebElement pwd = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.name("login"));

        // Move and enter username
        a.moveToElement(Unm).click().sendKeys("chetannrevankar@gmail.com").build().perform();
        Thread.sleep(1000);

        // Double click on username field
        a.doubleClick(Unm).build().perform(); // Example of doubleClick
        Thread.sleep(1000);

        // Move and enter password
        a.moveToElement(pwd).click().sendKeys("1234").build().perform();
        Thread.sleep(1000);

        // Right click on the login button
        a.contextClick(login).build().perform(); // Example of right click
        Thread.sleep(2000);

        // Click on login button
        a.moveToElement(login).click().build().perform();

        Thread.sleep(5000);
        driver.quit();
    }
}
