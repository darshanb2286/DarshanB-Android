package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PublicDashboardPageAndroidFactory {
	AndroidDriver<AndroidElement> androidDriver;
	public PublicDashboardPageAndroidFactory(AndroidDriver<AndroidElement> androidDriver) {
		System.out.println("PublicDashboardPage :: androidDriver"+androidDriver);
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
	}
	@AndroidFindBy(id="com.moofwd.br.fmu:id/welcome_mini_dash_navigator_arrow")
	AndroidElement clickOnForwardArrowAndroid;
	
	@AndroidFindBy(id="com.moofwd.br.fmu:id/goToLoginTextView")
	AndroidElement clickOnIrParaLogInAndroid;
	
//	@AndroidFindBy(id="//android.widget.EditText[@resource-id = 'userNameInput']")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.EditText")
//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.EditText
	AndroidElement enterUserNameAndroid;
	
//	@AndroidFindBy(id="//android.widget.EditText[@resource-id = 'passwordInput']")
//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText")
	AndroidElement enterPasswordAndroid;
	
//	@AndroidFindBy(id="//android.widget.Button[@resource-id = 'submitButton']")
//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button")
	AndroidElement clickOnEntrarAndroid;
	
//	@AndroidFindBy(id="//android.widget.TextView[@resource-id='com.moofwd.br.fmu:id/goToLoginTextView']")
//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
	AndroidElement clickOnLiEConcordoAndroid;
	
	public void clickOnForwardArrowAndroidFunction(){
		clickOnForwardArrowAndroid.click();
	 }
	public void clickOnIrParaLogInAndroidFunction(){
		clickOnIrParaLogInAndroid.click();
	}
	public void enterUserNameAndroidFunction() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("enterUserNameAndroidFunction :: ");
		enterUserNameAndroid.sendKeys("A00015084@fmu.test.laureatelab.net");
//		enterUserNameAndroid.sendKeys("A00015084@fmu.test.laureatelab.net");
	}
	public void enterPasswordAndroidFunction() throws InterruptedException{
		Thread.sleep(5000);
		enterPasswordAndroid.click();
		enterPasswordAndroid.sendKeys("E2G2019!!");
		System.out.println("androidDriver" + androidDriver);
		androidDriver.navigate().back();
	}
	public void clickOnEntrarAndroidFunction(){
		clickOnEntrarAndroid.click();
	}
	public void clickOnLiEConcordoAndroidFunction(){
		clickOnLiEConcordoAndroid.click();
		/****** Pass to next class *****/		
	}

}
