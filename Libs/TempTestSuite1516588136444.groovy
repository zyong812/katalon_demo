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
    TestCaseMain.runTestCase('Test Cases/TC_no_html_report', new TestCaseBinding('Test Cases/TC_no_html_report',  null), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_1() {
    TestCaseMain.runTestCase('Test Cases/TC_try_catch_failed_status', new TestCaseBinding('Test Cases/TC_try_catch_failed_status',  null), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/demo1')

suiteProperties.put('name', 'demo1')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/yong/Katalon Studio/katalon_demo/Reports/demo1/20180122_102856/execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('demo1', suiteProperties)

TestCaseMain.invokeStartSuite('Test Suites/demo1')

(0..1).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

TestCaseMain.invokeEndSuite('Test Suites/demo1')

KeywordLogger.getInstance().endSuite('demo1', null)
