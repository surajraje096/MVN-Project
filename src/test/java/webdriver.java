
import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriver {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		
		//WebElement element = driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input"));
		
		driver.findElement(By.name("name")).sendKeys("suraj");
		
		//driver.findElement(By.xpath("//*[@name=\"phone\"]")).sendKeys("5245");
		driver.findElement(By.name("phone")).sendKeys("888888888");
		//driver.findElement(By.id("phone")).sendKeys("+7385338463");
		driver.findElement(By.name("email")).sendKeys("surajraje096@gmail.com");
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select"));
		Select ele= new Select(element1);
		ele.selectByVisibleText("Canada");
		driver.findElement(By.name("city")).sendKeys("pune");
		
		
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).sendKeys("surajraje096");
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).sendKeys("suraj@123");
		/*element1=driver.findElements(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input"));
		element1.sendKeys("hello");
		*/
		
		
		
		/*driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input"));
		element1.sendKeys("surajraje");
		element1.findElements(By.xpath( "//*[@id=\"load_form\"]/fieldset[6]/input"));
		element1.sendKeys("surajpatil");
		*/
		

		
		
	
	
		
				
			WebElement element = 	driver.findElement(By.name("password"));
			element.submit();
		
		
			File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(f, new File("E:\\suraj.jpeg"));
	
		
			driver.findElement(By.name("password")).clear();
		
		
		
		/*
		element= driver.findElement(By.id("name"));
		element.sendKeys("suraj patil");
		
		element= driver.findElement(By.id("phone"));
		element.sendKeys("+7385338463");
		
		element= driver.findElement(By.id("email"));
		element.sendKeys("surajraje096@gmail.com");
		
		Select select= new Select(element);
		select.selectByVisibleText("Canada");
		
		element= driver.findElement(By.id("city"));
		element.sendKeys("pune");
		
		element= driver.findElement(By.id("username"));
		element.sendKeys("surajraje096@gmail.com");
		
		element= driver.findElement(By.id("password"));
		element.sendKeys("suraj@123");
		
		element= driver.findElement(By.id("submit"));
		//element.sendKeys(Keys.ENTER);
		element.click();
		System.out.println("click done");
		
		

		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("surajraje096");
*/		
	}

	private static By xpath(Object sendKeys) {
		// TODO Auto-generated method stub
		return null;
	}

	}

