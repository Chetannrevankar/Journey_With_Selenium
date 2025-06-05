import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebAlerts {

    public static void main(String[] args) throws InterruptedException {
        // Set the driver path
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe");

        // Initialize EdgeDriver
        WebDriver driver = new EdgeDriver();

        // Open KSRTC website
        driver.get("https://ksrtc.in/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        String txt = driver.switchTo().alert().getText();
        System.out.println(txt);
        if (txt.contentEquals("Please select start place.")) {
        driver.switchTo().alert().accept();
        System.out.println("Correct Alert..!!!");        
        }else {
        	System.out.println("Invalid Alert..!!!");
        }    
        driver.quit();
    }
}
