import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	
	List<WebElement> row = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td/a"));
	System.out.println(row.size());
	
	List<WebElement> col = driver.findElements(By.xpath("//*[@class='dataTable']/thead/tr/th"));
	System.out.println(col.size()); 
	
	
	////*[@class='dataTable']/tbody/tr/td
	
	String start="//*[@class='dataTable']/tbody/tr["; 
	String mid ="]/td[";
	String end ="]";
	
	for (int i=1;i<row.size();i++) {
		for(int j=1;j<col.size();j++) {
			WebElement table = driver.findElement(By.xpath(start+i+mid+j+end));
			System.out.print(table.getText()+"  ||  ");
			
		}
		System.out.println();
	}
			
		System.out.println(" ");	
	
}
}
