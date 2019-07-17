package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SPTranceAndroidPageFactory {
	AppiumDriver<AndroidElement> androidDriver;
	public SPTranceAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
//		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.RelativeLayout[4]")
	public AndroidElement clickOnSPTranceAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]")
	public AndroidElement clickOnCarteirinhaAndroid;	
	
	public void clickOnSPTranceAndroidFunction(){
		clickOnSPTranceAndroid.click();
	}
	public void clickOnCarteirinhaAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		try{
		clickOnCarteirinhaAndroid.click();
		Thread.sleep(3000);
		androidDriver.navigate().back();
		}
		catch(Exception e){
			System.out.println("Unable to click on clickOnCarteirinhaAndroidFunction");
		}
	}
}
