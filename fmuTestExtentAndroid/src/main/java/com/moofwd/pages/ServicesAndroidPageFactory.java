package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ServicesAndroidPageFactory {

	AppiumDriver<AndroidElement> androidDriver;
	public ServicesAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
//		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.RelativeLayout[2]")
	public AndroidElement clickOnServicesAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView")
	public AndroidElement checkTextNoServiceFoundAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ExpandableListView/android.widget.LinearLayout[2]")
	public AndroidElement clickOnOneOfServicesAndroid;
	
	
	
	public void clickOnServicesAndroidFunction(){
		clickOnServicesAndroid.click();
	}
	public void checkTextNoServiceFoundAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		
		try{
			checkTextNoServiceFoundAndroid.click();
			Thread.sleep(3000);
			androidDriver.navigate().back();
			}
			catch(Exception e){
				System.out.println("Unable to click on clickOnEditPerfilAndroidFunction");
			}
	}
	public void clickOnOneOfServicesAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		System.out.println("clickOnCheckEditionPerfilIconAndroidFunction :: ");
		try{
			clickOnOneOfServicesAndroid.click();
			Thread.sleep(3000);
			androidDriver.navigate().back();
			androidDriver.navigate().back();
			}
			catch(Exception e){
				System.out.println("Unable to click on clickOnCheckEditionPerfilIconAndroidFunction");
			}
	}

}
