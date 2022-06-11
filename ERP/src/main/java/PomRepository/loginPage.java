package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	@FindBy(xpath="//input[@placeholder='Enter User Name']")
	public WebElement UserTxt;
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	public WebElement Passtxt;
	@FindBy(xpath="//input[@class='submit__input']")
	public WebElement captcha;
	@FindBy(xpath="//div[@class='submit__overlay']")
	public WebElement SiginBtn;

	public void id(String un) {
		UserTxt.sendKeys(un);
	}
	public void pass(String pwd) {
		Passtxt.sendKeys(pwd);
	}
	public void cap() {
		captcha.click();
	}
	public void sigin() {
		SiginBtn.submit();
	}

}
