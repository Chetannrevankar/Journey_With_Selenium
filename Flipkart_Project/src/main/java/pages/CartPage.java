package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void placeOrder() {
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
    }
}