package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.EventosAndroidPageFactory;

public class EventosAndroid extends TestBase {
	@BeforeClass
	public void setUp() throws MalformedURLException {
		eventosAndroidPage = new EventosAndroidPageFactory(androidDriver);
	}
	@Test(priority=10)
	public void click_on_Eventos(){
//		try{
//			WebDriverWait wait = new WebDriverWait(this.androidDriver, 120);
//			System.out.println("wait ::in "+wait);
		test = extent.createTest("click_on_Eventos");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_on_Eventos Started Executing.", ExtentColor.BLUE));
		eventosAndroidPage.clickOnEventosAndroidFunction();
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(constantsTest.CLICK_ON_EVENTOS_ANDROID)));
//			this.androidDriver.findElement(By.id(constantsTest.CLICK_ON_EVENTOS_ANDROID)).click();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_on_Eventos"+e.getMessage());
//		}
	}
	@Test(priority=11)
	public void click_On_Antigo() throws InterruptedException{
//		try{
//			WebDriverWait wait = new WebDriverWait(this.androidDriver, 120);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_EVENTOS_ANTIGO_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_EVENTOS_ANTIGO_ANDROID)).click();
//			System.out.println("Click on Antigo ::in "+wait);
			test = extent.createTest("Eventos_click_On_Antigo");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Eventos_click_On_Antigo Started Executing.", ExtentColor.BLUE));
			eventosAndroidPage.clickOnEventosAntigoAndroidFunction(androidDriver);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.support.v7.app.ActionBar$Tab")));
//			this.androidDriver.findElement(By.className("android.support.v7.app.ActionBar$Tab")).click();
//			try{
//				WebDriverWait waitforbackbutton = new WebDriverWait(this.androidDriver,120);
//				waitforbackbutton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='headerBackBtn']")));
//				this.androidDriver.findElement(By.xpath("//XCUIElementTypeButton[@name='headerBackBtn']")).click();
//				Thread.sleep(5000);
//				System.out.println("Testing");
//				this.androidDriver.navigate().back();
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button"+e.getMessage());
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Antigo"+e.getMessage());
//		}
	}


}
