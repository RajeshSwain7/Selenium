import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class etoe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().fullscreen();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
		//get the list and store in the web element list of variable from findElements , where you will get no of list element
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("India")) 
			{
				//Print the option with is selected and entered in auto suggestion box.
				System.out.println(option.getText());
				option.click();
				break;
			}
		}
		Thread.sleep(2000);
		//disabled or enabled.
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
				
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
		{
			System.out.println("It is Disabled");
			Assert.assertTrue(true);
		}else{
			System.out.println("It is Enabled");
			Assert.assertFalse(false);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//search button
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
