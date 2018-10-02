package krishna;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://site21.way2sms.com/content/index.html?");
		Thread.sleep(5000);	
		String t=driver.getWindowHandle();
		System.out.println(t);
		driver.findElement(By.xpath("//*[@src='../images/android-button.png']")).click();
		Thread.sleep(5000);	
		List<String>  l=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		driver.quit();
		


	}

}
