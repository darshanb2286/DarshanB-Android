package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.FAQAndroidPageFactory;

public class FAQAndroid extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp AvisosAndroid::");
		faqAndroidPage = new FAQAndroidPageFactory(androidDriver);
	}
	@Test(priority=12)
	public void click_On_FAQ() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_FAQ_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_FAQ_ANDROID)).click();
			test = extent.createTest("click_On_FAQ");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_FAQ Started Executing.", ExtentColor.CYAN));
			faqAndroidPage.clickOnFAQAndroidFunction();
			Thread.sleep(3000);
//			try{
//				WebDriverWait waitforSearch= new WebDriverWait(this.androidDriver, 60);
//				waitforSearch.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.ENTER_TEXT_IN_TEXTFIELD_ANDROID)));
//				this.androidDriver.findElement(By.xpath(constantsTest.ENTER_TEXT_IN_TEXTFIELD_ANDROID)).sendKeys("test");
				test = extent.createTest("enterTextInTextFieldFAQIos");
				test.log(Status.INFO, MarkupHelper.createLabel("verify enterTextInTextFieldFAQIos Started Executing.", ExtentColor.CYAN));
				faqAndroidPage.enterTextInTextFieldAndroidFunction(androidDriver);
				
//		}
//			catch(Exception e){
//				System.err.println("Unable to send the keys at searchbox"+e.getMessage());
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_FAQ"+e.getMessage());
//		}
//		
	}

}
