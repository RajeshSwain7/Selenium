import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addToCartEcommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// expected to add more products in cart, to that declare an array.
		int j = 0;

		String[] iteamsNeed = { "Cucumber", "Cauliflower", "Carrot", "Tomato", "Raspberry" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

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
		driver.quit();

	}

}
