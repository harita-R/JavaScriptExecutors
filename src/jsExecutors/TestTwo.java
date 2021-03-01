package jsExecutors;
import java.util.concurrent.TimeUnit;
		
import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.WebDriver;				
import org.openqa.selenium.chrome.*;

public class TestTwo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver.exe");
		
		TestTwo.Login();

	}	
	
   public static void Login() { 
	WebDriver driver= new ChromeDriver(); 
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	//To launch a site 
	driver.get("https://www.lambdatest.com/"); 
	//To maximize the window 
	driver.manage().window().maximize(); 
	//To set the script timeout to 10 seconds 
	driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS); 
	//To declare and set the start time 
	long startTime = System.currentTimeMillis(); 
	//Calling executeAsyncScript() method to wait for 10 seconds 
	js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);"); 
	//Find passed time =  difference of current time and start time 
	System.out.println("Wait time: " + (System.currentTimeMillis() - startTime)); 
	
	driver.quit();
 }
}
