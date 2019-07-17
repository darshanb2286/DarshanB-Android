package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.SPTranceAndroidPageFactory;

public class SPTransAndroid extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp SettingsAndroid::");
		sptranceAndroidPage = new SPTranceAndroidPageFactory(androidDriver);
	}
	@Test(priority=35)
	public void click_On_SPTrance(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SPTRANCE_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_SPTRANCE_ANDROID)).click();
		test = extent.createTest("click_On_SPTrance");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_SPTrance Started Executing.", ExtentColor.PINK));
		sptranceAndroidPage.clickOnSPTranceAndroidFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_SPTrance"+e.getMessage());
//		}
	}
	@Test(priority=36)
	public void click_On_Carteirinha(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_CARTEIRINHA_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_CARTEIRINHA_ANDROID)).click();
		test = extent.createTest("click_On_Carteirinha");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Carteirinha Started Executing.", ExtentColor.PINK));
		sptranceAndroidPage.clickOnCarteirinhaAndroidFunction(androidDriver);
			
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Carteirinha"+e.getMessage());
//		}
	}

}
