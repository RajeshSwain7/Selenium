import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//navigate to the auto suggest drop down and enter the value, it will suggest the list
		
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
		driver.quit();
	}

}
