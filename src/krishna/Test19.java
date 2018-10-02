package krishna;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test19 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("nights"));
		Select s=new Select(e);
		List<WebElement> l=s.getOptions();
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i).getText());
		}
		driver.close();

	}

}
