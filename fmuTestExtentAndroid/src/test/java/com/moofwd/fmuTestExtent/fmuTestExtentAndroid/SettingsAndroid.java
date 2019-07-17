package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.SettingsAndroidPageFactory;

public class SettingsAndroid extends TestBase{

	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp SettingsAndroid::");
		settingsAndroidPage = new SettingsAndroidPageFactory(androidDriver);
	}
	@Test(priority=30)
	public void click_on_Settings(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SETTINGS_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_SETTINGS_ANDROID)).click();
		test = extent.createTest("click_on_Settings");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_on_Settings Started Executing.", ExtentColor.PINK));
		settingsAndroidPage.clickOnSettingsAndroidFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_on_Settings"+e.getMessage());
//		}
		
	}
	@Test(priority=31)
	public void click_On_Notifications() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_SETTINGS_NOTIFICATIONS_ANDROID)).click();
		test = extent.createTest("click_On_Notifications inside Settings");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Notifications inside Settings Started Executing.", ExtentColor.PINK));
		settingsAndroidPage.clickOnSettingsNotificationsAndroidFunction(androidDriver);
//			try{
//				WebDriverWait waitAvisos= new WebDriverWait(this.androidDriver, 60);
//				waitAvisos.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_AVISOS_ANDROID)));
//				this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_AVISOS_ANDROID)).click();
//				this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_EVENTOS_ANDROID)).click();
//				this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_MENSAGENS_ANDROID)).click();
//				this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SURVEYS_ANDROID)).click();
//			}
			Thread.sleep(3000);
			test = extent.createTest("clickOnSettingsNotificationAvisosIosFunction inside Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationAvisosIosFunction inside Settings Started Executing.", ExtentColor.PINK));
			settingsAndroidPage.clickOnNotificationsAvisosAndroidFunction(androidDriver);
			test = extent.createTest("clickOnSettingsNotificationEventosIosFunction inside Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationEventosIosFunction inside Settings Started Executing.", ExtentColor.PINK));
			settingsAndroidPage.clickOnNotificationsEventosAndroidFunction(androidDriver);
			test = extent.createTest("clickOnSettingsNotificationMensajensIosFunction inside Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationMensajensIosFunction inside Settings Started Executing.", ExtentColor.PINK));
			settingsAndroidPage.clickOnNotificationsMensajensAndroidFunction(androidDriver);
			test = extent.createTest("clickOnSettingsNotificationSurveysIosFunction inside Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationSurveysIosFunction inside Settings Started Executing.", ExtentColor.PINK));
			settingsAndroidPage.clickOnNotificationsSurveyAndroidFunction(androidDriver);
//			catch(Exception e){
//				System.err.println("Unable to click on click_On_Avisos, Eventos, Mensagens, Surveys"+e.getMessage());
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Notifications"+e.getMessage());
//		}
	}
	@Test(priority=32)
	public void click_On_Salve(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver,60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SALVE_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTIFICATIONS_SALVE_ANDROID)).click();
		test = extent.createTest("clickOnSettingsNotificationSalveIosFunction inside Settings");
		test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnSettingsNotificationSalveIosFunction inside Settings Started Executing.", ExtentColor.PINK));
		settingsAndroidPage.clickOnNotificationsSalveAndroidFunction(androidDriver);
//			try{
//				Thread.sleep(5000);
//				this.androidDriver.navigate().back();	
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button"+e.getMessage());
//			}
//		}
//		catch (Exception e) {
//			System.err.println("Unable to click on click_On_Salve"+e.getMessage());
//		}
	}
	@Test(priority=33)
	public void clickOn_Sobre_Nos(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver,120);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]")));
//			this.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]")).click();
//			try{
			test = extent.createTest("clickOn_Sobre_Nos inside Settings");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Sobre_Nos inside Settings Started Executing.", ExtentColor.PINK));
			settingsAndroidPage.clickOnSobreNosAndroidFunction(androidDriver);
//				WebDriverWait waittogetback= new WebDriverWait(this.androidDriver,120);
//				waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.moofwd.br.fmu:id/settings_version_name")));
//				this.androidDriver.navigate().back();
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button"+e.getMessage());
//			}
//		}
//		catch (Exception e) {
//			System.err.println("Unable to click on clickOn_Sobre_Nos"+e.getMessage());
//		}
	}
	@Test(priority=34)
	public void clickOn_PoliticaDe_Privacidad(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver,60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]")));
//			this.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]")).click();
		test = extent.createTest("clickOn_PoliticaDe_Privacidad inside Settings");
		test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_PoliticaDe_Privacidad inside Settings Started Executing.", ExtentColor.PINK));	
		settingsAndroidPage.clickOnPoliticaDePrivacidadAndroidFunction(androidDriver);
//		try{
//				WebDriverWait waittogetback= new WebDriverWait(this.androidDriver,120);
//				waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]")));
//				this.androidDriver.navigate().back();
//				this.androidDriver.navigate().back();
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button"+e.getMessage());
//			}
//		}
//		catch (Exception e) {
//			System.err.println("Unable to click on clickOn_Sobre_Nos"+e.getMessage());
//		}
	}


}
