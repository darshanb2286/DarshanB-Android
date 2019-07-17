package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.DocumentsAndroidPageFactory;

public class DocumentsAndroid extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp DocumentsAndroid::");
		documentsAndroidPage = new DocumentsAndroidPageFactory(androidDriver);
	}
	@Test(priority=9)
	public void click_On_Documents() throws InterruptedException{
		System.out.println("click_On_Documents");
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_DOCUMENTS_ANDROID)));
			test = extent.createTest("click_On_Documents");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Documents Started Executing.", ExtentColor.ORANGE));
			documentsAndroidPage.clickOnDocumentsAndroidFunction(androidDriver);
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_DOCUMENTS_ANDROID)).click();
//						try{
//				WebDriverWait waittogetback= new WebDriverWait(this.androidDriver,120);
//				System.out.println("Test1----");
//				waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CHECK_FOR_NO_DOCUMENTS_IN_LIST)));
//				System.out.println("Test2----");
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button"+e.getMessage());
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Documents"+e.getMessage());
//		}	
	}


}
