import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}