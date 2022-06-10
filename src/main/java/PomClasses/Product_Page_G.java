package PomClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class Product_Page_G extends UtilClass1{
	WebDriver driver ;
	
	@FindBy(xpath="(//input[@id='globalSearch23'])")
	private WebElement SearchFiled;
	
	
	
	
	
	
	
	public Product_Page_G (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void is_SearchFiled1() throws EncryptedDocumentException, IOException {
		getDataFromExcelSheet(null, 0, 0);
	}
	
	
	

}