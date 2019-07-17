package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContactUsAndroidPageFactory {


	AppiumDriver<AndroidElement> androidDriver;
	public ContactUsAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.RelativeLayout[4]")
	public AndroidElement clickOnContactUsAndroid;
	
	
	public void clickOnContactUsAndroidFunction(){
		try{
		System.out.println("clickOnContactUsAndroidFunction ::");
		clickOnContactUsAndroid.click();
		Thread.sleep(5000);
		androidDriver.navigate().back();
		}
		catch(Exception e){
			System.out.println("Unable to click on clickOnContactUsAndroidFunction :: ");
		}
	}




}
