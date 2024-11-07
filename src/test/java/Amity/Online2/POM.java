package Amity.Online2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class POM {
	
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	
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

	
}