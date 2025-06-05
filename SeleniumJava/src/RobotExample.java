import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Keys;

public class RobotExample {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        
        driver.findElement(By.name("q")).sendKeys("java download");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        
        System.out.println("Please solve the CAPTCHA manually.");
        Thread.sleep(20000);  // wait 20 seconds for manual CAPTCHA

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h3[contains(text(),'Download Free Java Software')]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[contains(text(),'Free Java Download')]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[contains(text(),'Agree and Start Free Download')]")).click();
        Thread.sleep(2000);
        
        // Create Robot object (from java.awt)
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
}
