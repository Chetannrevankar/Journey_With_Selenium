import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBookLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Welcome");
        driver.close(); //Closes the parent window
        driver.quit();  //Closes the child and parent window
    }
}
