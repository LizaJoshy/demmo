package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommand extends BaseClass {
	public void findElement()
	{
		WebElement elementname1=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		elementname1.click();
		WebElement elementname2=driver.findElement(By.id("single-input-field"));
		elementname2.sendKeys("hai goodmorning");
		WebElement elementname3=driver.findElement(By.id("button-one"));
		elementname3.click();
		WebElement elementname4=driver.findElement(By.id("value-a"));
		elementname4.sendKeys("12");
		
		WebElement elementname5=driver.findElement(By.id("value-b"));
		elementname5.sendKeys("20");
		
		
		WebElement elementname6=driver.findElement(By.id("button-two"));
		elementname6.click();
		//WebElement elementname7=driver.findElement(By.linkText("Checkbox Demo"));
		//elementname7.click();
		//WebElement elementname8=driver.findElement(By.xpath("//label[@for='gridCheck']"));
		//elementname8.click();
		
	}

	public static void main(String[] args) {
		WebElementCommand c=new WebElementCommand();
		c.initialiseBrowser();
		c.findElement();
		//c.driverQuit();
		// TODO Auto-generated method stub

	}

}
