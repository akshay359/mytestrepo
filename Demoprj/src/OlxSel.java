import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlxSel {
	

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		  Logger log = LogManager.getLogger(OlxSel.class.getName());	 
		System.setProperty("webdriver.chrome.driver","/home/excellarate/Downloads/chromedriver");  //providing path of chrome driver
		   WebDriver wb=new ChromeDriver();   
		   log.debug("Chrome browser launched"); 
		   		  	 wb.get("https://www.olx.in/");
		   		  log.debug("reached site");
		   		  	 wb.manage().window().maximize();
		   		  	 log.info("Success: Windows open");
		   		  	 log.debug("maximized the window of current webpage");
		   		  	
		   		  log.debug("Browser maximized"); 
	WebElement element= wb.findElement(By.cssSelector("div._3FF3q header._1Ow7B.BCAyI:nth-child(1) div._1B5Sf._2d97D div._2fu44 div._2KctL div._3W9XC div._18aBn div.zYZEU:nth-child(2) div._2C0uj form.rui-1Azjs._20jkh fieldset:nth-child(2) div:nth-child(1) > input:nth-child(1)"));
    log.info("Success: search box founded!!"); 		
			   element.click(); 
			   log.debug("clicking on search box"); 
	              element.sendKeys("mobile");
		          log.debug("Sending keys to search box"); 
	 WebElement ee=wb.findElement(By.className("_3b3oR"));
	  	          log.debug("getting search button");     
	            ee.click();
	 	          log.debug("Clicking on search button");
	                    Thread.sleep(2000);
	 	         log.debug("process wait for 2"
	 	         		+ " sec");
	 	        if (wb.getTitle().equals("Mobile in India, Free classifieds in India | OLX"))
	 	         {
	 	        	 log.info("Success:The correct page title got displayed");
	 	         }
	 	         else { 
	 	       	 log.error("Failed: wrong title got displayed"); 
	 	         }
	 	         
	List<WebElement> price=wb.findElements(By.xpath("//span[contains(@data-aut-id,'itemPrice')]"));
		         log.debug("Fetching prices of items");
	List<WebElement> name=wb.findElements(By.xpath("//span[contains(@data-aut-id,'itemTitle')]"));
	 	         log.debug("Fetching names of product");
	 	         
	       String[]text=new String[price.size()];
	       String[]nm=new String[name.size()];
	       int j=0;
	      int l=0;
	      for(WebElement a:price)
	      {
	    	  text[j]=a.getText();
	    	  j++;
	    	       }
	      for(WebElement b:name)
	      {
	    	 nm[l]=b.getText();
	    	 l++;
	    	 }
	      
	   	HashMap<String,String>hm=new HashMap<String,String>();
	   	log.debug("Storing values in hashmap");
	   	for(int i=0;i<text.length;i++)//(int j=0;j<arr2.length;j++)
	   	{
	   		
	    	hm.put(text[i],nm[i]); 	
	    }
	    PrintWriter pw=new PrintWriter(new File("/home/excellarate/Desktop/hashmap.csv"));
	    StringBuilder builder = new StringBuilder();
	    for(Map.Entry<String,String> entry:hm.entrySet())
	    { 
	    	String tt=entry.getKey();
	    	String nn=entry.getValue();
	    	builder.append(tt);
	    	builder.append("=");
	    	builder.append(nn);
	    	builder.append("\r\n"); 	
	    	//System.out.println("key="+entry.getKey()+"\t"+"value="+entry.getValue());
	    }
	    log.info("Data adding to csv file.........");
	    pw.write(builder.toString());
	    pw.close();
	    log.info("Successful data added to csv file");
	    Thread.sleep(2000);
       wb.close();
       log.debug("Browser got closed and end of the Test execution");
	}

}
