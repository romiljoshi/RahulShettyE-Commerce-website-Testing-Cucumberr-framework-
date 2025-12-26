package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends BasePage{
	public loginpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='login-wrapper my-auto p-5']//h1") 
	WebElement text;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='userPassword']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='login']")
	WebElement btnLogin;

	public boolean verify_Login_Txt() 
	{
		boolean b=text.isDisplayed();
		return b;
	}
	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
}
