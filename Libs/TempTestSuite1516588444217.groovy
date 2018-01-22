import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData



def static runTestCase_0() {
    TestCaseMain.runTestCase('Test Cases/TC_try_catch_failed_status', new TestCaseBinding('Test Cases/TC_try_catch_failed_status',  null), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/try_catch_failed_status')

suiteProperties.put('name', 'try_catch_failed_status')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/yong/Katalon Studio/katalon_demo/Reports/try_catch_failed_status/20180122_103403/execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('try_catch_failed_status', suiteProperties)

TestCaseMain.invokeStartSuite('Test Suites/try_catch_failed_status')

(0..0).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

TestCaseMain.invokeEndSuite('Test Suites/try_catch_failed_status')

KeywordLogger.getInstance().endSuite('try_catch_failed_status', null)
