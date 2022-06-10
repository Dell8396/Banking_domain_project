package PomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;


public class Fund_Page_G extends UtilClass1{
WebDriver driver ;
//1
	@FindBy(xpath="(//div[text()='All transactions'])")
	private WebElement AllTransaction;
//2	
	@FindBy(xpath="//div[text()='Balance available']")
	private WebElement fundAvailableText;

	@FindBy(xpath="(//input[@id='wrs445Amount'])")
	private WebElement amountInputField;
//3
	@FindBy(xpath="(//input[@id='vpa_input'])")
	private WebElement EnterUPI;
//4	
	@FindBy(xpath="(//span[text()='DEPOSIT MONEY'])")
	private WebElement DepositMoneyButton;
//5	
	@FindBy(xpath="//(//div[@id='amupNew89TransformDiv']/div)")
	private WebElement amountConfirmText;
//6
	@FindBy(xpath="(//div[text()='CANCEL PAYMENT'])")
	private WebElement CANCELPAYMENTD;
//7	
	@FindBy(xpath="(//span[@class='absolute-center'])[3]")
	private WebElement OKYAbutton;
	
//8 
	@FindBy(xpath="(//div[text()='WITHDRAW'])")
	private WebElement Withdraw;
	
	
	
	
	
	public Fund_Page_G (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public boolean is_verifyAllTransactionVIsiable1()
	{
	try {
	expliciteWait(driver,AllTransaction); 
	return true ;
	}
	catch(Exception e ) {
		e.printStackTrace();
		return false;
        }
	}

	public boolean verifyFundPageLoaded2() throws InterruptedException, IOException
	{
		amountInputField.clear();
		
		String amountToEnter = "500";
		
		amountInputField.sendKeys(amountToEnter);
//		
//		is_VerifyEnterUPI3();
//		
//		DepositMoneyButton.click();
//		
//		WebElement element = expliciteWait(driver, amountConfirmText);
//		
//		double getEnteredAmout = Double.parseDouble(element.getText().split("₹")[1]);
//		
//		int k = (int) getEnteredAmout;
//		
//		System.out.println(k);
//		
//		if(amountToEnter.equals(String.valueOf(k)))
//		{
//			return true;
//		}
//		
//		return false;
		return false;
	}
	
	
	public void is_VerifyEnterUPI3() throws InterruptedException, IOException
	{
		expliciteWait(driver,EnterUPI);
		EnterUPI.sendKeys(getDataFromPropertyFile("UPI"));
	}
	
	public void is_ClickCDepositButton4() throws InterruptedException, IOException
	{
		expliciteWait(driver,DepositMoneyButton).click();
	}
	

	public void is_ClickCANCELPAYMENTD5() throws InterruptedException, IOException
	{
		
		expliciteWait(driver,CANCELPAYMENTD).click();
	}
	
	
	
	public void is_CLickWithdraw6() throws InterruptedException, IOException
	{
		expliciteWait(driver,Withdraw);
		Withdraw.click();
	}
	
	public void is_ClickOKYAbutton6() throws InterruptedException, IOException
	{
		expliciteWait(driver,OKYAbutton);
		OKYAbutton.click();
	}
	
	
	

}
