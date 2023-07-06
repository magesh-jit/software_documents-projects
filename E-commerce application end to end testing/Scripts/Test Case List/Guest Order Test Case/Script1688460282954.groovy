import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store/a_Computers'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Computers/a_Notebooks'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Notebooks/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Notebooks/a_Electronics'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Electronics/a_Cell phones'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Cell phones/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Cell phones/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Shopping Cart/input_1,600.00_termsofservice'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Shopping Cart/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Login/button_Checkout as Guest'))

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_First name_BillingNewAddress.FirstName'), 
    'magesh')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Last name_BillingNewAddress.LastName'), 
    'magesh')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Email_BillingNewAddress.Email'), 
    GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Company_BillingNewAddress.Company'), 
    GlobalVariable.company)

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Company_BillingNewAddress.Company'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/select_Select countryUnited StatesAfghanist_6b3112'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/select_Select countryUnited StatesAfghanist_6b3112'), 
    '162', true)

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_City_BillingNewAddress.City'), 
    'one coty')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Address 1_BillingNewAddress.Address1'), 
    'one address')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Zip  postal code_BillingNewAddress.Zi_77bd94'), 
    '41041')

WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/input_Phone number_BillingNewAddress.PhoneNumber'), 
    '7417417417')

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/button_Continue'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_nopCommerce demo store. Checkout/button_Continue_1'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue_2'), 30)

WebUI.verifyElementVisible(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue_2'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue_2'))

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue_4'), 5)

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Continue_4'))

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Checkout/button_Confirm_5'), 5)

WebUI.click(findTestObject('Page_nopCommerce demo store. Checkout/button_Confirm_5'))

WebUI.delay(3)

WebUI.closeBrowser()

