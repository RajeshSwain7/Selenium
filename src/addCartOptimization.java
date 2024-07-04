import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addCartOptimization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		// expected to add more products in cart, to that declare an array.
		

		String[] iteamsNeed = { "Cucumber", "Cauliflower", "Carrot", "Tomato", "Raspberry" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		//method calling
		addItems(driver, iteamsNeed);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//used relative xpath 
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//oneway
		//driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		//another way
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.quit();
	}
	
	
	public static void addItems(WebDriver driver, String[] iteamsNeed) throws InterruptedException {
		int j = 0;
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) {
			// format the list to actual vegetable name using split and the return type is
			// here is array
			String[] productName = product.get(i).getText().split("-");
			// once split then
			String formattedProduct = productName[0].trim();
			// convert array into arrayList
			List iteamsNeedList = Arrays.asList(iteamsNeed);
			// format the list to actual vegetable name using split

			// check whether name you extracted is present in array or not
			if (iteamsNeedList.contains(formattedProduct)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(formattedProduct + " successfully added to Cart");
				if (j == iteamsNeed.length) {
					break;
				}
			}
		}
		Thread.sleep(2000);
		
	}

}
