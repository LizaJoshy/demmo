package seleniumprograms;

public class NavigationCommands extends BaseClass{
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommands c = new NavigationCommands();
		c.initialiseBrowser();
		c.navigationCommands();
		//c.driverQuit();
		// TODO Auto-generated method stub

	}

}
