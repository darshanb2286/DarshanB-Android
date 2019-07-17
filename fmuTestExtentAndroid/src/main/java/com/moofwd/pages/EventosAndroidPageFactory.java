package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EventosAndroidPageFactory {


	AppiumDriver<AndroidElement> androidDriver;
	public EventosAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
//		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(id="com.moofwd.br.fmu:id/dash_events_root_container")
//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]
	public AndroidElement clickOnEventosAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]")
	public AndroidElement clickOnEventosAntigoAndroid;
	
		
	
	
	public void clickOnEventosAndroidFunction(){
		clickOnEventosAndroid.click();
	}
	public void clickOnEventosAntigoAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		try{
		clickOnEventosAntigoAndroid.click();
		Thread.sleep(5000);
		androidDriver.navigate().back();
		}
		catch(Exception e){
			
		}
	}





}
