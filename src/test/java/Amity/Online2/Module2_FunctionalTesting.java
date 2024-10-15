package Amity.Online2;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Module2_FunctionalTesting {

	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	

	/////////////////////--------------------------PG Program-------------------------///////////////////////////////////////////


	@FindBy(xpath = "//a[normalize-space()='Master of Computer Applications']")  //Master of Computer Applications
	WebElement MCANormal;

	@FindBy(xpath = "//a[normalize-space()='MCA with specialization in Blockchai']")  //MCA with specialization in Blockchain
	WebElement MCAwithspecializationinBlockchain;

	@FindBy(xpath = "//a[normalize-space()='MCA with specialization in ML & Al']")  //MCA with specialization in ML & Al
	WebElement MCAwithspecializationinMLandAl;

	@FindBy(xpath = "//a[normalize-space()='MCA with specialization in Machine Learning']")  //MCA with specialization in Machine Learning
	WebElement MCAwithspecializationinMachineLearning;

	@FindBy(xpath = "//a[normalize-space()='MCA with specialization in AR & VR']")  //MCA with specialization in AR & VR
	WebElement MCAwithspecializationinARandVR;

	@FindBy(xpath = "//a[normalize-space()='Master of Business Administration']")  //Master of Business Administration
	WebElement MasterofBusinessAdministration;

	@FindBy(xpath = "//a[contains(text(),'MBA with specialization in Digital Marketing Manag')]")  //MBA with specialization in Digital Marketing Management
	WebElement MBAwithspecializationinDigitalMarketingManagement;

	@FindBy(xpath = "//a[normalize-space()='MBA with specialization in HR Analytics']")  //MBA with specialization in HR Analytics
	WebElement MBAwithspecializationinHRAnalytics;

	@FindBy(xpath = "//a[normalize-space()='MBA with specialization in Data Science']")  //MBA with specialization in Data Science
	WebElement MBAwithspecializationinDataScience;

	@FindBy(xpath = "//a[normalize-space()='MBA with specialization in Business Analytics']")  //MBA with specialization in Business Analytics
	WebElement MBAwithspecializationinBusinessAnalytics;

	@FindBy(xpath = "//a[contains(text(),'MBA with specialization in Digital Entrepreneurshi')]")  //MBA with specialization in Digital Entrepreneurship
	WebElement MBAwithspecializationinDigitalEntrepreneurship;

	@FindBy(xpath = "//a[normalize-space()='Master of Arts (Journalism and Mass communication)']")  //Master of Arts (Journalism and Mass communication)
	WebElement MasterofArtsJournalismandMasscommunication;

	@FindBy(xpath = "//a[normalize-space()='M.Com with specialization in Fintech']")  //M.Com with specialization in Fintech
	WebElement MComwithspecializationinFintech;

	@FindBy(xpath = "//a[normalize-space()='M.Com with specialization in Financial Management']")  //M.Com with specialization in Financial Management
	WebElement MComwithspecializationinFinancialManagement;

	@FindBy(xpath = "//a[normalize-space()='Master of Arts in Public Policy & Governance']")  //Master of Arts in Public Policy & Governance
	WebElement MasterofArtsinPublicPolicyandGovernance;

	@FindBy(xpath = "//a[normalize-space()='Master of Arts in Psychology']")  //Master of Arts in Psychology
	WebElement MasterofArtsinPsychology;

	@FindBy(xpath = "//a[normalize-space()='Master of Science in Data Science']")  ///Master of Science in Data Science
	WebElement MasterofScienceinDataScience;

	@FindBy(xpath = "//span[normalize-space()='show more']")  // show more element
	WebElement showMorElement;


	@BeforeTest
	public void GenerateReport() {


		//reporter=new ExtentHtmlReporter("C:\\Users\\admin\\eclipse-workspace\\Report\\ExtentReport\\FunctionalTestReport.html");
		String jenkinsWorkspacePath = System.getProperty("user.dir") + "/ExtentReport/Module2_FunctionalTesting.html";
		reporter = new ExtentHtmlReporter(jenkinsWorkspacePath);


		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("Functional Test report");
		reporter.config().setTimeStampFormat("dd-MM-yyyy HH:mm");

		reports = new ExtentReports();
		reports.attachReporter(reporter);



	}

	@AfterTest
	public void CloseReport() {
		reports.flush();

	}

	@BeforeMethod
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();

		// Setup ChromeOptions to enable headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless"); 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://amityonline.com/");
		// Add a wait to ensure the page is loaded
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));


		// Initialize WebElementss
		PageFactory.initElements(driver, this);


	}

	
	//-------------------------------------------------------PG Programs----------------------------------------------------------------------------------------


	@Test(priority = 15)
	//Master of Computer Applications

	public void MasterofComputerApplications() throws InterruptedException {

		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MasterofComputerApplications_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MCANormal);
			Thread.sleep(3000);
			String ExpMCANormal = "https://amityonline.com/master-of-computer-applications-onlin";
			if(driver.getCurrentUrl().equals(ExpMCANormal)) {
				test.log(Status.PASS, "MasterofComputerApplications_Program url is verified");
				System.out.println("MasterofComputerApplications_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MasterofComputerApplications_Program url is not verified");
				System.out.println("MasterofComputerApplications_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MasterofComputerApplications_Program url is not verified: " + e.getMessage());
			System.out.println("MasterofComputerApplications_Program url is not verified");
			Assert.fail("MasterofComputerApplications_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 16)
	// 	MCA with specialization in Blockchain
	public void MCAwithspecializationinBlockchain() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MCAwithspecializationinBlockchain_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MCAwithspecializationinBlockchain);
			Thread.sleep(3000);
			String ExpMCAwithspecializationinBlockchain = "https://amityonline.com/mca-blockchain-online";
			if(driver.getCurrentUrl().equals(ExpMCAwithspecializationinBlockchain)) {

				test.log(Status.PASS, "MCAwithspecializationinBlockchain_Program url is verified");
				System.out.println("MCAwithspecializationinBlockchain_Program url is verified");

				Assert.assertTrue(true);
			}else {

				test.log(Status.FAIL, "MCAwithspecializationinBlockchain_Program url is not verified");
				System.out.println("MCAwithspecializationinBlockchain_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MCAwithspecializationinBlockchain_Program url is not verified: " + e.getMessage());
			System.out.println("MCAwithspecializationinBlockchain_Program url is not verified");
			Assert.fail("MCAwithspecializationinBlockchain_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 17)
	//MCA with specialization in ML & Al
	public void MCAwithspecializationinMLandAl() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MCAwithspecializationinMLandAl_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MCAwithspecializationinMLandAl);
			Thread.sleep(3000);
			//		Actions act66=new Actions(driver);
			//		act66.moveToElement(MCAwithspecializationinMLandAl).click().perform();
			//		Thread.sleep(3000);
			String ExpMCAwithspecializationinMLandAl = "https://amityonline.com/mca-machine-learning-and-artificial-intelligence-online";
			if(driver.getCurrentUrl().equals(ExpMCAwithspecializationinMLandAl)) {
				test.log(Status.PASS, "MCAwithspecializationinMLandAl_Program url is verified");
				System.out.println("MCAwithspecializationinMLandAl_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MCAwithspecializationinMLandAl_Program url is not verified");
				System.out.println("MCAwithspecializationinMLandAl_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MCAwithspecializationinMLandAl_Program url is not verified: " + e.getMessage());
			System.out.println("MCAwithspecializationinMLandAl_Program url is not verified");
			Assert.fail("MCAwithspecializationinMLandAl_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}


	@Test(priority = 18)
	//MCA with specialization in Machine Learning
	public void MCAwithspecializationinMachineLearning() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MCAwithspecializationinMachineLearning_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MCAwithspecializationinMachineLearning);
			Thread.sleep(3000);
			String ExpMCAwithspecializationinMachineLearning = "https://amityonline.com/mca-machine-learning-online";
			if(driver.getCurrentUrl().equals(ExpMCAwithspecializationinMachineLearning)) {
				test.log(Status.PASS, "MCAwithspecializationinMachineLearning_Program url is verified");
				System.out.println("MCAwithspecializationinMachineLearning_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MCAwithspecializationinMachineLearning_Program url is not verified");
				System.out.println("MCAwithspecializationinMachineLearning_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MCAwithspecializationinMachineLearning_Program url is not verified: " + e.getMessage());
			System.out.println("MCAwithspecializationinMachineLearning_Program url is not verified");
			Assert.fail("MCAwithspecializationinMachineLearning_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}


	@Test(priority = 19)
	//MCA with specialization in AR & VR
	public void MCAwithspecializationinARandVR() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MCAwithspecializationinARandVR_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MCAwithspecializationinARandVR);
			Thread.sleep(3000);
			String ExpMCAwithspecializationinARandVR = "https://amityonline.com/mca-virtualreality-online";
			if(driver.getCurrentUrl().equals(ExpMCAwithspecializationinARandVR)) {

				test.log(Status.PASS, "MCAwithspecializationinARandVR_Program url is verified");
				System.out.println("MCAwithspecializationinARandVR_Program url is verified");

				Assert.assertTrue(true);
			}else {

				test.log(Status.FAIL, "MCAwithspecializationinARandVR_Program url is not verified");
				System.out.println("MCAwithspecializationinARandVR_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MCAwithspecializationinARandVR_Program url is not verified: " + e.getMessage());
			System.out.println("MCAwithspecializationinARandVR_Program url is not verified");
			Assert.fail("MCAwithspecializationinARandVR_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}		

	@Test(priority = 20)
	//Master of Business Administration
	public void MasterofBusinessAdministration() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MasterofBusinessAdministration_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MasterofBusinessAdministration);
			Thread.sleep(3000);
			String ExpMasterofBusinessAdministration = "https://amityonline.com/master-of-business-administration-online";
			if(driver.getCurrentUrl().equals(ExpMasterofBusinessAdministration)) {

				test.log(Status.PASS, "MasterofBusinessAdministration_Program url is verified");
				System.out.println("MasterofBusinessAdministration_Program url is verified");

				Assert.assertTrue(true);
			}else {

				test.log(Status.FAIL, "MasterofBusinessAdministration_Program url is not verified");
				System.out.println("MasterofBusinessAdministration_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MasterofBusinessAdministration_Program url is not verified: " + e.getMessage());
			System.out.println("MasterofBusinessAdministration_Program url is not verified");
			Assert.fail("MasterofBusinessAdministration_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 21)
	//	MBA with specialization in Digital Marketing Management
	public void MBAwithspecializationinDigitalMarketingManagement() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MBAwithspecializationinDigitalMarketingManagement_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MBAwithspecializationinDigitalMarketingManagement);
			Thread.sleep(3000);
			String ExpMBAwithspecializationinDigitalMarketingManagement = "https://amityonline.com/mba-digital-marketing-management-online";
			if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinDigitalMarketingManagement)) {
				test.log(Status.PASS, "MBAwithspecializationinDigitalMarketingManagement_Program url is verified");
				System.out.println("MBAwithspecializationinDigitalMarketingManagement_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MBAwithspecializationinDigitalMarketingManagement_Program url is not verified");
				System.out.println("MBAwithspecializationinDigitalMarketingManagement_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MBAwithspecializationinDigitalMarketingManagement_Program url is not verified: " + e.getMessage());
			System.out.println("MBAwithspecializationinDigitalMarketingManagement_Program url is not verified");
			Assert.fail("MBAwithspecializationinDigitalMarketingManagement_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}


	}

	@Test(priority = 22)
	//MBA with specialization in HR Analytics
	public void MBAwithspecializationinHRAnalytics() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MBAwithspecializationinHRAnalytics_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MBAwithspecializationinHRAnalytics);
			Thread.sleep(3000);
			String ExpMBAwithspecializationinHRAnalytics = "https://amityonline.com/mba-human-resources-hr-analytics-online";
			if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinHRAnalytics)) {
				test.log(Status.PASS, "MBAwithspecializationinHRAnalytics_Program url is verified");
				System.out.println("MBAwithspecializationinHRAnalytics_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MBAwithspecializationinHRAnalytics_Program url is not verified");
				System.out.println("MBAwithspecializationinHRAnalytics_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MBAwithspecializationinHRAnalytics_Program url is not verified: " + e.getMessage());
			System.out.println("MBAwithspecializationinHRAnalytics_Program url is not verified");
			Assert.fail("MBAwithspecializationinHRAnalytics_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 23)
	//MBA with specialization in Data Science
	public void MBAwithspecializationinDataScience() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MBAwithspecializationinDataScience_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MBAwithspecializationinDataScience);
			Thread.sleep(3000);
			String ExpMBAwithspecializationinDataScience = "https://amityonline.com/mba-data-science-online";
			if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinDataScience)) {

				test.log(Status.PASS, "MBAwithspecializationinDataScience_Program url is verified");
				System.out.println("MBAwithspecializationinDataScience_Program url is verified");

				Assert.assertTrue(true);
			}else {

				test.log(Status.FAIL, "MBAwithspecializationinDataScience_Program url is not verified");
				System.out.println("MBAwithspecializationinDataScience_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MBAwithspecializationinDataScience_Program url is not verified: " + e.getMessage());
			System.out.println("MBAwithspecializationinDataScience_Program url is not verified");
			Assert.fail("MBAwithspecializationinDataScience_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 24)
	//MBA with specialization in Business Analytics
	public void MBAwithspecializationinBusinessAnalytics() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MBAwithspecializationinBusinessAnalytics_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MBAwithspecializationinBusinessAnalytics);
			Thread.sleep(3000);
			String ExpMBAwithspecializationinBusinessAnalytics = "https://amityonline.com/mba-business-analytics-online";
			if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinBusinessAnalytics)) {
				test.log(Status.PASS, "MBAwithspecializationinBusinessAnalytics_Program url is verified");
				System.out.println("MBAwithspecializationinBusinessAnalytics_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MBAwithspecializationinBusinessAnalytics_Program url is not verified");
				System.out.println("MBAwithspecializationinBusinessAnalytics_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MBAwithspecializationinBusinessAnalytics_Program url is not verified: " + e.getMessage());
			System.out.println("MBAwithspecializationinBusinessAnalytics_Program url is not verified");
			Assert.fail("MBAwithspecializationinBusinessAnalytics_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 25)
	//MBA with specialization in Digital Entrepreneurship
	public void MBAwithspecializationinDigitalEntrepreneurship() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MBAwithspecializationinDigitalEntrepreneurship_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MBAwithspecializationinDigitalEntrepreneurship);
			Thread.sleep(3000);
			String ExpMBAwithspecializationinDigitalEntrepreneurship = "https://amityonline.com/mba-digital-entrepreneurship-online";
			if(driver.getCurrentUrl().equals(ExpMBAwithspecializationinDigitalEntrepreneurship)) {
				test.log(Status.PASS, "MBAwithspecializationinDigitalEntrepreneurship_Program url is verified");
				System.out.println("MBAwithspecializationinDigitalEntrepreneurship_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MBAwithspecializationinDigitalEntrepreneurship_Program url is not verified");
				System.out.println("MBAwithspecializationinDigitalEntrepreneurship_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MBAwithspecializationinDigitalEntrepreneurship_Program url is not verified: " + e.getMessage());
			System.out.println("MBAwithspecializationinDigitalEntrepreneurship_Program url is not verified");
			Assert.fail("MBAwithspecializationinDigitalEntrepreneurship_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}


	@Test(priority = 26)
	//Master of Arts (Journalism and Mass communication)
	public void MasterofArtsJournalismandMasscommunication() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MasterofArtsJournalismandMasscommunication_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MasterofArtsJournalismandMasscommunication);
			Thread.sleep(3000);
			String ExpMasterofArtsJournalismandMasscommunication = "https://amityonline.com/master-of-arts-journalism-and-mass-communication-online";
			if(driver.getCurrentUrl().equals(ExpMasterofArtsJournalismandMasscommunication)) {
				test.log(Status.PASS, "MasterofArtsJournalismandMasscommunication_Program url is verified");
				System.out.println("MasterofArtsJournalismandMasscommunication_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MasterofArtsJournalismandMasscommunication_Program url is not verified");
				System.out.println("MasterofArtsJournalismandMasscommunication_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MasterofArtsJournalismandMasscommunication_Program url is not verified: " + e.getMessage());
			System.out.println("MasterofArtsJournalismandMasscommunication_Program url is not verified");
			Assert.fail("MasterofArtsJournalismandMasscommunication_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 27)
	//M.Com with specialization in Fintech

	public void MComwithspecializationinFintech() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MComwithspecializationinFintech_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MComwithspecializationinFintech);
			Thread.sleep(3000);
			String ExpMComwithspecializationinFintech = "https://amityonline.com/mcom-fintech-online";
			if(driver.getCurrentUrl().equals(ExpMComwithspecializationinFintech)) {
				test.log(Status.PASS, "MComwithspecializationinFintech_Program url is verified");
				System.out.println("MComwithspecializationinFintech_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MComwithspecializationinFintech_Program url is not verified");
				System.out.println("MComwithspecializationinFintech_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MComwithspecializationinFintech_Program url is not verified: " + e.getMessage());
			System.out.println("MComwithspecializationinFintech_Program url is not verified");
			Assert.fail("MComwithspecializationinFintech_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 28)
	//M.Com with specialization in Financial Management
	public void MComwithspecializationinFinancialManagement() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MComwithspecializationinFinancialManagement_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MComwithspecializationinFinancialManagement);
			Thread.sleep(3000);
			String ExpMComwithspecializationinFinancialManagement = "https://amityonline.com/master-of-commerce-financial-management-online";
			if(driver.getCurrentUrl().equals(ExpMComwithspecializationinFinancialManagement)) {
				test.log(Status.PASS, "MComwithspecializationinFinancialManagement_Program url is verified");
				System.out.println("MComwithspecializationinFinancialManagement_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MComwithspecializationinFinancialManagement_Program url is not verified");
				System.out.println("MComwithspecializationinFinancialManagement_Program url is not verified");

				Assert.assertTrue(false);
			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MComwithspecializationinFinancialManagement_Program url is not verified: " + e.getMessage());
			System.out.println("MComwithspecializationinFinancialManagement_Program url is not verified");
			Assert.fail("MComwithspecializationinFinancialManagement_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 29)
	//Master of Arts in Public Policy & Governance
	public void MasterofArtsinPublicPolicyandGovernance() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MasterofArtsinPublicPolicyandGovernance_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MasterofArtsinPublicPolicyandGovernance);
			Thread.sleep(3000);
			String ExpMasterofArtsinPublicPolicyandGovernance = "https://amityonline.com/ma-public-policy";
			if(driver.getCurrentUrl().equals(ExpMasterofArtsinPublicPolicyandGovernance)) {
				test.log(Status.PASS, "MasterofArtsinPublicPolicyandGovernance_Program url is verified");
				System.out.println("MasterofArtsinPublicPolicyandGovernance_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MasterofArtsinPublicPolicyandGovernance_Program url is not verified");
				System.out.println("MasterofArtsinPublicPolicyandGovernance_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MasterofArtsinPublicPolicyandGovernance_Program url is not verified: " + e.getMessage());
			System.out.println("MasterofArtsinPublicPolicyandGovernance_Program url is not verified");
			Assert.fail("MasterofArtsinPublicPolicyandGovernance_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 30)
	//Master of Arts in Psychology
	public void MasterofArtsinPsychology() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MasterofArtsinPsychology_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MasterofArtsinPsychology);
			Thread.sleep(3000);
			String ExpMasterofArtsinPsychology = "https://amityonline.com/ma-in-psychology";
			if(driver.getCurrentUrl().equals(ExpMasterofArtsinPsychology)) {
				test.log(Status.PASS, "MasterofArtsinPsychology_Program url is verified");
				System.out.println("MasterofArtsinPsychology_Program url is verified");

				Assert.assertTrue(true);

			}else {
				test.log(Status.FAIL, "MasterofArtsinPsychology_Program url is not verified");
				System.out.println("MasterofArtsinPsychology_Program url is not verified");

				Assert.assertTrue(false);
			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MasterofArtsinPsychology_Program url is not verified: " + e.getMessage());
			System.out.println("MasterofArtsinPsychology_Program url is not verified");
			Assert.fail("MasterofArtsinPsychology_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}
	}

	@Test(priority = 31)
	//Master of Science in Data Science
	public void MasterofScienceinDataScience() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("MasterofScienceinDataScience_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", MasterofScienceinDataScience);
			Thread.sleep(3000);
			String ExpMasterofScienceinDataScience = "https://amityonline.com/msc-in-data-science";
			if(driver.getCurrentUrl().equals(ExpMasterofScienceinDataScience)) {
				test.log(Status.PASS, "MasterofScienceinDataScience_Program url is verified");
				System.out.println("MasterofScienceinDataScience_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "MasterofScienceinDataScience_Program url is not verified");
				System.out.println("MasterofScienceinDataScience_Program url is not verified");

				Assert.assertTrue(false);


			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "MasterofScienceinDataScience_Program url is not verified: " + e.getMessage());
			System.out.println("MasterofScienceinDataScience_Program url is not verified");
			Assert.fail("MasterofScienceinDataScience_Program url is not verified.");
		} catch (Exception e) {
			// Handle any other exception
			test.log(Status.FAIL, "An unexpected error occurred: " + e.getMessage());
			System.out.println("An unexpected error occurred");
			Assert.fail("Unexpected error occurred: " + e.getMessage());
		}catch (AssertionError e) {
			test.log(Status.FAIL, "An Assertion error occurred: " + e.getMessage());
			System.out.println("An Assertion error occurred");
			Assert.fail("Assertion error occurred: " + e.getMessage());

		}

	}

	@Test(priority = 32)
	public void PrintprogramsList() throws InterruptedException {

		WebElement Showmorebutton = driver.findElement(By.xpath("//span[normalize-space()='show more']"));
		Thread.sleep(2000);
		Actions act7=new Actions(driver);
		act7.moveToElement(Showmorebutton).click().perform();
		test=reports.createTest("Program List on HomePage");
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='styles_subMenuItem__GXmwt w-fit']"));
		int countofelements = elements.size();
		System.out.println("Programs Count :-  "  + (elements.size()-2));
		Thread.sleep(2000);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		for(int i=2; i<countofelements; i++) {
			String PrintPrograms = elements.get(i).getText();
			System.out.println(PrintPrograms);

		}



	}




	@AfterMethod

	public void CloseBrowser(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			// Get the name of the failed test method
			String testName = result.getName();
			// Capture screenshot and store with a unique name
			String myscreenshot = CaptureScreenshot.Screenshot(driver, testName);
			test.log(Status.FAIL, result.getThrowable());
			test.addScreenCaptureFromPath(myscreenshot);
		}
		driver.quit();

	}


}
