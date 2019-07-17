package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.SocialAndroidPageFactory;

public class Redes_SocialAndroid extends TestBase {
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp AvisosAndroid::");
		socialAndroidPage = new SocialAndroidPageFactory(androidDriver);
	}
	@Test(priority=26)
	public void clickOn_redes_social(){
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_ANDROID)).click();
		test = extent.createTest("clickOn_redes_social");
		test.log(Status.INFO, MarkupHelper.createLabel("verify clickOn_redes_social Started Executing.", ExtentColor.BROWN));
		socialAndroidPage.clickOnSocialAndroidFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on clickOn_redes_social"+e.getMessage());
//		}
	
	}
	@Test(priority=27)
	public void Social_Icons() throws InterruptedException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.androidDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_FACEBOOK_ANDROID)));
			System.out.println("Click on Facebook");
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_FACEBOOK_ANDROID)).click();
			test = extent.createTest("Clicking on Facebook inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on Facebook inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialAndroidPage.clickOnSocialFacebookAndroidFunction();
			Thread.sleep(3000);
			test = extent.createTest("Clicking on back button for Facebook inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on back button for Facebook inside Redes Social Started Executing.", ExtentColor.BROWN));
			this.androidDriver.navigate().back();
			System.out.println("Click on Twitter");
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_TWITTER_ANDROID)).click();
			test = extent.createTest("Clicking on Twitter inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on Twitter inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialAndroidPage.clickOnSocialTwitterAndroidFunction();
			Thread.sleep(3000);
			this.androidDriver.navigate().back();
			this.androidDriver.navigate().back();
			System.out.println("Click on Youtube");
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_YOUTUBE_ANDROID)).click();
			test = extent.createTest("Clicking on Youtube inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on Youtube inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialAndroidPage.clickOnSocialYouTubeAndroidFunction();
			Thread.sleep(3000);
			this.androidDriver.navigate().back();
			System.out.println("Click on Instagram");
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_INSTAGRAM_ANDROID)).click();
			test = extent.createTest("Clicking on Instagram inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on Instagram inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialAndroidPage.clickOnSocialInstagramAndroidFunction();
			Thread.sleep(3000);
			this.androidDriver.navigate().back();
			System.out.println("Click on LinkedIn");
//			this.androidDriver.findElement(By.xpath(constantsTest.CLICK_ON_REDES_SOCIAL_LINKEDIN_ANDROID)).click();
			test = extent.createTest("Clicking on LinkedIn inside Redes Social");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Clicking on LinkedIn inside Redes Social Started Executing.", ExtentColor.BROWN));
			socialAndroidPage.clickOnSocialLinkedInAndroidFunction();
			Thread.sleep(3000);
			this.androidDriver.navigate().back();
			Thread.sleep(5000);
			System.out.println("To navigate back to Private dashboard from social");
			this.androidDriver.navigate().back();

//		}
//		catch(Exception e){
//			System.err.println("Unable to click on Social_Icons"+e.getMessage());
//		}
	
	
		
	}

}
