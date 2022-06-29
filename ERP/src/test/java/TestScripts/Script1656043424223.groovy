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

WebUI.navigateToUrl('http://192.168.6.18:501/')

WebUI.setText(findTestObject('Object Repository/Eraned_Leave/Page_ERP/input_Login_LoginName'), '000851')

WebUI.setEncryptedText(findTestObject('Object Repository/Eraned_Leave/Page_ERP/input_Login_Password'), 'ZyJNmQzJyQg=')

WebUI.setText(findTestObject('Object Repository/Eraned_Leave/Page_ERP/input__submit__input'), '6')

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_ERP/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/a_Employee Self Service'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/a_Leave Request'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/input_Leave Request Details_New Leave Request'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/b'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/li_LEAVE REQUEST'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/span_-Select-'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/li_EARNED LEAVE'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/input__LeaveStartDate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/a_1'))

WebUI.setText(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/textarea__LeaveReason'), 'wedding')

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/input__LeaveEndDate'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/a_2'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/input_OutStation Start Date_FromDate'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/a_1'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/input_OutStation End Date_ToDate'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/a_2'))

WebUI.setText(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/textarea_OutStation Remarks_OutStationRemarks'), 
    'wedding')

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/span_Choose Action_ace-icon fa fa-caret-dow_7e0bcf'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/input_Choose Action_Actionstyle'))

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_iERP Suite/button_OK'))

