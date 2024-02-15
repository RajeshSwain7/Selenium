import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
				driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
				Thread.sleep(2000);
				Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
				//count all the check box available in site
				System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				
				
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(3000);
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				//single click to add one
				
				//to add multiple person then how to adult. in that case we can use looping technique.
					
				Thread.sleep(2000);
				
//				int i=1;
//				while(i<5) {
//					driver.findElement(By.id("hrefIncAdt")).click();
//					i++;
//				}
				//alternative using for loop
				for(int i=1; i<5; i++) {
					driver.findElement(By.id("hrefIncAdt")).click();
				}
				Thread.sleep(2000);
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
				driver.quit();

	}

}
