import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlxDemo {

		public static void main(String[] args) throws InterruptedException, FileNotFoundException {
			System.setProperty("webdriver.chrome.driver","/home/excellarate/Downloads/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.olx.in/"); 
			WebElement fw=driver.findElement(By.xpath("//input[contains(@data-aut-id,'searchBox')]"));
			fw.click();
			fw.sendKeys("mobile");
		WebElement searchb=driver.findElement(By.className("_3b3oR"));
		searchb.click();
		Thread.sleep(2000);
		//driver.findElement(By.className("_2grx4")).click();
		List<WebElement> price=driver.findElements(By.xpath("//span[contains(@data-aut-id,'itemPrice'"
				+ ")]"));
		List<WebElement> text=driver.findElements(By.xpath("//span[contains(@data-aut-id,'itemTitle')]"));
		PrintWriter pw=new PrintWriter(new File("/home/excellarate/Desktop/listt.csv"));
		StringBuilder sb=new StringBuilder();
		WebElement w;
		WebElement ww;
		System.out.print("Price"+"\t"+"\t"+"Product Name"+"\n"+"\n");
		HashMap<String,String>hm=new HashMap<String,String>();
		for(int i=0;i<price.size();i++)
		 {
			for(int j=i;j<=i;j++)
			{
				w=price.get(j);
				System.out.print(w.getText());
				sb.append(w.getText());
				sb.append("=");
			}
			for(int k=i;k<=i;k++)
			{
				ww=text.get(k);
				System.out.print("--->"+ww.getText());
				sb.append(ww.getText());
				sb.append("\r\n");
			}
			System.out.println();
			
		 }
		pw.write(sb.toString());
		pw.close();
		
		
		}

	
}
