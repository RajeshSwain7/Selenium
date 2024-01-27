import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssert {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com/");
		String ActualTitle = driver.getTitle();
		String verifyAssertNull=null;
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Testing Platform | BrowserStack");
		//assertEquals
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ExpectedTitle+ "," + ActualTitle);
		
		//assertNotEquals
		Assert.assertNotEquals(ExpectedTitle, "browserstack");
		System.out.println(ExpectedTitle);
		
		//assertTrue
		Assert.assertTrue(verifyTitleIsPresent);
		System.out.println(verifyTitleIsPresent);
		
		//assertFalse
		Assert.assertFalse(verifyTitleIsChanged);
		System.out.println(verifyTitleIsChanged);
		
		//assertNotNull
		Assert.assertNotNull(verifyTitleIsPresent);
		System.out.println(verifyTitleIsPresent);
		
		//assertNull
		Assert.assertNull(verifyAssertNull);
		System.out.println(verifyAssertNull);
		
		driver.quit();

	}

}
