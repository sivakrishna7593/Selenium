package krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test9 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\siva203\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("sivakrishna");
		driver.findElement(By.xpath(".//*[@id='u_0_i']")).sendKeys("bandla");
		driver.findElement(By.name("reg_email__")).sendKeys("9441437637");
		driver.findElement(By.name("reg_passwd__")).sendKeys("9441437637");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("birthday_day"));
		Select s=new Select(e);
		s.selectByValue("7");
		WebElement f=driver.findElement(By.name("birthday_month"));
		Select a=new Select(f);
		a.selectByVisibleText("May");
		WebElement g=driver.findElement(By.name("birthday_year"));
		Select b=new Select(g);
		b.selectByValue("1993");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='u_0_w']/span[2]/label")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		driver.close();


	}

}
