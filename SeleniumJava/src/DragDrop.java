import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://jqueryui.com/droppable/");
        
        Actions a = new Actions(driver);
        driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        
        WebElement DragSrc = driver.findElement(By.id("draggable"));
        WebElement DropTgt = driver.findElement(By.id("droppable"));
        a.dragAndDrop(DragSrc, DropTgt).perform();
        
        if (DropTgt.getText().matches("Dropped!")) {
        	System.out.println("Successfully Dropped");
        }else {
        	System.out.println("Invalid Element Choosen");
        }
        driver.quit();
	}
}
