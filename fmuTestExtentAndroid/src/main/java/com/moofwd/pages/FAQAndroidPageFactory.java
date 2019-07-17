package com.moofwd.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FAQAndroidPageFactory {


	AppiumDriver<AndroidElement> androidDriver;
	public FAQAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
//		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.RelativeLayout[1]")
	public AndroidElement clickOnFAQAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
//	@AndroidFindBy(id="com.moofwd.br.fmu:id/faq_search_et")
	public AndroidElement enterTextInTextFieldAndroid;
	
	
	
	public void clickOnFAQAndroidFunction(){
		clickOnFAQAndroid.click();
	}
	public void enterTextInTextFieldAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		try{
		enterTextInTextFieldAndroid.sendKeys("Test");
//			enterTextInTextFieldAndroid.sendKeys(Keys.CONTROL, Keys.ADD);
		Thread.sleep(3000);
		androidDriver.navigate().back();
		}
		catch(Exception e){
			System.out.println("Unable to enter the value in the text field");
		}
	}



}
