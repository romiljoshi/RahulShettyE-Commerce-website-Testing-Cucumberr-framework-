package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.CartPage;
import pageObjects.OrderPage;
import pageObjects.homepage;
import pageObjects.loginpage;

public class OnlineShopping {
	loginpage lp;
	homepage hp;
	CartPage cp;
	OrderPage op;
	
	@Given("the user navigates to login page")
	public void verify_login_text() {
	    lp=new loginpage(BaseClass.getDriver());
	    boolean tx=lp.verify_Login_Txt();
	    Assert.assertEquals(tx, true);
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
	    lp.setEmail(string);
	    lp.setPassword(string2);
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
	    lp.clickLogin();
	}

	@Then("the user should be redirected to the home page and verify ZARA Coat text")
	public void the_user_should_be_redirected_to_the_home_page_and_verify_zara_coat_text() {
	    hp=new homepage(BaseClass.getDriver());
	    boolean b=hp.verify_ZARA_txt();
	    Assert.assertEquals(b, true);
	}

	@Then("Add one item in a cart")
	public void add_one_item_in_a_cart() throws InterruptedException {
	    hp.addToCart1();
	    Thread.sleep(4000);
	}

	@When("user navigate to Cart page")
	public void user_navigate_to_cart_page() {
	    hp.ClickToCart();
	}

	@Then("verify price of product, subtotal and Total")
	public void verify_First_iteam() {
	     cp=new CartPage(BaseClass.getDriver());
	     
	     boolean text1=cp.verify_ZARA_text();
	     Assert.assertEquals(text1, true);
	     
	     boolean coat=cp.verify_ZARA_coat_price();
	     Assert.assertEquals(coat, true);
	     
	     
	     boolean subT=cp.verify_subtotal_firt_product();
	     Assert.assertEquals(subT, true);
	     
	     boolean Total1=cp.verify_Total_firt_product();
	     Assert.assertEquals(Total1, true);
	}

	@Then("user click on Continue Shopping")
	public void user_click_on_continue_shopping() {
	   cp.click_Continue();
	}

	@When("user again redirect to home page and add one more iteam")
	public void add_another_product_to_cart() throws InterruptedException {
	    hp.addToCart2();
	    Thread.sleep(4000);
	}

	@Then("user navigate to cart and verify")
	public void user_navigate_to_cart_and_verify() throws InterruptedException {
		hp.ClickToCart();//navigate to cart
	    boolean A=cp.verify_Adidas_text();// verify test "ADIDAS ORIGINAL"
	    Assert.assertEquals(A, true);
	    
	    boolean P=cp.verify_adidas_price();// verify adidas price
	    Assert.assertEquals(P, true);
	    
	    boolean S=cp.verify_finalSubTotal_();// verify subtotal of products added to cart
	    Assert.assertEquals(S, true);
	    
	    boolean T=cp.verify_FinalTotal();// verify final of all products
	    Assert.assertEquals(T, true);
	    
	    Thread.sleep(3000);
	    
	}

	@Then("user click on cheakout")
	public void user_click_on_cheakout() throws InterruptedException{
		
	    cp.click_cheackout();
	    Thread.sleep(3000);
	}


	@When("user navigate to chekout page")
	public void user_navigate_to_chekout_page() {
	    boolean shippingText=cp.verifyCheckoutPage();
	    Assert.assertEquals(shippingText, true);
	}
		
	@Then("user should verify {string} and enter country")
	public void user_should_verify_and_enter_country(String string) throws InterruptedException {
	   String email=cp.verify_email();
	   Assert.assertEquals(email, string);//verify email "romiljoshi766@gmail.com"
	   
	   Thread.sleep(3000);
	   cp.enter_country_name();//add country name
	   Thread.sleep(2000);
	}


	@When("user place the order")
	public void user_place_the_order() {
	    cp.Place_Order();
	}

	@Then("user verify the order confirmation")
	public void user_verify_the_order_confirmation() {
	    boolean placed=cp.order_placed_mssge();
	    Assert.assertEquals(placed, true);
	}

	@When("user navigate to order page")
	public void user_navigate_to_order_page() {
	    cp.Click_OrderPage();
	}

	@Then("user varify the order name and delete the order")
	public void user_varify_the_order_name_and_delete_the_order() throws InterruptedException {
		op=new OrderPage(BaseClass.getDriver());
		
	    boolean FP=op.verify_first_ProductText();
	    Assert.assertEquals(FP, true);
	    boolean SP=op.verify_second_ProductText();
	    Assert.assertEquals(SP, true);
	    Thread.sleep(3000);
	    
	    //delete all the iteams
	    op.delete_first_iteam();
	    Thread.sleep(3000);
	   // op.delete_second_iteam();
	    //Thread.sleep(2000);
	}

	@Then("user click on signout")
	public void user_click_on_signout() {
	   op.SignOut();
	}
}
