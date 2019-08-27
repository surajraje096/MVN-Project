import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.homeshop18.com");
		
		String menu = "//*[@id=\"CategoryMenu8\"]/a";
		WebElement footwear= driver.findElement(By.xpath(menu));
		
		String submenu = "//*[@id=\"CategoryMenu8\"]/ul/li[1]/ul[1]/li[4]/a";
		WebElement lofer= driver.findElement(By.xpath(submenu));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(footwear).perform();
		lofer.click();
		
	
		
		
				
	}
}
