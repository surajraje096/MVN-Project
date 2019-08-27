import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;


public class MouseEvent1 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		listener listeners = new listener();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		EventFiringMouse mouse = new EventFiringMouse(driver, listeners);
		
	     driver.get("https://timesofindia.indiatimes.com/");

		
		Locatable mouseover1 = (Locatable) driver.findElement(By.xpath("//*[@content='World']"));

		Coordinates cord = mouseover1.getCoordinates();

		mouse.mouseMove(cord);

		Locatable mouseover2 = (Locatable) driver.findElement(By.xpath("//*[@content='TV']"));

		Coordinates cord2 = mouseover2.getCoordinates();

		mouse.mouseMove(cord2);


		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
