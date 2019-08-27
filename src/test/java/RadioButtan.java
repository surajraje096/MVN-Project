import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtan {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
	
		System.out.println(driver.findElement(By.xpath("//*[text()='Round Trip']")).isSelected());
		driver.findElement(By.xpath("//*[text()='Round Trip']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[text()='Round Trip']")).isEnabled());
	
		
	}

}
