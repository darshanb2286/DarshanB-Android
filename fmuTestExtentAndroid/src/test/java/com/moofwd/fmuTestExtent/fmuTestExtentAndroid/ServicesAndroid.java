package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.ServicesAndroidPageFactory;

public class ServicesAndroid extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp PerfilAndroid::");
		serviceAndroidPage = new ServicesAndroidPageFactory(androidDriver);
	}
	@Test(priority=28)
	public void clickOn_Services(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SERVICES_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_SERVICES_ANDROID)).click();
			test = extent.createTest("clickOn_Services");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Services Started Executing.", ExtentColor.PINK));
			serviceAndroidPage.clickOnServicesAndroidFunction();
//			try{
//				WebDriverWait waittogetback= new WebDriverWait(this.androidDriver,120);
//				System.out.println("Test1---");
//				waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CHECK_TEXT_NO_SERVICE_FOUND)));
//				System.out.println("Test2---");
//			test = extent.createTest("Services_checkTextNoServiceFound");
//			test.log(Status.INFO, MarkupHelper.createLabel("verify Services_checkTextNoServiceFound Started Executing.", ExtentColor.PINK));
//			serviceAndroidPage.checkTextNoServiceFoundAndroidFunction(androidDriver);
//				this.androidDriver.navigate().back();
//				System.out.println("Test3---");
//				this.androidDriver.navigate().back();
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button"+e.getMessage());
//				
//			}
		
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Services "+e.getMessage());
//		}	
	}
	@Test(priority=29)
	public void click_On_OneoftheServices() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_ONEOF_SERVICES_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_ONEOF_SERVICES_ANDROID)).click();
			Thread.sleep(5000);
			test = extent.createTest("click_On_OneoftheServices");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_OneoftheServices Started Executing.", ExtentColor.PINK));
			serviceAndroidPage.clickOnOneOfServicesAndroidFunction(androidDriver);
//			try{
////				WebDriverWait waittogetback= new WebDriverWait(this.androidDriver,120);
////				System.out.println("Test1---");
////				waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='headerBackBtn']")));
//				System.out.println("Test2---");
//				this.androidDriver.navigate().back();
//				System.out.println("Test3---");
//				this.androidDriver.navigate().back();
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button"+e.getMessage());
//				
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_OneoftheServices"+e.getMessage());
//			this.androidDriver.navigate().back();
//		}
	}


}
