import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");


        WebElement component = driver.findElement(By.name("reg_email__"));
        component.sendKeys("chetannrevankar@gmail.com");
        driver.findElement(By.name("firstname")).sendKeys("Chetan");
        driver.findElement(By.className("_1lch")).click();
        Thread.sleep(1000);
        driver.close();
    }    
}
