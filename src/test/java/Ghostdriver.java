import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Ghostdriver {
	public static void main(String[] args) {
		
		DesiredCapabilities capabilities =new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "D:\\JARs\\ghostdri\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		WebDriver driver= new PhantomJSDriver(capabilities);
		
		driver.get("http.google.com");
		System.out.println("google lonched");
		
		
	}

}
