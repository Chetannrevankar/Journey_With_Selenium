import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        
        WebElement day = driver.findElement(By.id("day"));
        Select d1 =  new Select(day);
//        d1.selectByIndex(5);
        d1.selectByValue("1");
//        d1.selectByVisibleText("Day");
        
        
//        ========================================================================
        
        List<WebElement> dd = d1.getOptions();
        System.out.println(dd.size());
        
        for (int i=0;i<dd.size();i++) {
        	String txt = dd.get(i).getText();
        	System.out.println(txt);
        	dd.get(i).click();        }
        
        Thread.sleep(2000);
        driver.quit();
	}

}
