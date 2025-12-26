package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{
	public OrderPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//td[normalize-space()='ADIDAS ORIGINAL']")
	WebElement product1;
	
	@FindBy(xpath="//td[normalize-space()='ZARA COAT 3']")
	WebElement product2;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/button")
	WebElement delete1;
	
	@FindBy(xpath="//tbody/tr[2]/td[6]/button")
	WebElement delete2;
	
	@FindBy(xpath="//i[@class='fa fa-sign-out']")
	WebElement signOut;
	
	public boolean verify_first_ProductText() 
	{
		boolean a=product1.isDisplayed();
		return a;
	}
	
	public boolean verify_second_ProductText() 
	{
		boolean a=product2.isDisplayed();
		return a;
	}
	public void delete_first_iteam() 
	{
		delete1.click();
	}
	
	public void delete_second_iteam() 
	{
		delete2.click();
	}
	
	public void SignOut() 
	{
		signOut.click();
	}

}
