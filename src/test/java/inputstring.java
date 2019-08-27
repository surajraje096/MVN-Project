import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class inputstring {
	private static char[] text;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		
		String text = driver.findElement(By.xpath("//*[@id='ebcaptchatext']")).getText();
		
		System.out.println(text);
		System.out.println(text.substring(8,9));
		System.out.println(text.substring(12,13));
		
		int num1= Integer.parseInt(text.substring(8,9));
		int num2=Integer.parseInt(text.substring(12,13));
		
		int finalcount = num1+num2;
		System.out.println(finalcount);
		
		String final_add= String.valueOf(finalcount);
		driver.findElement(By.xpath("//*[@class='textbox']")).sendKeys(final_add);
		

	
		
		
	

	}

}
