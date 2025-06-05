package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage {
    WebDriver driver;
    WebDriverWait wait;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void applyMemoryFilter(String memorySize) {
        try {
            // Close login popup if visible
            try {
                WebElement closePopup = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
                closePopup.click();
                System.out.println("Closed login popup.");
            } catch (Exception e) {
                System.out.println("Login popup not displayed.");
            }

            WebElement memoryFilter = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'" + memorySize + "')]")));
            memoryFilter.click();
            System.out.println("Memory filter applied: " + memorySize);

            Thread.sleep(3000);  // wait for filter to apply (replace with better wait if possible)
        } catch (Exception e) {
            System.out.println("Memory filter not found or error applying filter: " + e.getMessage());
        }
    }

    public void selectProduct() {
        try {
            // Wait for search results container
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div._1YokD2")));

            // Find product links with "/p/" in href
            List<WebElement> products = driver.findElements(By.xpath("//a[contains(@href,'/p/')]"));

            if (products.isEmpty()) {
                System.out.println("No products found on the page.");
                return;
            }

            // Click first visible product
            for (WebElement product : products) {
                if (product.isDisplayed()) {
                    product.click();
                    System.out.println("Clicked product.");
                    return;
                }
            }

            System.out.println("No visible product link found to click.");
        } catch (Exception e) {
            System.out.println("Product selection failed: " + e.getMessage());
        }
    }

    public void addToCart() {
        try {
            WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
            addToCartBtn.click();
            System.out.println("Added product to cart.");
        } catch (Exception e) {
            System.out.println("Add to cart failed: " + e.getMessage());
        }
    }
}
