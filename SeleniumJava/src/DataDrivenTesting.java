import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import jxl. Sheet;
import jxl.Workbook;
import read.biff.BiffException;
public class DataDrivenTesting {
	public static void main(String[] args) throws BiffException,IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\cheta\\Downloads\\SeleniumDownloads\\Drivers\\msedgedriver.exe"); 
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
		Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\cheta\\Desktop\\SeleniumJava\\Book.xlsx")); 
		Sheet sh = wb.getSheet("Sheet1");
		
		for(int i=0;i<sh.getRows();i++) {	
			WebElement Unm = driver.findElement(By.id("email"));
			WebElement pwd = driver.findElement(By.id("pass"));
			Unm.sendKeys(sh.getCell(0,i).getContents());
			pwd.sendKeys(sh.getCell(1,i).getContents());
			Thread.sleep(2000);
			pwd.clear();
			Unm.clear();
		}
	}
}
