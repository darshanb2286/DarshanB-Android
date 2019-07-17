package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FinanceAndroidPageFactory {
	AndroidDriver<AndroidElement> androidDriver;
	public FinanceAndroidPageFactory(AndroidDriver<AndroidElement> androidDriver){
		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.RelativeLayout[2]")
	public AndroidElement clickOnFinanceAndroid;
	
	@AndroidFindBy(xpath="(//XCUIElementTypeButton[@name='DOWNLOAD RECEIPT'])[1]")
	public AndroidElement clickOnOneOfFinanceDownloadReceiptAndroid;
	
	@AndroidFindBy(xpath="//XCUIElementTypeStaticText[@name='X']")
	public AndroidElement clickOnClosePopUpFinanceAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]")
	public AndroidElement clickOnFinancePaidAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView")
	public AndroidElement checkFinancePaidListAndroid;
	
	public void clickOnFinanceAndroidFunction(){
		clickOnFinanceAndroid.click();
	}
	public void clickOnOneOfFinanceDownloadReceiptAndroidFunction(){
		clickOnOneOfFinanceDownloadReceiptAndroid.click();
	}
	public void clickOnClosePopUpFinanceAndroidFunction(){
		clickOnClosePopUpFinanceAndroid.click();
	}
	public void clickOnFinancePaidAndroidFunction(){
		try{
		clickOnFinancePaidAndroid.click();
		Thread.sleep(3000);
		androidDriver.navigate().back();
		}
		catch(Exception e){
			System.out.println("Unable to click on clickOnFinancePaidAndroidFunction");
		}
	}
	public void checkFinancePaidListAndroidFunction(){
		
			if(checkFinancePaidListAndroid.isDisplayed()==true){
				androidDriver.navigate().back();
			}
			else{
				androidDriver.navigate().back();
			}
	}

}
