package test.java.TestScripts;

import java.util.Map;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class asdf {

	public static void main(String[] argfs)
	{
		
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		
//		
//		// Create object of ChromeDriver class
//		ChromeDriver driver=new ChromeDriver();
//
//		// getCapabilities will return all browser capabilities
//		Capabilities cap=driver.getCapabilities();
//
//		// asMap method will return all capability in MAP
//		Map<String, Object> myCap=cap.asMap();
//
//		// print the map data-
//		System.out.println(myCap);
		
		
		ChromeOptions opt=new ChromeOptions();
		// pass the debuggerAddress and pass the port along with host. Since I am running test on local so using localhost
		opt.setExperimentalOption("debuggerAddress","localhost:63443");
				
		WebDriver driver1=new ChromeDriver(opt);
		driver1.manage().window().maximize();
		

		// now you can use now existing Browser
		driver1.get("http://facebook.com");
//		driver1.get("https://mail.ideainfinityit.com/?_task=mail&_mbox=Sent%20Items");
		
			
		
	}

}
