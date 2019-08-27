import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstScript {
	static
	{

	System.setProperty("WebDriver.chrome.driver","./MavProj/chromedriver.exe" );
	}
	@Test
	public void test1()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.seleniumhq.org/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	
	
	
	

}
}
