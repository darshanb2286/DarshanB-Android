package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NoticiasAndroidPageFactory {
	AppiumDriver<AndroidElement> androidDriver;
	public NoticiasAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
//		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.RelativeLayout[2]")
	public AndroidElement clickOnNoticiasAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]")
	public AndroidElement clickOnOneOfNoticiasAndroid;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='MORE']")
	public AndroidElement clickOnNoticiasLinkAndroid;
	
	
	
	public void clickOnNoticiasAndroidFunction(){
		clickOnNoticiasAndroid.click();
	}
	public void clickOnOneOfNoticiasAndroidFunction(){
		clickOnOneOfNoticiasAndroid.click();
	}
	public void clickOnNoticiasLinkAndroidFunction(){
		clickOnNoticiasLinkAndroid.click();
	}



}
