package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.NoticiasAndroidPageFactory;

public class NoticiasAndroid extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		noticiasAndroidPage = new NoticiasAndroidPageFactory(androidDriver);
	}
	@Test(priority=17)
	public void click_On_Noticias() {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.RelativeLayout[2]")));
//			this.androidDriver
//					.findElement(By
//							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.RelativeLayout[2]"))
//					.click();
		test = extent.createTest("click_On_noticias");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_noticias Started Executing.", ExtentColor.PURPLE));
		noticiasAndroidPage.clickOnNoticiasAndroidFunction();
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_On_Noticias" + e.getMessage());
//		}
	}
	@Test(priority=18)
	public void click_On_OneofNoticias() {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]")));
//			this.androidDriver
//					.findElement(By
//							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]"))
//					.click();
		test = extent.createTest("click_On_noticias");
		test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_noticias Started Executing.", ExtentColor.PURPLE));
		noticiasAndroidPage.clickOnOneOfNoticiasAndroidFunction();
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_On_OneofNoticias" + e.getMessage());
//			this.androidDriver.navigate().back();
//		}

	}
	@Test(priority=19)
	public void click_On_Noticias_link() {
//		try {
//			WebDriverWait wait = new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions
//					.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='MORE']")));
//			this.androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='MORE']")).click();
			test = extent.createTest("click_On_Noticias_link");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Noticias_link Started Executing.", ExtentColor.PURPLE));
			noticiasAndroidPage.clickOnNoticiasLinkAndroidFunction();
			this.androidDriver.navigate().back();
			this.androidDriver.navigate().back();
			this.androidDriver.navigate().back();
//		} catch (Exception e) {
//			System.err.println("Unable to click on click_On_Notiocias_link" + e.getMessage());
//			this.androidDriver.navigate().back();
//			this.androidDriver.navigate().back();
//
//		}
	}
}
