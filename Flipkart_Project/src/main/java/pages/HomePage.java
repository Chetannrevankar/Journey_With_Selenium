package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    
    By closeLoginPopup = By.xpath("//button[contains(text(),'✕')]");
    By searchBox = By.name("q");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeLoginPopup() {
        try {
            driver.findElement(closeLoginPopup).click();
        } catch (Exception e) {
            // Popup not present - ignore
        }
    }

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product + "\n");
    }
}
