import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
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
		
		
		driver.quit();


	}

}
