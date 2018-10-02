package krishna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://site21.way2sms.com/content/index.html?");
		Thread.sleep(5000);	
		String x=driver.getCurrentUrl();
		if(x.contains("https"))
		{
			System.out.println("secured site");
		}
		else{
			System.out.println("Not secured");
		}
		driver.close();


	}

}
