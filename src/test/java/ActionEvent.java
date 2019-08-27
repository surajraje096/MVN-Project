import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEvent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bankofbaroda.in/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		
		
		Actions actions = new Actions(driver);
		WebElement mainmenu=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[3]/a"));
		Thread.sleep(2000);
		
		WebElement submenu=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[3]/ul/li[2]/a"));
		Thread.sleep(2000);
		WebElement submenu1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/ul/li[3]/ul/li[2]/ul/li[1]/a"));
		
		Thread.sleep(2000);
		actions.moveToElement(mainmenu).perform();
		Thread.sleep(2000);
		actions.moveToElement(submenu).perform();
		Thread.sleep(2000);
		actions.moveToElement(submenu1).perform();
		Thread.sleep(2000);
		submenu1.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	

}
