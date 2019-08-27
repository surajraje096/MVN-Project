import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement element= driver.findElement(By.cssSelector("*[title=Search]"));
		element.sendKeys("facebook");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		element = driver.findElement(By.cssSelector("*[class=\"V0MxL KLi8Vd\"]"));
		element.sendKeys(Keys.PAGE_DOWN);
		
		
	}

}
