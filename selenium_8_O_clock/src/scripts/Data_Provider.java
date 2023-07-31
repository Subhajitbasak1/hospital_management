package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider 
{
 @DataProvider(name = "abc")
 String[][] fetch()
 {
 String[][] str={{"subhajit","1234"},{"subha","5678"}};
 return str;
 }
 
 @Test(dataProvider = "abc")
 void test(String un, String pwd) throws Exception
 {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.fb.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Log in']]")).click();
	Thread.sleep(2000);
 }
}
