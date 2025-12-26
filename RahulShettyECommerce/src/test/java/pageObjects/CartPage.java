package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class CartPage extends BasePage{
	public CartPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//h3[normalize-space()='ZARA COAT 3']")
	WebElement txt_first_iteam;
	
	@FindBy(xpath="//h3[normalize-space()='ADIDAS ORIGINAL']")
	WebElement txt_second_iteam;
	
	@FindBy(xpath="//p[normalize-space()='$ 11500']")
	WebElement price1;
	
	@FindBy(xpath="//li[@class='items odd ng-star-inserted']//div[@class='prodTotal cartSection']//p[contains(text(),'$ 11500')]")
	WebElement price2;
	
	@FindBy(xpath="//div[@class='subtotal cf ng-star-inserted']//li[1]")
	WebElement subTotal;
	
	@FindBy(xpath="//li[1]//span[2]")
	WebElement final_subTotal;
	
	@FindBy(xpath="//div[@class='wrap cf']//li[2]")
	WebElement Total;
	
	@FindBy(xpath="//li[2]//span[2]")
	WebElement Final_Total;
	
	@FindBy(xpath="//button[normalize-space()='Continue Shopping']")
	WebElement Continuelnk;
	
	@FindBy(xpath="//div[@class='subtotal cf ng-star-inserted']//ul//li[3]//button")
	WebElement lnk_checkout;
	
	@FindBy(xpath="//div[normalize-space()='Shipping Information']")
	WebElement verifytext;
	
	@FindBy(xpath="//div[@class='details__user']//label")
	WebElement emailbox;
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement countrybox;
	
	@FindBy(xpath="//section[@class='ta-results list-group ng-star-inserted']//button[2]")
	WebElement select;
	
	@FindBy(xpath="//a[normalize-space()='Place Order']")
	WebElement placeorder;
	
	@FindBy(xpath="//table[@class='wrapper']//table//tbody//tr[4]//table//h1")
	WebElement cnfMssg;
	
	@FindBy(xpath="//button[@routerlink='/dashboard/myorders']")
	WebElement order;
	
	public boolean verify_ZARA_text() 
	{
		boolean i=txt_first_iteam.isDisplayed();
		return i;
	}
	
	public boolean verify_Adidas_text() 
	{
		boolean i=txt_second_iteam.isDisplayed();
		return i;
	}
	
	public boolean verify_ZARA_coat_price() 
	{
		boolean b=price1.isDisplayed();
		return b;
	}
	
	public boolean verify_adidas_price() 
	{
		boolean b=price2.isDisplayed();
		return b;
	}
	
	public boolean verify_subtotal_firt_product() 
	{
		boolean c=subTotal.isDisplayed();
		return c;
	}
	
	public boolean verify_finalSubTotal_() 
	{
		boolean c=final_subTotal.isDisplayed();
		return c;
	}
	
	public boolean verify_Total_firt_product() 
	{
		boolean d=Total.isDisplayed();
		return d;
	}
	
	public boolean verify_FinalTotal() 
	{
		boolean d=Final_Total.isDisplayed();
		return d;
	}
	
	public void click_Continue() 
	{
		Continuelnk.click();
	}
	
	public void click_cheackout() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor)BaseClass.getDriver();
		js.executeScript("arguments[0].scrollIntoView();", lnk_checkout);
		Thread.sleep(3000);
		lnk_checkout.click();
	}
	
	public boolean verifyCheckoutPage() 
	{
		boolean o=verifytext.isDisplayed();
		return o;
	}
	public String verify_email() 
	{
		String actual_string=emailbox.getText();
		return actual_string;
	}
	
	public void enter_country_name() 
	{
		countrybox.sendKeys("India");
		select.click();
		
	}
	
	public void Place_Order() 
	{
		placeorder.click();
	}
	
	public boolean order_placed_mssge() 
	{
		boolean z=cnfMssg.isDisplayed();
		return z;
	}
	
	public void Click_OrderPage() 
	{
		order.click();
	}
}
