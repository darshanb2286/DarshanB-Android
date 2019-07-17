package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.AvisosPageAndroidFactory;

public class AvisosAndroid extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp AvisosAndroid::");
		avisosPageAndroid = new AvisosPageAndroidFactory(androidDriver);
	}
	@Test(priority=5)
	public void click_On_AvisosAndroid(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_AVISOS_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_AVISOS_ANDROID)).click();
			test = extent.createTest("click_On_Avisos");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Avisos Started Executing.", ExtentColor.CYAN));
			avisosPageAndroid.clickOnAvisosAndroidFunction();
			System.out.println("click_On_AvisosAndroid :: "+ androidDriver);
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_AvisosAndroid "+e.getMessage());
//		}
	}
	@Test(priority=6)
	public void click_On_OneofAvisos() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_ONE_OF_AVISOS_LIST_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_ONE_OF_AVISOS_LIST_ANDROID)).click();
			test = extent.createTest("click_On_OneOf_Avisos");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Avisos Started Executing.", ExtentColor.CYAN));
			avisosPageAndroid.clickOnOneOfAvisosListAndroidFunction();
//			Thread.sleep(3000);
//			avisosPageAndroid.clickOnBackButtonAndroidFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_OneofAvisos "+e.getMessage());
//			this.androidDriver.navigate().back();
//		}
	
	}
	@Test(priority=7, enabled=false)
	public void click_On_link_icon() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_AVISOS_LINK_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_AVISOS_LINK_ANDROID)).click();
		
			test = extent.createTest("Avisos_click_On_link_icon");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Avisos_click_On_link_icon Started Executing.", ExtentColor.CYAN));
			avisosPageAndroid.clickOnAvisosLinkAndroidFunction();
			throw new SkipException("Skipping this exception");
//			this.androidDriver.navigate().back();
//			this.androidDriver.navigate().back();
//			Thread.sleep(5000);
//			this.androidDriver.navigate().back();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_link_icon "+e.getMessage());
//			this.androidDriver.navigate().back();
//			this.androidDriver.navigate().back();
//		}
	}
}
