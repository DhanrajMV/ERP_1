package LoginToWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PomRepository.loginPage;
import genericLibrary.BaseTest;

public class leaveRequest extends BaseTest {

	@Test
	public static void login() throws InterruptedException {
		
		driver.get("http://192.168.6.18:501/");
//		driver.findElement(By.id("txtLoginName")).sendKeys("000010");
//		driver.findElement(By.id("txtpassword")).sendKeys("A");
//		Thread.sleep(5000);	
//		driver.findElement(By.xpath("//button[@class='login100-form-btn submit']")).click();
		
		loginPage lp=new loginPage(driver);
		lp.userName("000001");
		lp.password("A");
		Thread.sleep(5000);
		lp.signIn();
		
		
		
//		click on Employee service
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		WebElement employeeSelfService = driver.findElement(By.xpath("//span[text()='Employee Self Service ']"));
		js.executeScript("arguments[0].click();",employeeSelfService );	
		
//		click on leave request
		WebElement	leaveRequest=driver.findElement(By.xpath("//span[text()='Leave Request']"));	
		js.executeScript("arguments[0].click();",leaveRequest );	
		
//		click on request
		driver.findElement(By.id("btnNewLeaveRequest")).click();
		
//		selecting the employee
		driver.findElement(By.xpath("(//a[@class=\"chosen-single\"])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Employee Details']/..//input[@class=\"chosen-search-input\"]")).sendKeys("avinash g",Keys.ENTER);
		
//		selecting the request type
		driver.findElement(By.xpath("//label[text()='Request Type']/..//span[text()='-Select-']")).click();
		driver.findElement(By.xpath("//label[text()='Request Type']/..//input[@class=\"chosen-search-input\"]")).sendKeys("leave request",Keys.ENTER);
		
//		selecting the leave type
		driver.findElement(By.xpath("//label[text()='Leave Type']/..//span[text()='-Select-']")).click();
		driver.findElement(By.xpath("//label[text()='Leave Type']/..//input[@class=\"chosen-search-input\"]")).sendKeys("CASUAL LEAVE",Keys.ENTER);
		
		
//		choose action and submit
		WebElement chooseAction = driver.findElement(By.xpath("//button[contains(text(),'Choose Action')]"));
		js.executeScript("arguments[0].scrollIntoView();", chooseAction);
		js.executeScript("arguments[0].click();",chooseAction );
	
//		click submit
		driver.findElement(By.xpath("//input[@class='Actionstyle']")).submit();
		
		
		
		
		
		
//		WebElement payrolElement=driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[11]"));   (180, 141)
//		
//		Actions action=new Actions(driver);
//		action.moveToElement(payrolElement).perform();
	}

}
