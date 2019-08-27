import java.sql.Driver;

import javax.swing.text.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
	
		
		driver.switchTo().frame("iframeResult");
		System.out.println("switch to ifream");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000l);
		System.out.println(alert.getText());
		Thread.sleep(5000l);
		alert.dismiss();
		Thread.sleep(5000l);
		System.out.println("alert handled");
		
	}

}
