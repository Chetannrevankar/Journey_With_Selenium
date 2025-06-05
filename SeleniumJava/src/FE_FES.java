import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;

public class FE_FES {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://www.google.com");
        
        // Find first matching element with tag "a" (anchor tag)
        WebElement firstLink = driver.findElement(By.tagName("a"));
        System.out.println("First Link Text: " + firstLink.getText());
        
        // Find all elements with tag "a" (all anchor tags)
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + allLinks.size());
        
        driver.quit();
    }
}
