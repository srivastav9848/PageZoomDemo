package regression;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "e:\\lap downloads\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.redbus.in/");
	System.out.println("homepage Title is:"+driver.getTitle());
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Banglore");
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Hyderabad");
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
	List<WebElement> alldates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//table[@class='rb-monthTable first last']/tbody/tr/td"));
	int tot=alldates.size();
	System.out.println(tot);
	for(WebElement ele:alldates)
	{
		String date=ele.getText();
		if(date.equalsIgnoreCase("30"))
		{
			ele.click();
			break;
		}
	}
	
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");}

}
