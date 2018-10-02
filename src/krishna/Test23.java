package krishna;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test23 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.name("cars"));
		Select s=new Select(e);
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		a.click(s.getOptions().get(2)).build().perform();
		a.click(s.getOptions().get(3)).build().perform();
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		List<WebElement> l=s.getAllSelectedOptions();
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
		Thread.sleep(5000);
		driver.close();



	}

}
