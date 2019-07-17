package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.PerfilAndroidPageFactory;

public class PerfilAndroid extends TestBase {
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp PerfilAndroid::");
		perfilAndroidPage = new PerfilAndroidPageFactory(androidDriver);
	}
	@Test(priority=20)
	public void click_On_Perfil(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver,60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]")));
//			this.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]")).click();	
		test = extent.createTest("click_On_Perfil");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Perfil Started Executing.", ExtentColor.PINK));	
		perfilAndroidPage.clickOnPerfilAndroidFunction();			
//	}
//			catch(Exception e){
//				System.err.println("Unable to click on click_On_Perfil "+e.getMessage());
//				}
	}
	@Test(priority=21)
	public void click_On_Profile_Edit() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver,60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView")));
//			this.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView")).click();	
			Thread.sleep(5000);
			test = extent.createTest("click_On_Edit_Perfil");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Edit_Perfil Started Executing.", ExtentColor.PINK));
			perfilAndroidPage.clickOnEditPerfilAndroidFunction();
//	}
//			catch(Exception e){
//				System.err.println("Unable to click on click_On_Profile_Edit "+e.getMessage());
//				}
		
	}
	@Test(priority=22)
	public void click_On_Save_Right_Icon() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver,60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Save']")));
//			this.androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='Save']")).click();
			Thread.sleep(5000);
			test = extent.createTest("Perfil_click_On_Check_Edition");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Perfil_click_On_Check_Edition Started Executing.", ExtentColor.PINK));
			perfilAndroidPage.clickOnCheckEditionPerfilIconAndroidFunction();
			
//				}
//			catch(Exception e){
//				System.err.println("Unable to click on click_On_Save_Right_Icon "+e.getMessage());
//				}
		
	}
}
