package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SocialAndroidPageFactory {
	AppiumDriver<AndroidElement> androidDriver;
	public SocialAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
//		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.RelativeLayout[3]")
	public AndroidElement clickOnSocialAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]")
	public AndroidElement clickOnSocialFacebookAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[2]")
	public AndroidElement clickOnSocialTwitterAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[3]")
	public AndroidElement clickOnSocialYouTubeAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[4]")
	public AndroidElement clickOnSocialInstagramAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[5]")
	public AndroidElement clickOnSocialLinkedInAndroid;
	
	public void clickOnSocialAndroidFunction(){
		clickOnSocialAndroid.click();
	}
	public void clickOnSocialFacebookAndroidFunction(){
		clickOnSocialFacebookAndroid.click();
	}
	public void clickOnSocialTwitterAndroidFunction(){
		clickOnSocialTwitterAndroid.click();
	}
	public void clickOnSocialYouTubeAndroidFunction(){
		clickOnSocialYouTubeAndroid.click();
	}
	public void clickOnSocialInstagramAndroidFunction(){
		clickOnSocialInstagramAndroid.click();
	}
	public void clickOnSocialLinkedInAndroidFunction(){
		clickOnSocialLinkedInAndroid.click();
	}


}
