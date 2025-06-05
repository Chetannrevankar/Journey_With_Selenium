import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        try {
            driver.get("https://the-internet.herokuapp.com/checkboxes");

            // Locate and click first checkbox if not already selected
            By firstCheckbox = By.xpath("//form[@id='checkboxes']/input[1]");
            if (!driver.findElement(firstCheckbox).isSelected()) {
                driver.findElement(firstCheckbox).click();
            }

            // Locate and click second checkbox if not already selected
            By secondCheckbox = By.xpath("//form[@id='checkboxes']/input[2]");
            if (!driver.findElement(secondCheckbox).isSelected()) {
                driver.findElement(secondCheckbox).click();
            }

            System.out.println("Checkboxes selected!");

            // Wait for 5 seconds before closing the browser
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
