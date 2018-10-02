package krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test20 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("nights"));
		Select s=new Select(e);
        if(s.isMultiple())
        {
        	System.out.println("multi-select");
        }
        else
        {
        	System.out.println("single-select");	
        }
        Thread.sleep(5000);
        s.selectByIndex(9);
        Thread.sleep(5000);
        driver.close();

	}

}
