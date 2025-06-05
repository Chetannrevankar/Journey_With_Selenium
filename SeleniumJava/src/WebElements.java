import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login");
        
        String Title = driver.getTitle();
        System.out.println("Title is:"+ Title);		//Return the Title of the website
        System.out.println(driver.getCurrentUrl()); //Return the current url link
        
        WebElement attribute = driver.findElement(By.id("email"));
        System.out.println(attribute.getAttribute("id"));
        System.out.println(attribute.getTagName());
        
        driver.close();   
	}
}

