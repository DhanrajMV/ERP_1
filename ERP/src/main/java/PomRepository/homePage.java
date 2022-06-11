package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	WebDriver driver;	
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[11]")
	public WebElement employeeService;
	
	@FindBy(xpath="//span[text()='Leave Request']")
	public WebElement LeaveReq;
	
	@FindBy(xpath="//input[@id='btnNewLeaveRequest']")
	public WebElement Reqbtn;
	
	@FindBy(xpath="(//a[@class='chosen-single'])[1]") 
	public WebElement empDetails;
	
	@FindBy(xpath="//li[text()='000854 ~ Harimohan ~ Debnath']") 
	public WebElement empName;	
	
	//RequestType
	@FindBy(id = "ddlLeaveGround_chosen")
	public WebElement reqType;
	@FindBy(xpath = "//li[text()='LEAVE REQUEST']")
	public WebElement reqName;
	
	//leaveType
	@FindBy(id = "ddlLeaveType_chosen")
	public WebElement leaveType;
	@FindBy(xpath = "//li[text()='CASUAL LEAVE']")
	public WebElement leaveName;
	
	//Selecting Start Date
	@FindBy (id = "txtLeaveStartDate")
	public WebElement startDateInput;
	@FindBy (xpath = "//select[@class='ui-datepicker-year']")
	public WebElement selectStartYearDropDown;
	@FindBy (xpath = "//select[@class='ui-datepicker-month']")
	public WebElement selectStartMonthDropDown;
	@FindBy (xpath = "//a[text()='18']")
	public WebElement selectStartDate;
	
	//Selecting End Date
	@FindBy (id = "txtLeaveEndDate")
	public WebElement endDateInput;
	@FindBy (xpath = "//select[@class='ui-datepicker-year']")
	public WebElement endYearDropDown;
	@FindBy (xpath = "//select[@class='ui-datepicker-month']")
	public WebElement endMonthDropDown;
	@FindBy (xpath = "//a[text()='20']")
	public WebElement endDate;
	
	//text in reason
	@FindBy (id="txtLeaveReason")
	public WebElement reason;
	
	//select choose Action //div[@id='divAction']/button
	@FindBy (xpath = "//div[@id='divAction']/button")
	public WebElement chooseAction;
	
	//click on submit
	@FindBy (xpath = "//input[@class='Actionstyle']")
	public WebElement submit;
	
	public void employeeService() {
		 employeeService.click();
	}
	public void leaveReq() {
		LeaveReq.click();
	}
	public void reqbtn() {
		Reqbtn.click();
	}
	public void empDetails() {
		empDetails.click();
	}
	public void empName() {
		empName.click();
	}
	public void reqType()
	{
		reqType.click();
	}
	public void reqName()
	{
		reqName.click();
	}
	public void leaveType()
	{
		leaveType.click();
	}
	public void leaveName()
	{
		leaveName.click();
	}
	
	
	public void startDateInput()
	{
		startDateInput.click();
	}
	public WebElement startYearDropDown()
	{
		return selectStartYearDropDown;
	}
	public WebElement startMonthDropDown()
	{
		return selectStartMonthDropDown;
	}
	public void selectStartDate()
	{
		selectStartDate.click();
	}
	
	public void endDateInput()
	{
		endDateInput.click();
	}
	public WebElement endYearDropDown()
	{
		return endYearDropDown;
	}
	public WebElement endMonthDropDown()
	{
		return endMonthDropDown;
	}
	public void endDate()
	{
		endDate.click();
	}
	public void reason(String strReason)
	{
		reason.sendKeys(strReason);
	}
	
	
	public WebElement chooseAction()
	{
		return chooseAction;
	}
	
	public void submit()
	{
		submit.click();
	}
	
	
	
	
}
