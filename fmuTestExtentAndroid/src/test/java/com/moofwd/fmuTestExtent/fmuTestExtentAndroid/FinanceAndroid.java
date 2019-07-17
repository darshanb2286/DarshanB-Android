package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.FinanceAndroidPageFactory;

public class FinanceAndroid extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		financeAndroidPage = new FinanceAndroidPageFactory(androidDriver);
	}
	@Test(priority=13)
	public void clickOn_Finance(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_FINANCE_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_FINANCE_ANDROID)).click();
		test = extent.createTest("clickOn_Finance");
		test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Finance Started Executing.", ExtentColor.GREEN));
		financeAndroidPage.clickOnFinanceAndroidFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Finance"+e.getMessage());
//		}
	}
	@Test(priority=14)
	public void clickOn_Download_Receipt(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_FINANCE_DOWNLOAD_RECEIPT_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_FINANCE_DOWNLOAD_RECEIPT_ANDROID)).click();
		test = extent.createTest("Finance_clickOn_Download_Receipt");
		test.log(Status.INFO, MarkupHelper.createLabel("verify Finance_clickOn_Download_Receipt Started Executing.", ExtentColor.GREEN));
		financeAndroidPage.clickOnOneOfFinanceDownloadReceiptAndroidFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Download_Receipt"+e.getMessage());
//		}
		
	}
	@Test(priority=15)
	public void clickOn_Close_PopUp_Finance(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_CLOSE_POPUP_FINANCE_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_CLOSE_POPUP_FINANCE_ANDROID)).click();
		test = extent.createTest("clickOn_Close_OfPopUp_Finance");
		test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Close_OfPopUp_Finance Started Executing.", ExtentColor.GREEN));
		financeAndroidPage.clickOnClosePopUpFinanceAndroidFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Close_PopUp_Finance"+e.getMessage());
//		}
	}
//	public void Scroll_To_Particular_Element(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(constantsTest.SCROLL_TO_PARTICULAR_ELEMENT_FINANCE_ANDROID)));
//			this.androidDriver.findElement(By.name(constantsTest.SCROLL_TO_PARTICULAR_ELEMENT_FINANCE_ANDROID)).click();
//			
//			WebElement element = (WebElement)androidDriver. findElement(By.name(constantsTest.SCROLL_TO_PARTICULAR_ELEMENT_FINANCE_ANDROID));
//			String elementID = ((RemoteWebElement) element).getId();
//			HashMap<String, String> scrollObject = new HashMap<String, String>();
//			scrollObject.put("element", elementID);
//			scrollObject.put("toVisible", "not an empty string");
//			androidDriver.executeScript("mobile:scroll", scrollObject);
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on Scroll_To_Particular_Element"+e.getMessage());
//		}
//	}
	@Test(priority=16)
	public void clickOn_Paid() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_FINANCE_PAID_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_FINANCE_PAID_ANDROID)).click();
			Thread.sleep(3000);
			test = extent.createTest("Finance_clickOn_Paid");
			test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_Paid Started Executing.", ExtentColor.GREEN));
			financeAndroidPage.clickOnFinancePaidAndroidFunction();
//			try{
//				WebDriverWait waittogetback= new WebDriverWait(this.androidDriver,120);
//				waittogetback.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CHECK_FINANCE_PAID_LIST_ANDROID)));
//				Thread.sleep(8000);
//				test = extent.createTest("clickOnBackButtonIos_Finance");
//				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnBackButtonIos_Finance Started Executing.", ExtentColor.GREEN));
//				this.androidDriver.navigate().back();
//			}
//			catch(Exception e){
//				System.err.println("Unable to click on back button"+e.getMessage());
//				this.androidDriver.navigate().back();
//			}
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_Paid"+e.getMessage());
//		}
	}


}
