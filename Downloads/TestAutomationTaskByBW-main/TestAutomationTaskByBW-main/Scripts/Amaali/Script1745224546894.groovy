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

<?xml version="1.0" encoding="UTF-8"?>
<TestCaseEntity>
   <description></description>
   <name>Create and auto approve new meeting with all the valid fields_P</name>
   <tag></tag>
   <integratedEntity>
	  <productName>Azure</productName>
	  <properties>
		 <entry>
			<key>azure.testcase.ids</key>
			<value>24635</value>
		 </entry>
	  </properties>
	  <type>TESTCASE</type>
   </integratedEntity>
   <comment></comment>
   <recordOption>OTHER</recordOption>
   <testCaseGuid>54e4affa-6b95-49e0-aff7-41acfee31a14</testCaseGuid>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>3c1ecca7-c781-456e-be2e-f799f7cc356c</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>926216d4-698d-4cb0-8cb4-e51dbdf2f5e7</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>5068a4b9-892d-46b3-8e26-ebbfebed4b4f</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>7eaec368-9bb2-42e6-bb22-cfa1c05bba0d</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>5d45ba23-5340-4f3e-8762-c7927692c541</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>3e76ecbc-6537-4ecc-aae8-e9f4cc6a1508</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>ecfc901f-7d79-4f1e-9326-81b35ad8819f</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>e76d48f2-e523-4a90-a520-c60354c18b1e</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>b7c4f38a-4435-4645-ba02-25ee72628470</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>89851708-0754-48bb-afcb-dfbe10f56a64</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>853a18c6-09b2-40db-9cbe-16626d5a1d24</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>0d4fd06d-3e22-4b91-bb06-e9c9f887d5fc</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>0465598e-d607-484f-9341-7d48cea36306</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>a7d1278e-3728-4609-92f5-04656f19b3de</variableId>
   </variableLinks>
   <variableLinks>
	  <testDataLinkId></testDataLinkId>
	  <type>DEFAULT</type>
	  <value></value>
	  <variableId>6deabc7b-0ff0-4244-b3b9-88e26180d00c</variableId>
   </variableLinks>
   <variable>
	  <defaultValue>'اوتو_نبذة عن الميتنج_1'</defaultValue>
	  <description></description>
	  <id>3c1ecca7-c781-456e-be2e-f799f7cc356c</id>
	  <masked>false</masked>
	  <name>MeetingDescription</name>
   </variable>
   <variable>
	  <defaultValue>'طالب الاجتماع'</defaultValue>
	  <description></description>
	  <id>926216d4-698d-4cb0-8cb4-e51dbdf2f5e7</id>
	  <masked>false</masked>
	  <name>Requester</name>
   </variable>
   <variable>
	  <defaultValue>'التصنيف الفرعي للاجتماع'</defaultValue>
	  <description></description>
	  <id>5068a4b9-892d-46b3-8e26-ebbfebed4b4f</id>
	  <masked>false</masked>
	  <name>MeetingSubClassification</name>
   </variable>
   <variable>
	  <defaultValue>'ملاحظات الاجتماع'</defaultValue>
	  <description></description>
	  <id>7eaec368-9bb2-42e6-bb22-cfa1c05bba0d</id>
	  <masked>false</masked>
	  <name>MeetingNote</name>
   </variable>
   <variable>
	  <defaultValue>'سبب الاجتماع'</defaultValue>
	  <description></description>
	  <id>5d45ba23-5340-4f3e-8762-c7927692c541</id>
	  <masked>false</masked>
	  <name>ImportantReason</name>
   </variable>
   <variable>
	  <defaultValue>'قاعة الاجتماع'</defaultValue>
	  <description></description>
	  <id>3e76ecbc-6537-4ecc-aae8-e9f4cc6a1508</id>
	  <masked>false</masked>
	  <name>MeetingRoom</name>
   </variable>
   <variable>
	  <defaultValue>'غير مرن'</defaultValue>
	  <description></description>
	  <id>ecfc901f-7d79-4f1e-9326-81b35ad8819f</id>
	  <masked>false</masked>
	  <name>meetingFlexability</name>
   </variable>
   <variable>
	  <defaultValue>'30'</defaultValue>
	  <description></description>
	  <id>e76d48f2-e523-4a90-a520-c60354c18b1e</id>
	  <masked>false</masked>
	  <name>TopicDuration</name>
   </variable>
   <variable>
	  <defaultValue>'نبذة عن الموضوع'</defaultValue>
	  <description></description>
	  <id>b7c4f38a-4435-4645-ba02-25ee72628470</id>
	  <masked>false</masked>
	  <name>TopicDetails</name>
   </variable>
   <variable>
	  <defaultValue>'التوصيات المطلوبة'</defaultValue>
	  <description></description>
	  <id>89851708-0754-48bb-afcb-dfbe10f56a64</id>
	  <masked>false</masked>
	  <name>TopicRecommendation</name>
   </variable>
   <variable>
	  <defaultValue>'التحديات المطلوبة'</defaultValue>
	  <description></description>
	  <id>853a18c6-09b2-40db-9cbe-16626d5a1d24</id>
	  <masked>false</masked>
	  <name>TopicChallanges</name>
   </variable>
   <variable>
	  <defaultValue>'الدعم المطلوب'</defaultValue>
	  <description></description>
	  <id>0d4fd06d-3e22-4b91-bb06-e9c9f887d5fc</id>
	  <masked>false</masked>
	  <name>TopicRequiredSupport</name>
   </variable>
   <variable>
	  <defaultValue>'الخطوات القادمة'</defaultValue>
	  <description></description>
	  <id>0465598e-d607-484f-9341-7d48cea36306</id>
	  <masked>false</masked>
	  <name>TopicNextStep</name>
   </variable>
   <variable>
	  <defaultValue>'Auto_Topic_generated'</defaultValue>
	  <description></description>
	  <id>a7d1278e-3728-4609-92f5-04656f19b3de</id>
	  <masked>false</masked>
	  <name>TopicTitle</name>
   </variable>
   <variable>
	  <defaultValue>'اوتو_ميتنج'</defaultValue>
	  <description></description>
	  <id>6deabc7b-0ff0-4244-b3b9-88e26180d00c</id>
	  <masked>false</masked>
	  <name>MeetingTitle</name>
   </variable>
</TestCaseEntity>
