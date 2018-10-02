package krishna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("cookies were loaded");
		}
		else{
			System.out.println("cookies were not loaded");
		}
		driver.close();
	

	}

}
