package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public void initialiseBrowser()
	{
		driver=new ChromeDriver();//loading the driver
		driver.get("https://selenium.qabible.in/");//launching the url
		driver.manage().window().maximize();
		
	}
public void driverQuit()
{
	driver.close();
	//driver.quit();
}
public static void main(String args[])
{
	BaseClass c = new BaseClass();
	c.initialiseBrowser();
	//c.driverQuit();
}
}
