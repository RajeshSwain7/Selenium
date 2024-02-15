import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndtoEndAutomation {

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
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// dynamic drop down handle with index
//		driver.findElement(By.xpath("/a[@value='BLR']")).click();
		//parent to child xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		// dynamic drop down handle with index
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//parent-child xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		
		//handle the calender
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//select the number of member
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//single click to add one
		driver.findElement(By.id("hrefIncAdt")).click();
		//to add multiple person then how to adult. in that case we can use looping technique.
			
		Thread.sleep(2000);
		
//		int i=1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		//alternative using for loop
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//select the check box
		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		//count all the check box available in site
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		driver.quit();

	}

}
