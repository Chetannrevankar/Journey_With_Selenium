import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        
        List<WebElement> gender = driver.findElements(By.name("sex"));
        
        int cnt = gender.size();
        System.out.println(cnt);
//        ===================================================================
        for(int i=0;i<cnt;i++) {
        	String txt = gender.get(i).getText();
        	System.out.println(txt);
        	gender.get(i).click();
        	Thread.sleep(1000);
        }
        driver.quit();
	}
}
