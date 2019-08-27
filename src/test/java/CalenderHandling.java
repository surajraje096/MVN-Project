import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

		
		
		static int currentday =0;
				static int currentmaonth=0;
				static int currentyear =0;
		
		static int targetdate= 0,
					targetmonth=0,
		             targetyear=0;
					
		static int jumpmonthBy0;
		
	
		static boolean increment=true;
		String dateformat= "04/11/2019";
		
		public static void getcurrent() {
			Calendar cal = Calendar.getInstance();
			currentday= cal.get(Calendar.DAY_OF_MONTH);
			
		}
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
			driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("04/11/2019");
			
			
			
			
			
			
			
		}
		
		
		
		
		}
		
		
		
		
		
	


