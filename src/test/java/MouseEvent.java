import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class MouseEvent {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		listener listener = new listener();
		driver.register(listener);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		EventFiringMouse mouse = new EventFiringMouse(driver, listener);

		driver.get("https://www.google.com");

		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@id='gb_70']")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Alert a= driver.switchTo().alert();
		//a.dismiss();
		//Thread.sleep(5000);
		/*Locatable mouseover1 = (Locatable) driver.findElement(By.xpath("//*[@id=\\\"nav\\\"]/li[1]/ul/li[1]/a"));

		Coordinates cord1 = mouseover1.getCoordinates();

		mouse.mouseMove(cord1);

		Locatable mouseover2 = (Locatable) driver.findElement(By.xpath("//*[@id=\\\"nav\\\"]/li[1]/ul/li[5]/a"));

		Coordinates cord2 = mouseover2.getCoordinates();

		mouse.mouseMove(cord2);
		
		driver.findElement(By.xpath("//*[@id=\\\\\\\"nav\\\\\\\"]/li[1]/ul/li[5]/a")).click();
		*/
		driver.navigate().back();
	}

}
