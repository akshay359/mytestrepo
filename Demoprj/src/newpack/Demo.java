package newpack;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/excellarate/Downloads/chromedriver");
 WebDriver driver =new ChromeDriver();
 driver.get("https://www.makemytrip.com/");
 driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

   WebElement logo=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/a[1]"));
   Thread.sleep(2000);
Actions a= new Actions(driver);
a.moveToElement(logo).click().build().perform();


   driver.findElement(By.id("fromCity")).click();
driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("del");
int i=0;
while(i<4)
{
driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(Keys.DOWN);
i++;
}
driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(Keys.ENTER);
//driver.quit();
	}

}
