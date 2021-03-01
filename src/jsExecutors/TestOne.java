package jsExecutors;
import org.openqa.selenium.By;		
import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.*;


public class TestOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver.exe");
		
		TestOne.googleSearch();

	}
	
	public static void googleSearch() {
		
		     WebDriver driver= new ChromeDriver();		
  		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;	
	        
	        //Launching the Site.		
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        
	        //Maximize window		
	         driver.manage().window().maximize();		
	        
	        //Login to site 		
	        driver.findElement(By.name("txtUsername")).sendKeys("Admin");					
	        driver.findElement(By.name("txtPassword")).sendKeys("admin123");	
	        
	        //Perform Click on LOGIN button using JavascriptExecutor		
	        WebElement button =driver.findElement(By.className("button"));	
	        js.executeScript("arguments[0].click();", button);
	        
	        //Get page title and Domain using JavascriptExecutor
	        String titleText =  js.executeScript("return document.title;").toString();
	        System.out.println("Page Title is: "+ titleText);
	        
	        String domainName=  js.executeScript("return document.domain;").toString();
	        System.out.println("Domain is: "+domainName);

	        //To generate Alert window using JavascriptExecutor. Display the alert message 			
	        js.executeScript("alert('Successfully Logged In');"); 
	        sleep(2000);
	        
	        driver.quit();	        
		
	}
	
	public static void sleep(int ms) {
				
        try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {				
			e.printStackTrace();
		}
	}

}
