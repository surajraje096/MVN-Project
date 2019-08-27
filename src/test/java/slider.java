import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class slider {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/televisions/pr?sid=ckf%2Cczl&otracker=categorytree&p%5B%5D=facets.price_range.from%3DMin&otracker=nmenu_sub_TVs+%26+Appliances_0_Android+TVs&p%5B%5D=facets.price_range.to%3DMax&p%5B%5D=facets.operating_system%255B%255D%3DOfficial%2BAndroid&p%5B%5D=facets.operating_system%255B%255D%3DAndroid&p%5B%5D=facets.serviceability%5B%5D%3Dtrue");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("https://www.makemytrip.com/")));
		System.out.println("explicit wait");
		WebElement drag= driver.findElement(By.xpath("//*[@class='_3aQU3C']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(drag,90,0).perform();
	}

}
