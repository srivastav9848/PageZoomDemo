package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageZoomDemo {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "e:\\lap downloads\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.redbus.in/");

	}
	
	@Test(priority=1)
	public void zoomin()
	{
		for(int i=0;i<5;i++)
		{
		driver.findElement(By.xpath("//a[contains(text(),'PILGRIMAGES ')]")).sendKeys(Keys.CONTROL,Keys.ADD);
		
	}
	}
	@Test(priority=2)
	public void zoomout()
	{
		for(int i=0;i<5;i++)
		{
		driver.findElement(By.xpath("//a[contains(text(),'PILGRIMAGES ')]")).sendKeys(Keys.CONTROL,Keys.SUBTRACT);
		
	}
	}
	@Test(priority=3)
	public void zoomdefault()
	{
		driver.findElement(By.xpath("//a[contains(text(),'PILGRIMAGES ')]")).sendKeys(Keys.CONTROL,"0");
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
