package com.moofwd.fmuTestExtent.fmuTestExtentAndroid;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.Base.TestBase;
import com.moofwd.pages.PublicDashboardPageAndroidFactory;

public class PublicDashboardAndroid extends TestBase{
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("setUp Android ::");
		publicDashboardPageAndroid = new PublicDashboardPageAndroidFactory(androidDriver);
	}
	@Test(priority=1)
	public void clickOnArrow() throws InterruptedException{
		//Coueselist forword arrow
//		try{
//			WebDriverWait wait = new WebDriverWait(this.androidDriver, 120);
//			System.out.println("wait :: "+wait);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(constantsTest.PUBLIC_DASHBOARD_FORWARD_BUTTON_ANDROID)));
			test = extent.createTest("LogIn_clickOnArrow");
			test.log(Status.INFO, MarkupHelper.createLabel("verify LogIn_clickOnArrow Started Executing.", ExtentColor.BLUE));
			publicDashboardPageAndroid.clickOnForwardArrowAndroidFunction();
			System.out.println("click_On_AvisosAndroid :: "+ androidDriver);
//		test.click();
//		}catch(Exception e)
//		{
//			System.err.println("Unable to click on Forward Arrow"+e.getMessage());
//		}
//		System.out.println("Test2"+ androidDriver);
	}
	@Test(priority=2)
	public void clickOn_Ir_Para_O_LogIn() throws InterruptedException{
		//Coueselist forword arrow
//		try{
//			WebDriverWait wait = new WebDriverWait(this.androidDriver, 120);
//			System.out.println("wait :: "+wait);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(constantsTest.IR_PARA_O_LOGIN_ANDROID)));
//			this.androidDriver.findElement(By.id(constantsTest.IR_PARA_O_LOGIN_ANDROID)).click();
			System.out.println("clickOn_Ir_Para_O_LogIn :: "+androidDriver);
			test = extent.createTest("LogIn_clickOn_Ir_Para_O_LogIn");
			test.log(Status.INFO, MarkupHelper.createLabel("verify LogIn_clickOn_Ir_Para_O_LogIn Started Executing.", ExtentColor.BLUE));
			publicDashboardPageAndroid.clickOnIrParaLogInAndroidFunction();
//		}catch(Exception e)
//		{
//			System.err.println("Unable to click on Ir_Para_O_LogIn"+e.getMessage());
//		}
//		System.out.println("Test2"+ androidDriver);
	}
	@Test(priority=3)
	public void credentials_Enter_LogIn() throws InterruptedException{
//		try{
//			WebDriverWait wait = new WebDriverWait(this.androidDriver,120);
//			Thread.sleep(20000);
//			System.out.println("Test--");
//			System.out.println(this.androidDriver.getContext());
//			Set<String> s=androidDriver.getContextHandles();
//			for(String handle:s){
//				System.out.println(handle);
//			}
			Thread.sleep(5000);
			System.out.println("credentials_Enter_LogIn ::");
			test = extent.createTest("LogIn_credentials_Enter_LogIn");
			test.log(Status.INFO, MarkupHelper.createLabel("verify LogIn_credentials_Enter_LogIn Started Executing.", ExtentColor.BLUE));
			publicDashboardPageAndroid.enterUserNameAndroidFunction();
			publicDashboardPageAndroid.enterPasswordAndroidFunction();
			publicDashboardPageAndroid.clickOnEntrarAndroidFunction();
//			this.androidDriver.findElement(By.xpath(constantsTest.USERNAME_ANDROID)).setValue("A00024586@fmu.test.laureatelab.net");;
//			this.androidDriver.findElement(By.xpath(constantsTest.PASSWORD_ANDROID)).setValue("L@ur3ate2019!");
//			this.androidDriver.findElement(By.xpath(constantsTest.ENTRAR_ANDROID)).click();
//		}
//		catch(Exception e)
//		{
//			System.err.println("Unable to click on credentials_Enter_LogIn"+e.getMessage());
//		}
//		System.out.println("Test2"+ androidDriver);
	}
	@Test(priority=4)
	public void clickOn_Li_e_concordo() throws InterruptedException{
		//Coueselist forword arrow
//		try{
//			WebDriverWait wait = new WebDriverWait(this.androidDriver, 120);
//			System.out.println("wait :: "+wait);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.LI_E_CONCORDO_ANDROID)));
//			this.androidDriver.findElement(By.xpath(constantsTest.LI_E_CONCORDO_ANDROID)).click();
			test = extent.createTest("LogIn_clickOn_Li_e_concordo");
			test.log(Status.INFO, MarkupHelper.createLabel("verify LogIn_clickOn_Li_e_concordo Started Executing.", ExtentColor.BLUE));
			publicDashboardPageAndroid.clickOnLiEConcordoAndroidFunction();
//		}catch(Exception e)
//		{
//			System.err.println("Unable to click on Li_e_concordo"+e.getMessage());
//		}
//		System.out.println("Test2"+ androidDriver);
	}

}
