package newpack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demopath2usa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/excellarate/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Thread.sleep(5000);
		String givenname = "praveen";
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//td[i]"));
		int row = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).getText().equals(givenname)) {
				row = i;
			}
		}
		driver.quit();

	}
}
