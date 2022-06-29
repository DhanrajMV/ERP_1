package TestScripts;
//Pending Confirmation Btn
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PomRepository.Leave_Request_Approval_Process__POM_1_2;
import PomRepository.loginPage;
import genericLibrary.BaseTest;

public class Leave_Request_Approval_1_2 extends BaseTest{
	
	@Test
	public static void main() throws InterruptedException {
		
		driver.get("http://192.168.6.18:501/");
		 loginPage lp=new loginPage(driver);
		 
		 lp.id("000850");
		 lp.pass("A");
		 lp.cap();
		 Thread.sleep(5000);
		 lp.sigin();
		
		 
	//Approval Inbox
		WebElement ele = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[15]"));
		Actions actions= new Actions(driver);
		actions.moveToElement(ele).perform();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//span[text()='Inbox']
		//*[@id="Modules"]/li[11]/div
		//ul[@id='Modules']/li[11]/ul/li/a
		//a[@href=\"javascript:LogUserModuleData('Inbox','WFInbox','')\"]
		
		//Index
		 WebElement elew = driver.findElement(By.xpath("//*[@id=\"Modules\"]/li[11]/ul/li/a"));
 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", elew);
		 
		// actions.click(elew);
		// WebDriverWait wait=new WebDriverWait(driver,3);
		// WebElement ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("'Modules']/li[11]/ul/li/a")));
		 Leave_Request_Approval_Process__POM_1_2 a=new Leave_Request_Approval_Process__POM_1_2(driver);
		 //Submit Btn
		 a.sub();
		 
		 //Remark Btn
		 a.remark();
		 
		 //Confirm Btn
		 a.conf();
		//WebElement ele2 = driver.findElement(By.xpath(("(//button[@class=\"btn btn-success dropdown-toggle\"])[2]")));
		/// JavascriptExecutor js1 =(JavascriptExecutor)driver;
			//	 js1.executeScript("arguments[0].click();", ele2);
		//WebElement ele2 = driver.findElement(By.xpath("//button[@aria-expanded='false']"));
		//	Actions action= new Actions(driver);
			//action .moveToElement(ele2).perform();
		 
					 //Submit Btn
					 a.submit();
	}

}
