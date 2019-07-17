package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NotificationsAndroidPageFactory {
	AppiumDriver<AndroidElement> androidDriver;
	public NotificationsAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
//		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.RelativeLayout[3]")
	public AndroidElement clickOnNotificationsAndroid;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Editar']")
//	id- com.moofwd.br.fmu:id/menu_notifications_edit
	public AndroidElement clickOnNotificationsSettingsAndroid;
	
	
	@AndroidFindBy(xpath="com.moofwd.br.fmu:id/menu_notifications_edit")
	public AndroidElement clickOnNotificationSaveAndroid;
	
	
	
	public void clickOnNotificationsAndroidFunction(){
		clickOnNotificationsAndroid.click();
	}
	public void clickOnNotificationsSettingsAndroidFunction(){
		clickOnNotificationsSettingsAndroid.click();
	}
	public void clickOnNotificationSaveAndroidFunction() throws InterruptedException{
		try{
		clickOnNotificationSaveAndroid.click();
		Thread.sleep(3000);
		clickOnBackButtonAndroid();
		Thread.sleep(3000);
		clickOnBackButtonAndroid();
//		androidDriver.navigate().back();
//		androidDriver.navigate().back();
		}
		catch(Exception e){
			System.out.println("Unable to click on clickOnNotificationSaveAndroidFunction");
			clickOnBackButtonAndroid();
			Thread.sleep(3000);
			clickOnBackButtonAndroid();
		}
	}
	public void clickOnBackButtonAndroid(){
		androidDriver.navigate().back();
	}


}
