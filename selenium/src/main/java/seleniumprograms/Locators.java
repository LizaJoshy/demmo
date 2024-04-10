package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Locators extends BaseClass {
	public void locatorMethod()
	{
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		
		//id
		WebElement elementname=driver.findElement(By.id("single-input-field"));
		WebElement elementname1=driver.findElement(By.id("value-a"));
		WebElement elementname2=driver.findElement(By.id("value-b"));
		WebElement elementname3=driver.findElement(By.id("button-two"));
		
		//className
		WebElement elementname4=driver.findElement(By.className("btn btn-primary"));
		WebElement elementname5=driver.findElement(By.className("form-check-label"));
		WebElement elementname6=driver.findElement(By.className("select2-selection select2-selection--multiple"));
		WebElement elementname7=driver.findElement(By.className("clearfix"));
		
		//name
		WebElement elementname8=driver.findElement(By.name("viewport"));
		WebElement elementname9=driver.findElement(By.name(""));
		
		//linkText
		WebElement elementname10=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement elementname11=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement elementname12=driver.findElement(By.linkText("Select Input"));
		
		//partialLinkText
		WebElement elementname13=driver.findElement(By.partialLinkText("Simple Form "));
		WebElement elementname14=driver.findElement(By.partialLinkText("Checkbox "));
		WebElement elementname15=driver.findElement(By.partialLinkText("Radio Buttons"));
		WebElement elementname16=driver.findElement(By.partialLinkText("Ajax Form"));
		
		//cssselector tag and id
		
		WebElement elementname17=driver.findElement(By.cssSelector("button#button-one"));
		WebElement elementname18=driver.findElement(By.cssSelector("button#button-two"));
		WebElement elementname19=driver.findElement(By.cssSelector("input#value-a"));
		
		//cssselector tag and class
		WebElement elementname20=driver.findElement(By.cssSelector("div.header-top"));
		WebElement elementname21=driver.findElement(By.cssSelector("textarea.form-control"));
		WebElement elementname22=driver.findElement(By.cssSelector("div.card-body"));
		
		//cssselector tag and attribute
		
		WebElement elementname23=driver.findElement(By.cssSelector("div['class=header-top']"));
		WebElement elementname24=driver.findElement(By.cssSelector("div['id=message-two']"));
		WebElement elementname25=driver.findElement(By.cssSelector("section['class=clearfix']"));
		WebElement elementname26=driver.findElement(By.cssSelector("meta['name=description']"));
		
		//cssselector tag,name,attribute
		
		WebElement elementname27=driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
		WebElement elementname28=driver.findElement(By.cssSelector("a.nav-link[href=index.php]"));
		WebElement elementname29=driver.findElement(By.cssSelector("label.form-check-label[for=inlineRadio2]"));
		WebElement elementname30=driver.findElement(By.cssSelector("label.form-check-label[for=inlineRadio1]"));
		
		
		
		
		
		
	}
	
		
	
	
	


public static void main(String args[])
{
	Locators l = new Locators();
	l.initialiseBrowser();
	l.locatorMethod();
	
	
}
}