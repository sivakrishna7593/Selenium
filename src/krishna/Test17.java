package krishna;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.tagName("select"));
		int count=0;
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				count=count+1;
			}
		}
		System.out.println(count);
		driver.close();


	}

}
