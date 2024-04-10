package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethod extends BaseClass {
	public void acccess()
	{
		//parent access element
		WebElement elementname2=driver.findElement(By.xpath("//input[@id='value-a']//parent: : div"));
		WebElement elementname3=driver.findElement(By.xpath("//button[@id='button-one']//parent: : div"));
		//child access method
		WebElement elementname4=driver.findElement(By.xpath("//button[@type='button']//child: : span"));
		WebElement elementname5=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child: : ul"));
		
		
		

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
