package com.moofwd.pages;


import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AvisosPageAndroidFactory {

	AndroidDriver<AndroidElement> androidDriver;
	public AvisosPageAndroidFactory(AndroidDriver<AndroidElement> androidDriver){
		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]")
	public AndroidElement clickOnAvisosAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.FrameLayout[1]/android.widget.Linear")
	public AndroidElement clickOnOneOfAvisosListAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView")
	public AndroidElement clickOnAvisosLinkAndroid;
	
	
	
	public void clickOnAvisosAndroidFunction(){
		clickOnAvisosAndroid.click();
	}
	public void clickOnOneOfAvisosListAndroidFunction() throws InterruptedException{
//		if(clickOnOneOfAvisosListAndroid.isEnabled()==true){
////		if(clickOnOneOfAvisosListAndroid.is){
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.elementToBeClickable(clickOnOneOfAvisosListAndroid));
//			System.out.println("clickOnOneOfAvisosListAndroidFunction ::"+ clickOnOneOfAvisosListAndroid.isEnabled());
//			clickOnOneOfAvisosListAndroid.click();
//			System.out.println("clickOnOneOfAvisosListAndroidFunction ::");
//		}
//		else{
//			System.out.println("NAvigating back "+androidDriver);
//			clickOnBackButtonAndroidFunction();
//			System.out.println("After Navigating back "+androidDriver);
//		}
		try{
		WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(clickOnOneOfAvisosListAndroid));
		System.out.println("clickOnOneOfAvisosListAndroidFunction ::"+ clickOnOneOfAvisosListAndroid.isEnabled());
			clickOnOneOfAvisosListAndroid.click();
//			clickOnOneOfAvisosListAndroid.sendKeys(Keys.CONTROL, Keys.ADD);
			Thread.sleep(3000);
			System.out.println("clickOnOneOfAvisosListAndroidFunction ::");
		}
		catch(Exception e){
			System.out.println("NAvigating back "+androidDriver);
			clickOnBackButtonAndroidFunction();
			System.out.println("After Navigating back "+androidDriver);
		}
	}
	public void clickOnAvisosLinkAndroidFunction() throws InterruptedException{
		if(clickOnAvisosLinkAndroid.isEnabled()== true){
			clickOnAvisosLinkAndroid.click();
			throw new SkipException("Skipping this exception");
		}
		else{
			androidDriver.navigate().back();
		}
//		try{
//		clickOnAvisosLinkAndroid.click();
//		}
//		catch(Exception e){
//			
//			androidDriver.navigate().back();
//			androidDriver.navigate().back();
//			Thread.sleep(3000);
//			androidDriver.navigate().back();
//			
//		}
		
	}
	public void clickOnBackButtonAndroidFunction() {
		// TODO Auto-generated method stub
		androidDriver.navigate().back();
	}


}
