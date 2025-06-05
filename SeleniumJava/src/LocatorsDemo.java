import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
        WebElement pwd = driver.findElement(By.name("pass"));
        pwd.sendKeys("123");
        
//      driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
//      driver.findElement(By.tagName("input"));
        
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.quit();
	}
}
