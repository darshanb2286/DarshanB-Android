package com.moofwd.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PerfilAndroidPageFactory {
	AppiumDriver<AndroidElement> androidDriver;
	public PerfilAndroidPageFactory(AppiumDriver<AndroidElement> androidDriver){
//		this.androidDriver=androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);	
	}
	
	@AndroidFindBy(id="com.moofwd.br.fmu:id/dash_profile_btn")
	public AndroidElement clickOnPerfilAndroid;
	
	@AndroidFindBy(id="com.moofwd.br.fmu:id/profile_edit")
	public AndroidElement clickOnEditPerfilAndroid;
	
	@AndroidFindBy(id="com.moofwd.br.fmu:id/save")
	public AndroidElement clickOnCheckEditionPerfilIconAndroid;
	
	
	
	public void clickOnPerfilAndroidFunction(){
		clickOnPerfilAndroid.click();
	}
	public void clickOnEditPerfilAndroidFunction(){
		clickOnEditPerfilAndroid.click();
	}
	public void clickOnCheckEditionPerfilIconAndroidFunction(){
		System.out.println("clickOnCheckEditionPerfilIconAndroidFunction :: ");
		try{
			clickOnCheckEditionPerfilIconAndroid.click();
			Thread.sleep(3000);
			clickOnBackButtonAndroid();
			clickOnBackButtonAndroid();
			}
			catch(Exception e){
				System.out.println("Unable to click on clickOnCheckEditionPerfilIconAndroidFunction");
			}
	}
	public void clickOnBackButtonAndroid(){
		androidDriver.navigate().back();
	}
}
