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

WebUI.setText(findTestObject('Object Repository/EranedLeaveAppr/Page_ERP/input_Login_LoginName'), '000850')

WebUI.setEncryptedText(findTestObject('Object Repository/EranedLeaveAppr/Page_ERP/input_Login_Password'), 'ZyJNmQzJyQg=')

WebUI.setText(findTestObject('Object Repository/EranedLeaveAppr/Page_ERP/input__submit__input'), '9')

WebUI.click(findTestObject('Object Repository/Eraned_Leave/Page_ERP/button_Sign in'))

WebUI.scrollToPosition(1,297)

WebUI.click(findTestObject('EranedLeaveAppr/Page_iERP Suite/a_Approval Inbox'))

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/a_Approval Inbox'))

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/a_Inbox'))

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/u_Leave request for Employee  000851  DIPAK_384218'))

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/span_-Select-'))

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/li_YES'))

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/span_-Select-'))

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/li_000850Dilip KumarLDC'))

WebUI.setText(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/textarea__Remarks'), 'ok')

WebUI.setText(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/textarea_OutStation Remarks_OutStationRemarks'), 
    'ok')

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/button_Choose Action'))

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/input_Choose Action_Actionstyle'))

WebUI.click(findTestObject('Object Repository/EranedLeaveAppr/Page_iERP Suite/button_OK'))

