package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.ContactUsAndroidPageFactory;

public class ContactUsAndroid extends TestBase {
	@BeforeClass
public void setUp() throws MalformedURLException {
//	System.out.println("setUp Android ::");
	contactUsAndroidPage=new ContactUsAndroidPageFactory(androidDriver);
}
@Test(priority=8)
public void clickOn_ContactUs() throws InterruptedException{
		System.out.println("clickOn_ContactUs");
		Thread.sleep(5000);
//	try{
//		WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_CONTACT_US_ANDROID)));
//		this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_CONTACT_US_ANDROID)).click();
		test = extent.createTest("clickOn_ContactUs");
		test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_ContactUs Started Executing.", ExtentColor.GREEN));
		contactUsAndroidPage.clickOnContactUsAndroidFunction();
//		try{
//			WebDriverWait waittogetback= new WebDriverWait(this.androidDriver,120);
//			waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.moofwd.br.fmu:id/contact_logo")));
//			waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")));
//			Thread.sleep(5000);
//			System.out.println("Testing");
//			this.androidDriver.navigate().back();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on back button"+e.getMessage());
//		}
//	}
//	catch(Exception e){
//		System.err.println("Unable to click on clickOn_ContactUs"+e.getMessage());
//	}

	} 


}
