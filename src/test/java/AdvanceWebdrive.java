import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceWebdrive {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://commons.wikimedia.org/wiki/Main_Page");
		
		driver.findElement(By.id("//*[@id=\"mf-tagline-title\"]/div[2]/a[3]")).sendKeys(Keys.PAGE_DOWN);
		
		
		
		
		
		
	}

}
