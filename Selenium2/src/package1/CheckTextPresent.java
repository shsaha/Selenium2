package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTextPresent {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaswata\\Downloads\\New folder\\Selenium2\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signup.int.staging.insly.training/signup");
		
		
		//check text on page
		if(driver.getPageSource().contains("Sign up and start using")) {
			System.out.println("Text verified on page");
		} else {
			System.out.println("Text not present on page");
		}
		driver.close();

	}
	

}
