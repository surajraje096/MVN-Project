import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class inputstringclick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		EventFiringWebDriver drivere= new EventFiringWebDriver(driver);
		
driver.get("https://www.makemytrip.com/?cmp=SEM|M|DF|G|Brand|B_M_Makemytrip_Search_Exact_PWA|Brand_Top_5_Exact|Expanded|263988375481&s_kwcid=AL!1631!3!263988375481!e!!g!!makemytrip&ef_id=Cj0KCQjwj_XpBRCCARIsAItJiuQLwJxMYzFolo0kZ_8gQytaD8G9ayr-0weHXA5rtF9Ffn9jUvDKAooaAk15EALw_wcB:G:s&adbamo.amo.userid=1631&adbamo.sid=3&adbamo.ln=makemytrip&adbamo.lx=kwd-354589634&adbamo.crx=263988375481&adbamo.mt=e&adbamo.n=g&adbamo.ltx=&adbamo.pl=&adbamo.pos=1t1&adbamo.dvc=m&adbamo.dvm=&adbamo.phy=9062220&adbamo.loc=&adbamo.cx=759168202&adbamo.ax=39866137117&utm_campaign=AMOCampaign&utm_source=AMO&gclid=Cj0KCQjwj_XpBRCCARIsAItJiuQLwJxMYzFolo0kZ_8gQytaD8G9ayr-0weHXA5rtF9Ffn9jUvDKAooaAk15EALw_wcB");		
		
 
	}
	
	

}
