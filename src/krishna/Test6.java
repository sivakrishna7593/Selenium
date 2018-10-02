package krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://site21.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@src,'android-button')]")).click();
		Thread.sleep(5000);		
		driver.quit();


	}

}
