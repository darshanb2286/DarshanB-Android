package com.moofwd.Base;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.moofwd.fmuTestExtent.fmuTestExtentAndroid.GetScreenShot;
import com.moofwd.pages.AvisosPageAndroidFactory;
import com.moofwd.pages.ContactUsAndroidPageFactory;
import com.moofwd.pages.DocumentsAndroidPageFactory;
import com.moofwd.pages.EventosAndroidPageFactory;
import com.moofwd.pages.FAQAndroidPageFactory;
import com.moofwd.pages.FinanceAndroidPageFactory;
import com.moofwd.pages.NoticiasAndroidPageFactory;
import com.moofwd.pages.NotificationsAndroidPageFactory;
import com.moofwd.pages.PerfilAndroidPageFactory;
import com.moofwd.pages.PublicDashboardPageAndroidFactory;
import com.moofwd.pages.SPTranceAndroidPageFactory;
import com.moofwd.pages.ServicesAndroidPageFactory;
import com.moofwd.pages.SettingsAndroidPageFactory;
import com.moofwd.pages.SocialAndroidPageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
//public static Properties prop;
public static AppiumDriver<IOSElement> iosDriver;
public static AndroidDriver<AndroidElement> androidDriver;
public PublicDashboardPageAndroidFactory publicDashboardPageAndroid;
public AvisosPageAndroidFactory avisosPageAndroid;
public ContactUsAndroidPageFactory contactUsAndroidPage;
public DocumentsAndroidPageFactory documentsAndroidPage;
public EventosAndroidPageFactory eventosAndroidPage;
public FAQAndroidPageFactory faqAndroidPage;
public FinanceAndroidPageFactory financeAndroidPage;
public NoticiasAndroidPageFactory noticiasAndroidPage;
public NotificationsAndroidPageFactory notificationAndroidPage;
public PerfilAndroidPageFactory perfilAndroidPage;
public ServicesAndroidPageFactory serviceAndroidPage;
public SettingsAndroidPageFactory settingsAndroidPage;
public SocialAndroidPageFactory socialAndroidPage;
public SPTranceAndroidPageFactory sptranceAndroidPage;

//public TestBase() {
//	try {
//		prop = new Properties();
//		FileInputStream file = new FileInputStream(
//				"/Users/darshanborse/Documents/workspace/com.moofwd.fmuTestng/src/main/java/com/moofwd/config/config.properties");
//		prop.load(file);
//	} catch (Exception e) {
//		System.out.println("Inside TestBase Method :: ");
//	}
//}

//This is for Android	



@BeforeSuite
public AndroidDriver<AndroidElement> init() throws MalformedURLException {
	System.out.println("AndroidDriver @BeforeSuite ::");
	htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/MyOwnReport.html");
	System.out.println("AndroidDriver @BeforeSuite ::"+htmlReporter);
//	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/MyOwnReport.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);

	extent.setSystemInfo("OS", "Mac High Sierra");
	extent.setSystemInfo("HostName", "Krishna");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("Author", "Krishna");

	htmlReporter.config().setChartVisibilityOnOpen(true);
	htmlReporter.config().setDocumentTitle("AutomationTesting Demo Report");
	htmlReporter.config().setReportName("My Own Report");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.DARK);	
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
	capabilities.setCapability("appPackage", "com.moofwd.br.fmu");
	capabilities.setCapability("appActivity", "com.moofwd.br.fmu.app.SplashScreen");
	androidDriver  = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	androidDriver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	//File file= new File("/Users/darshanborse/Desktop/workspace/University3/apk/fmu_20_05_2019.apk");
	//capabilities.setCapability("app",file.getAbsolutePath());	
	
	
	//System.out.println("capabilities :: "+gson.toJson(capabilities));
	//try {
	//	androidDriver  = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	//	androidDriver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	//	System.out.println("Session :: "+androidDriver);
	//	
	//} catch (MalformedURLException e) {
	//	System.out.println("Issue in installing the app please check the dependancies & Session ");
	//	e.printStackTrace();
	//	
	//}
	//System.out.println("123232	313123123 :: "+androidDriver);
	return androidDriver;
	}

