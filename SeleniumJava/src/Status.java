import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Status {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
        
        WebElement img = driver.findElement(By.xpath("//body"));
        System.out.println(img.isDisplayed());
        System.out.println(img.isEnabled());
        System.out.println(img.isSelected());
        
        driver.findElement(By.id("email")).sendKeys("chetannrevankar@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys("chetannrevankar@gmail.com");
        driver.quit(); 
	}
}
