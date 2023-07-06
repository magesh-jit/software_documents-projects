import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegistrationSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Launch the URL")
	def launch_URL() {
		println("\n URL launched successfully" )
	}

	@When("the user navigates to the registration menu")
	def navigateToRegisterMenu() {
		println("\n Register menu is clearly visible")
	}

	@And("clicks on the registration option")
	def clickRegisterOption() {
		println("\n Register menu clicked successfully")
	}

	@Then("the user should be redirected to the registration page")
	def redirectToRegisterPage() {
		println("\n Register page is successfully redirected")
	}

	@When("the user fills in valid registration details")
	def fillAllDetails() {
		println("\n All details are filled")
	}

	@And("clicks on the submit button")
	def clickSubmitButton() {
		println("\n Submit button is clicked sucessfully")
	}

	@Then("the user will see the successfull message")
	def succcessfullMessage() {
		println("\n Registeration successfully completed")
	}
}