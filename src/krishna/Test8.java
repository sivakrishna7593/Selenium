package krishna;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://site21.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		String x=driver.getWindowHandle();
		System.out.println(x);
		driver.findElement(By.xpath("//*[contains(@src,'android-button')]")).click();
	
		Thread.sleep(5000);
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		driver.close();

	}

}
