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

	//////////--------------------------UG Programs------------------------------------//////////////////////////////////////////////////

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Computer Applications']")  // Bachelor of Computer Applications
	WebElement BCAprogram;

	@FindBy(xpath = "/html[1]/body[1]/footer[1]/div[1]/div[2]/div[1]/ul[2]/li[3]/a[1]")  // BCA with specialization in Cloud & Security
	WebElement BCASpec;

	@FindBy(xpath = "//a[normalize-space()='BCA with specialization in Data Analytics']")  // BCA with specialization in Data Analytics
	WebElement BCAdataAnalytics;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Business Administration']")  // Bachelor of Business Administration
	WebElement BBA;

	@FindBy(xpath = "//a[contains(text(),'Bachelor of Arts (Journalism and Mass communicatio')]")  // Bachelor of Arts (Journalism and Mass communication)
	WebElement BAJandM;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Commerce']")  // Bachelor of Commerce
	WebElement Bcom;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts']")  // Bachelor of Arts
	WebElement BA;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Art (Kannada Medium)']")  // Bachelor of Art (Kannada Medium)
	WebElement BAKannada;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Malayalam Medium)']")  // Bachelor of Arts (Malayalam Medium)
	WebElement BAMalayalam;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Tamil Medium)']")  // Bachelor of Arts (Tamil Medium)
	WebElement BATamil;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Telugu Medium)']")  // Bachelor of Arts (Telugu Medium)
	WebElement BATelugu;

	@FindBy(xpath = "//a[normalize-space()='Bachelor of Arts (Hindi Medium)']")  // Bachelor of Arts (Hindi Medium)
	WebElement BAHindi;

	@FindBy(xpath = "//a[contains(text(),'B.Com with Specialization in International Finance')]")  // B.Com with Specialization in International Finance & Accounting
	WebElement BcomFinance;

	@FindBy(xpath = "//a[normalize-space()='Bachelor Of Commerce (Honours)']")  // Bachelor Of Commerce (Honours)
	WebElement BcomHonours;

	/////////////////////--------------------------PG Program-------------------------///////////////////////////////////////////


	@FindBy(xpath = "//a[normalize-space()='Master of Computer Applications']")  //Master of Computer Applications
	WebElement MCANormal;

	@FindBy(xpath = "//a[normalize-space()='MCA with specialization in Blockchain']")  //MCA with specialization in Blockchain
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

	@Test(priority = 1)
	// Bachelor of Computer Applications
	public void BachelorofComputerApplications() throws InterruptedException {

		//Bachelor of Computer Applications
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofComputerApplications_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BCAprogram);
			Thread.sleep(3000);
			String ExpBCAurl = "https://amityonline.com/bachelor-of-computer-applications-online";
			if(driver.getCurrentUrl().equals(ExpBCAurl)) {
				test.log(Status.PASS, "BachelorofComputerApplications_Program url is verified");
				System.out.println("BachelorofComputerApplications_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofComputerApplications_Program url is not verified");
				System.out.println("BachelorofComputerApplications_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofComputerApplications_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofComputerApplications_Program url is not verified");
			Assert.fail("BachelorofComputerApplications_Program url is not verified.");
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

	@Test(priority = 2)
	//BCA with specialization in Cloud & Security
	public void BCAwithspecializationinCloudandSecurity() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BCAwithspecializationinCloudandSecurity_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BCASpec);
			Thread.sleep(3000);
			String ExpBCASpurl = "https://amityonline.com/bca-cloud-security-online";
			if(driver.getCurrentUrl().equals(ExpBCASpurl)) {
				test.log(Status.PASS, "BCAwithspecializationinCloudandSecurity_Program url is verified");
				System.out.println("BCAwithspecializationinCloudandSecurity_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BCAwithspecializationinCloudandSecurity_Program url is not verified");
				System.out.println("BCAwithspecializationinCloudandSecurity_Program url is not verified");

				Assert.assertTrue(false);
			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BCAwithspecializationinCloudandSecurity_Program url is not verified: " + e.getMessage());
			System.out.println("BCAwithspecializationinCloudandSecurity_Program url is not verified");
			Assert.fail("BCAwithspecializationinCloudandSecurity_Program url is not verified.");
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

	@Test(priority = 3)
	//BCA with specialization in Data Analytics
	public void BCAwithspecializationinDataAnalytics() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BCAwithspecializationinDataAnalytics_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BCAdataAnalytics);
			Thread.sleep(3000);
			String ExpBCAdataAnalytics = "https://amityonline.com/bca-data-analytics-online";
			if(driver.getCurrentUrl().equals(ExpBCAdataAnalytics)) {
				test.log(Status.PASS, "BCAwithspecializationinDataAnalytics_Program url is verified");
				System.out.println("BCAwithspecializationinDataAnalytics_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BCAwithspecializationinDataAnalytics_Program url is not verified");
				System.out.println("BCAwithspecializationinDataAnalytics_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BCAwithspecializationinDataAnalytics_Program url is not verified: " + e.getMessage());
			System.out.println("BCAwithspecializationinDataAnalytics_Program url is not verified");
			Assert.fail("BCAwithspecializationinDataAnalytics_Program url is not verified.");
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

	@Test(priority = 4)
	//Bachelor of Business Administration
	public void BachelorofBusinessAdministration() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofBusinessAdministration_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BBA);
			Thread.sleep(3000);
			String ExpBBA = "https://amityonline.com/bachelor-of-business-administration-online";
			if(driver.getCurrentUrl().equals(ExpBBA)) {

				test.log(Status.PASS, "BachelorofBusinessAdministration_Program url is verified");
				System.out.println("BachelorofBusinessAdministration_Program url is verified");

				Assert.assertTrue(true);
			}else {

				test.log(Status.FAIL, "BachelorofBusinessAdministration_Program url is not verified");
				System.out.println("BachelorofBusinessAdministration_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofBusinessAdministration_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofBusinessAdministration_Program url is not verified");
			Assert.fail("BachelorofBusinessAdministration_Program url is not verified.");
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

	@Test(priority = 5)
	//Bachelor of Arts (Journalism and Mass communication)
	public void BachelorofArtsJournalismandMasscommunication() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsJournalismandMasscommunication_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BAJandM);
			Thread.sleep(3000);
			String ExpBAJandM = "https://amityonline.com/bachelor-of-arts-journalism-and-mass-communication-online";
			if(driver.getCurrentUrl().equals(ExpBAJandM)) {
				test.log(Status.PASS, "BachelorofArtsJournalismandMasscommunication_Program url is verified");
				System.out.println("BachelorofArtsJournalismandMasscommunication_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofArtsJournalismandMasscommunication_Program url is not verified");
				System.out.println("BachelorofArtsJournalismandMasscommunication_Program url is not verified");

				Assert.assertTrue(false);
			}

		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsJournalismandMasscommunication_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsJournalismandMasscommunication_Program url is not verified");
			Assert.fail("BachelorofArtsJournalismandMasscommunication_Program url is not verified.");
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

	@Test(priority = 6)
	//Bachelor of Commerce

	public void BachelorofCommerce() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofCommerce_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", Bcom);
			Thread.sleep(3000);
			String ExpBcom = "https://amityonline.com/bachelor-of-commerce-online";
			if(driver.getCurrentUrl().equals(ExpBcom)) {
				test.log(Status.PASS, "BachelorofCommerce_Program url is verified");
				System.out.println("BachelorofCommerce_Program url is verified");
				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofCommerce_Program url is not verified");
				System.out.println("BachelorofCommerce_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofCommerce_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofCommerce_Program url is not verified");
			Assert.fail("BachelorofCommerce_Program url is not verified.");
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

	@Test(priority = 7)
	//Bachelor of Arts
	public void BachelorofArts() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArts_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BA);
			Thread.sleep(3000);
			String ExpBA = "https://amityonline.com/bachelor-of-arts-online";
			if(driver.getCurrentUrl().equals(ExpBA)) {
				test.log(Status.PASS, "BachelorofArts_Program url is verified");
				System.out.println("BachelorofArts_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofArts_Program url is not verified");
				System.out.println("BachelorofArts_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArts_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArts_Program url is not verified");
			Assert.fail("BachelorofArts_Program url is not verified.");
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

	@Test(priority = 8)
	//Bachelor of Art (Kannada Medium)
	public void BachelorofArtKannadaMedium() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtKannadaMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BAKannada);
			Thread.sleep(3000);
			String ExpBAKannada = "https://amityonline.com/bachelor-of-arts-kannada-online";
			if(driver.getCurrentUrl().equals(ExpBAKannada)) {
				test.log(Status.PASS, "BachelorofArtKannadaMedium_Program url is verified");

				System.out.println("BachelorofArtKannadaMedium_Program url is verified");
				Assert.assertTrue(true);

			}else {
				test.log(Status.FAIL, "BachelorofArtKannadaMedium_Program url is not verified");
				System.out.println("BachelorofArtKannadaMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtKannadaMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtKannadaMedium_Program url is not verified");
			Assert.fail("BachelorofArtKannadaMedium_Program url is not verified.");
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

	@Test(priority = 9)
	//Bachelor of Arts (Malayalam Medium)
	public void BachelorofArtsMalayalamMedium() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsMalayalamMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BAMalayalam);
			Thread.sleep(3000);
			String ExpBAMalayalam = "https://amityonline.com/bachelor-of-arts-malayalam-online";
			if(driver.getCurrentUrl().equals(ExpBAMalayalam)) {
				test.log(Status.PASS, "BachelorofArtsMalayalamMedium_Program url is verified");

				System.out.println("BachelorofArtsMalayalamMedium_Program url is verified");
				Assert.assertTrue(true);

			}else {
				test.log(Status.FAIL, "BachelorofArtsMalayalamMedium_Program url is not verified");
				System.out.println("BachelorofArtsMalayalamMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsMalayalamMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsMalayalamMedium_Program url is not verified");
			Assert.fail("BachelorofArtsMalayalamMedium_Program url is not verified.");
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

	@Test(priority = 10)
	//Bachelor of Arts (Tamil Medium)
	public void BachelorofArtsTamilMedium() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsTamilMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BATamil);
			Thread.sleep(3000);
			String ExpBATamil = "https://amityonline.com/bachelor-of-arts-tamil-online";
			if(driver.getCurrentUrl().equals(ExpBATamil)) {
				test.log(Status.PASS, "BachelorofArtsTamilMedium_Program url is verified");
				System.out.println("BachelorofArtsTamilMedium_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofArtsTamilMedium_Program url is not verified");
				System.out.println("BachelorofArtsTamilMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsTamilMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsTamilMedium_Program url is not verified");
			Assert.fail("BachelorofArtsTamilMedium_Program url is not verified.");
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

	@Test(priority = 11)
	public void BachelorofArtsTeluguMedium() throws InterruptedException {
		//Bachelor of Arts (TAssert.assertTrue(false);elugu Medium)
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsTeluguMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BATelugu);
			Thread.sleep(3000);
			String ExpBATelugu = "https://amityonline.com/bachelor-of-arts-telugu-online";
			if(driver.getCurrentUrl().equals(ExpBATelugu)) {
				test.log(Status.PASS, "BachelorofArtsTeluguMedium_Program url is verified");
				System.out.println("BachelorofArtsTeluguMedium_Program url is verified");

				Assert.assertTrue(true);
			}else {

				test.log(Status.FAIL, "BachelorofArtsTeluguMedium_Program url is not verified");
				System.out.println("BachelorofArtsTeluguMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsTeluguMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsTeluguMedium_Program url is not verified");
			Assert.fail("BachelorofArtsTeluguMedium_Program url is not verified.");
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

	@Test(priority = 12)
	//Bachelor of Arts (Hindi Medium)
	public void BachelorofArtsHindiMedium() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorofArtsHindiMedium_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BAHindi);
			Thread.sleep(3000);
			String ExpBAHindi = "https://amityonline.com/bachelor-of-arts-hindi-medium-online";
			if(driver.getCurrentUrl().equals(ExpBAHindi)) {
				test.log(Status.PASS, "BachelorofArtsHindiMedium_Program url is verified");
				System.out.println("BachelorofArtsHindiMedium_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorofArtsHindiMedium_Program url is not verified");
				System.out.println("BachelorofArtsHindiMedium_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorofArtsHindiMedium_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorofArtsHindiMedium_Program url is not verified");
			Assert.fail("BachelorofArtsHindiMedium_Program url is not verified.");
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

	@Test(priority = 13)
	//B.Com with Specialization in International Finance & Accounting
	public void BComwithSpecializationinInternationalFinanceandAccounting() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BComwithSpecializationinInternationalFinanceandAccounting_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BcomFinance);
			Thread.sleep(3000);
			String ExpBcomFinance = "https://amityonline.com/bcom-internationalfinance";
			if(driver.getCurrentUrl().equals(ExpBcomFinance)) {
				test.log(Status.PASS, "BComwithSpecializationinInternationalFinanceandAccounting_Program url is verified");
				System.out.println("BComwithSpecializationinInternationalFinanceandAccounting_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified");
				System.out.println("BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified: " + e.getMessage());
			System.out.println("BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified");
			Assert.fail("BComwithSpecializationinInternationalFinanceandAccounting_Program url is not verified.");
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

	@Test(priority = 14)
	//Bachelor Of Commerce (Honours)
	public void BachelorOfCommerceHonours() throws InterruptedException {
		Actions act7=new Actions(driver);
		act7.moveToElement(showMorElement).click().perform();
		test=reports.createTest("BachelorOfCommerceHonours_Program");
		try {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", BcomHonours);
			Thread.sleep(3000);
			String ExpBcomHonours = "https://amityonline.com/bachelor-of-commerce-honours";
			if(driver.getCurrentUrl().equals(ExpBcomHonours)) {
				test.log(Status.PASS, "BachelorOfCommerceHonours_Program url is verified");
				System.out.println("BachelorOfCommerceHonours_Program url is verified");

				Assert.assertTrue(true);
			}else {
				test.log(Status.FAIL, "BachelorOfCommerceHonours_Program url is not verified");
				System.out.println("BachelorOfCommerceHonours_Program url is not verified");

				Assert.assertTrue(false);
			}
		}catch (NoSuchElementException e) {
			// Log failure in Extent report when element is not found
			test.log(Status.FAIL, "BachelorOfCommerceHonours_Program url is not verified: " + e.getMessage());
			System.out.println("BachelorOfCommerceHonours_Program url is not verified");
			Assert.fail("BachelorOfCommerceHonours_Program url is not verified.");
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
			String ExpMCANormal = "https://amityonline.com/master-of-computer-applications-online";
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
/*
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

	*/






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
