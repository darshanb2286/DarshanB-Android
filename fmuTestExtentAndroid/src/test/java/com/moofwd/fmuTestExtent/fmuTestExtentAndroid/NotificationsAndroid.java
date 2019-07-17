package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.NotificationsAndroidPageFactory;

public class NotificationsAndroid extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp NotificationsAndroid::");
		notificationAndroidPage= new NotificationsAndroidPageFactory(androidDriver);
	}
	@Test(priority=20)
	public void click_On_notifications(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_ANDROID)).click();
			test = extent.createTest("click_On_notifications");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_notifications Started Executing.", ExtentColor.PINK));
			notificationAndroidPage.clickOnNotificationsAndroidFunction();
//			Thread.sleep(3000);
//			this.androidDriver.navigate().back();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_AvisosAndroid "+e.getMessage());
//		}	
	}
	@Test(priority=21)
	public void click_On_Notifications_Settings(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SETTINGS_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SETTINGS_ANDROID)).click();
			test = extent.createTest("click_On_Notifications_settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Notifications_settings Started Executing.", ExtentColor.PINK));
			notificationAndroidPage.clickOnNotificationsSettingsAndroidFunction();
//			Thread.sleep(3000);
//			this.androidDriver.navigate().back();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Notifications_Settings "+e.getMessage());
//			this.androidDriver.navigate().back();
//		}	
	}
	@Test(priority=22)
	public void click_On_Notification_Save_Android() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SAVE_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SAVE_ANDROID)).click();
			test = extent.createTest("clickOnNotificationsSaveIos");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnNotificationsSaveIos Started Executing.", ExtentColor.PINK));
			notificationAndroidPage.clickOnNotificationSaveAndroidFunction();
			
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Notification_Save_Android "+e.getMessage());
//		}	
	
	}
}
