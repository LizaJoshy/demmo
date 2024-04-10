package seleniumprograms;

public class BrowserCommands extends BaseClass {
	public void commands()
	{
		String title=driver.getTitle();// get the title of current webpage
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
 
	public static void main(String[] args) {
		BrowserCommands c= new BrowserCommands();
		c.initialiseBrowser();
		c.commands();
		c.driverQuit();
		
		
		
		// TODO Auto-generated method stub

	}

}
