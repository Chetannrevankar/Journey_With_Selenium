import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        
        // Open Google homepage
        driver.get("https://www.google.com");
        
        // Click on Google Apps menu (the 'gb_X' class may change; make sure it's correct)
        driver.findElement(By.className("gb_X")).click();
        
        // Navigate to Facebook homepage
        driver.navigate().to("https://www.facebook.com");
        
        // Attempt to navigate forward (will have no effect if no forward history)
        driver.navigate().forward();
        
        // Pause for 1 second to allow page to load
        Thread.sleep(1000);
        
        // Refresh the current page
        driver.navigate().refresh();
        
        // Pause for 1 second
        Thread.sleep(1000);
        
        // Navigate back to the previous page (Google)
        driver.navigate().back();
        
        // Pause for 1 second
        Thread.sleep(1000);
        
        // Close the browser and quit the driver session
        driver.quit();
	}
}
