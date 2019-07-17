package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SettingsAndroidPageFactory {
	AppiumDriver<AndroidElement> androidDriver;
	public SettingsAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.RelativeLayout[1]")
	public AndroidElement clickOnSettingsAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]")
	public AndroidElement clickOnSettingsNotificationsAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.CheckBox")
	public AndroidElement clickOnNotificationsAvisosAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.CheckBox")
	public AndroidElement clickOnNotificationsEventosAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.CheckBox")
	public AndroidElement clickOnNotificationsMensajensAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.CheckBox")
	public AndroidElement clickOnNotificationsSurveyAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView")
	public AndroidElement clickOnNotificationsSalveAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]")
	public AndroidElement clickOnSobreNosAndroid;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]")
	public AndroidElement clickOnPoliticaDePrivacidadAndroid;
	
	public void clickOnSettingsAndroidFunction(){
		clickOnSettingsAndroid.click();
	}
	public void clickOnSettingsNotificationsAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
			clickOnSettingsNotificationsAndroid.click();
	}
	public void clickOnNotificationsAvisosAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		clickOnNotificationsAvisosAndroid.click();
	}
	public void clickOnNotificationsEventosAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		clickOnNotificationsEventosAndroid.click();
	}
	public void clickOnNotificationsSurveyAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		clickOnNotificationsSurveyAndroid.click();
//		System.out.println("clickOnCheckEditionPerfilIconAndroidFunction :: ");
//		try{
//			clickOnOneOfServicesAndroid.click();
//			Thread.sleep(3000);
//			androidDriver.navigate().back();
//			androidDriver.navigate().back();
//			}
//			catch(Exception e){
//				System.out.println("Unable to click on clickOnCheckEditionPerfilIconAndroidFunction");
//			}
		
	}
	public void clickOnNotificationsMensajensAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		clickOnNotificationsMensajensAndroid.click();
	}
	public void clickOnNotificationsSalveAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		try{
		clickOnNotificationsSalveAndroid.click();
		Thread.sleep(3000);
		androidDriver.navigate().back();
		}
		catch(Exception e){
			System.out.println("Unable to click on clickOnNotificationsSalveAndroidFunction");	
		}
	}
	public void clickOnSobreNosAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		try{
		clickOnSobreNosAndroid.click();
		Thread.sleep(3000);
		androidDriver.navigate().back();
		}
		catch(Exception e){
			System.out.println("Unable to click on clickOnSobreNosAndroidFunction");
		}
	}
	public void clickOnPoliticaDePrivacidadAndroidFunction(AppiumDriver<AndroidElement> androidDriver){
		try{
		clickOnPoliticaDePrivacidadAndroid.click();
		Thread.sleep(3000);
		androidDriver.navigate().back();
		androidDriver.navigate().back();
		}
		catch(Exception e){
			
		}
	}
	

}
