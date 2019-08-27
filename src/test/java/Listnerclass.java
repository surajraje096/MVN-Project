

//import java.util.EventListener;


import java.util.EventListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


//import org.w3c.dom.events.EventListener;

public class Listnerclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		EventListener listener=new EventListener();
		

		/*driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUn it.SECONDS);
		driver.manage().window().maximize();
		*/
		EventFiringWebDriver webDriver= new EventFiringWebDriver(driver);
		webDriver.register(listener);
		
		listener.getClass("");
		
		
		
		
		
		
	}
}