@AfterMethod
public void getResult(ITestResult result) throws IOException {
	if (result.getStatus() == ITestResult.FAILURE) {
		String screenshotPath = GetScreenShot.capture(androidDriver, "SampleScreenshot");
		test.fail(result.getThrowable());
		test.fail("Snapshot of screenshot below:" + test.addScreenCaptureFromPath(screenshotPath));

	} else {
		test.pass(result.getName() + " Testcase Passed");
	}
}

@AfterSuite
public void tearDown() {
	if (androidDriver != null) {
		androidDriver.quit();
	}
	extent.flush();
}


//@BeforeSuite
//public AppiumDriver<IOSElement> init() throws MalformedURLException {
//
//	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/MyOwnReport.html");
//	extent = new ExtentReports();
//	extent.attachReporter(htmlReporter);
//
//	extent.setSystemInfo("OS", "Mac High Sierra");
//	extent.setSystemInfo("HostName", "Darshan");
//	extent.setSystemInfo("Environment", "QA");
//	extent.setSystemInfo("Author", "Darshan Borse");
//	
//
////	htmlReporter.config().setChartVisibilityOnOpen(true);
//	htmlReporter.config().setDocumentTitle("AutomationTesting Demo Report");
//	htmlReporter.config().setReportName("My Own Report");
////	htmlReporter.config().setTestViewChartLocation(chartl);
//	htmlReporter.config().setTheme(Theme.DARK);
//	
//	DesiredCapabilities capabilities = new DesiredCapabilities();
//	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MooFwd");
//	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
//	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
//	capabilities.setCapability("xcodeOrgId", "9C82H6HW5W");
//	capabilities.setCapability("xcodeSigningid", "iPhone Developer");
//	capabilities.setCapability("udid", "bf69b67f1c49867e5f54dc1a8d9c933230364658");
//	capabilities.setCapability(MobileCapabilityType.UDID, "bf69b67f1c49867e5f54dc1a8d9c933230364658");
//	capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.moofwd.br.fmu");
////	capabilities.setCapability("updateWDABundleId", "com.moofwd.br.fmu");
////	capabilities.setCapability("appPackage", "com.moofwd.br.fmu");
////	capabilities.setCapability("appActivity", "com.moofwd.br.fmu.app.SplashScreen");
////	capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
//	iosDriver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//	iosDriver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
////	File file = new File("/Users/darshanborse/Documents/workspace/com.moofwd.fmuTestng/ipa/BR_Mooestro_FMU.ipa");
////	capabilities.setCapability("app", file.getAbsolutePath());
//	
////	try {
////	iosDriver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
////	iosDriver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
////	System.out.println("App has been Installed");
////	return iosDriver;
////
////} catch (MalformedURLException e) {
////	System.out.println("Issue in installing please contact to developer");
////	e.printStackTrace();
////}
//return iosDriver;
//
//	
//	
//}

//@AfterMethod
//public void getResult(ITestResult result) throws IOException {
//
//	if (result.getStatus() == ITestResult.FAILURE) {
////		String screenshotPath = GetScreenShot.capture(iosDriver, "SampleScreenshot");
//		String screenshotPath = GetScreenShot.capture(iosDriver, result.getName());
//		test.fail(result.getThrowable());
//		test.fail("Snapshot of screenshot below:" + test.addScreenCaptureFromPath(screenshotPath));
//
//	} else if(result.getStatus() == ITestResult.SUCCESS) {
//		test.pass(result.getName() + " Testcase Passed");
//	}else if(result.getStatus() == ITestResult.SKIP) {
//		test.pass(result.getName() + " Testcase SKIP");
//	}
//}
//
//@AfterSuite
//public void tearDown() {
//	if (androidDriver != null) {
//		androidDriver.quit();
//	}
//	extent.flush();
//}



}
 
	 



