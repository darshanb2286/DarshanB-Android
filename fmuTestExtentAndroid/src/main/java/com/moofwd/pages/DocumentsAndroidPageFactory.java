package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DocumentsAndroidPageFactory {
	AppiumDriver<AndroidElement> androidDriver;
	public DocumentsAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.RelativeLayout[1]")
	public AndroidElement clickOnDocumentsAndroid;	
	
	public void clickOnDocumentsAndroidFunction(AppiumDriver<AndroidElement> androidDriver) throws InterruptedException{
		try{
			System.out.println("clickOnDocumentsAndroidFunction ::");
			clickOnDocumentsAndroid.click();
			Thread.sleep(5000);
			androidDriver.navigate().back();
		}
		catch(Exception e){
			System.out.println("Unable to click on clickOnDocumentsAndroidFunction :: ");
		}
		
	}
	
}
