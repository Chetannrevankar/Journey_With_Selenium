package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
    WebDriver driver;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectAddress() {
        try {
            driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();
        } catch (Exception e) {
            System.out.println("Address not selectable.");
        }
    }
}