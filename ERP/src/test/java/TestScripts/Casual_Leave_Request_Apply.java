package TestScripts;
//Fail
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import PomRepository.Leave_Request_Apply_POM_1_1;
import PomRepository.loginPage;
import genericLibrary.BaseTest;

public class Casual_Leave_Request_Apply extends BaseTest {

	@Test
	 public static void login() throws InterruptedException
	 {
		 driver.get("http://192.168.6.18:501/");
		 loginPage lp=new loginPage(driver);
		 
		 lp.id("000651");
		 lp.pass("A");
		 lp.cap();
		 Thread.sleep(5000);
		 lp.sigin();
		
		 Leave_Request_Apply_POM_1_1 hp=new Leave_Request_Apply_POM_1_1(driver);
		
		 hp.employeeService();		 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement ele = hp.leaveReq();
		js.executeScript("arguments[0].click();", ele);
		hp.reqbtn();
		 
		 hp.empDetails();
		
		 hp.reqType();
		 hp.reqName();
		 
		 hp.leaveType();
		 hp.leaveName();
		 
		 hp.startDateInput();
		 Select year=new Select(hp.selectStartYearDropDown);
		 year.selectByValue("2021"); 
		 Select month=new Select(hp.selectStartMonthDropDown);
		 month.selectByVisibleText("Dec");
		 hp.selectStartDate();
		
		 hp.endDateInput();
		 Select eYear=new Select(hp.endYearDropDown);
		 eYear.selectByValue("2021"); 
		 Select eMonth=new Select(hp.endMonthDropDown);
		 eMonth.selectByVisibleText("Dec");
		 hp.endDate();
		 
		 hp.reason("asdasd");
		 
		 WebElement ele1 = hp.chooseAction();
		 JavascriptExecutor js1= (JavascriptExecutor)driver;
		 js1.executeScript("arguments[0].click();", ele1);
		 
		 
		 hp.submit();
		 
		
		
	 }

}
