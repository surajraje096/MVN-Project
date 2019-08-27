
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class listener extends AbstractWebDriverEventListener {

	public void afterClickOn(WebElement element, WebDriver driver) {

		System.out.println("Element Clicked");

	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Moving back");
	}
}
