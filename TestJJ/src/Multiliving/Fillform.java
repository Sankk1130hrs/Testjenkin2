package Multiliving;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fillform 
{
	ChromeDriver driver;
	@BeforeMethod
	public void  Browseropening()
	{
		System.setProperty("webdriver.chrome.driver", "../TestJJ/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.multiliving.co.in/online-rental-agreement");
		driver.manage().window().maximize();
	}
	
	public static  void DropdownSelection1 (WebElement element , String VisibleText) 
	{
		
		
		Select s=new Select(element);
		s.selectByVisibleText(VisibleText);
		

	}
	@Test
	public void Verify() throws InterruptedException
	{
		WebElement user=driver.findElement(By.name("user_type"));
		DropdownSelection1 (user,"Landlord");
		
		WebElement city=driver.findElement(By.name("city"));
		DropdownSelection1 (city,"Mumbai");
		
		WebElement mobileno=driver.findElement(By.name("mobile"));
		mobileno.sendKeys("8108681974");
		
		List<WebElement> verify=driver.findElements(By.xpath("//*[(@type='button')]"));
		verify.get(1).click();
		Thread.sleep(12000);
		
		
	}
	
	

}
