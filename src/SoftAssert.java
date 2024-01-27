import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SoftAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.browserstack.com/");
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://www.browserstack.com/");
		String getActualTitle = driver.getTitle();
		
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		////assertNotEquals
		softAssert.assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		
		//assertEquals
		softAssert.assertNotEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		
		//assertNull
		softAssert.assertNull(verifyTitle);
		
		//assertNotNull
		softAssert.assertNotNull(verifyTitle);
		
		//assertTrue
		softAssert.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
		
		//assertFalse
		softAssert.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");

		//assertAll
		softAssert.assertAll();
		
		driver.quit();

	}

	private void assertEquals(String getActualTitle, String string) {
		// TODO Auto-generated method stub
		System.out.println(getActualTitle);
		
	}

	private void assertNotEquals(String getActualTitle, String string) {
		// TODO Auto-generated method stub
		System.out.println(getActualTitle);
		
		
	}

	private void assertNull(Boolean verifyTitle) {
		// TODO Auto-generated method stub
		System.out.println(verifyTitle);
		
	}

	private void assertNotNull(Boolean verifyTitle) {
		// TODO Auto-generated method stub
		System.out.println(verifyTitle);
		
	}

	private void assertTrue(boolean equals, String string) {
		// TODO Auto-generated method stub
		System.out.println(equals);
		
	}

	private void assertFalse(boolean equals, String string) {
		// TODO Auto-generated method stub
		System.out.println(equals);
		
	}

	private void assertAll() {
		// TODO Auto-generated method stub
		
	}

}
