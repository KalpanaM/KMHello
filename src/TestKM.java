import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestKM {
	public static void main(String[] args)
	{
//		print("Welcome to Selenium");
		//Invoking Browser
		//Chrome -> ChromeDriver -> Methods()
		//IE -> IEDriver -> methods  
		//WebDriver methods + class methods
		//steps to invoke chrome Driver
		
		//System.setProperty("webdriver.chrome.driver", null); -> Replaces by Selenium Manager take care
		WebDriver WD =new ChromeDriver();
		WD.get("https://www.amazon.co.uk");
		System.out.println(WD.getTitle());
		int AR[]= {11,22,33,44,55};
		
		//for loop
		for(int i=0; i<AR.length;i++)
		{
			System.out.println(AR[i]);
		}
		for (int x:AR)
		{
			System.out.println(x);
		}
		
		WD.quit();
	}

}
