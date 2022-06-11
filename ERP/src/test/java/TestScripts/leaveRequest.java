package TestScripts;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import PomRepository.homePage;
import PomRepository.loginPage;
import genericLibrary.BaseTest;

public class leaveRequest extends BaseTest {

	@Test
	 public static void login() throws InterruptedException
	 {
		 driver.get("http://192.168.6.18:501/");
		 loginPage lp=new loginPage(driver);
		 
		 lp.id("000851");
		 lp.pass("A");
		 lp.cap();
		 Thread.sleep(5000);
		 lp.sigin();
		
		 homePage hp=new homePage(driver);
		
		 hp.employeeService();		 
		 hp.leaveReq();
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
		 
		 WebElement ele = hp.chooseAction();
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", ele);
		 
		 
		 hp.submit();
		 
		
		
	 }

}
