Feature: AutomatingSmartBearApplication
Background: 
Given Open the Browser
Given Navigate to the Application
@Login @Sanity
Scenario: ValidateLogin
When Enter the username
When Enter the password
When Click the login button
Then Verify login successfull or not
@LoginParamter @Regression
Scenario Outline: LoginWithTestParameter
When Enter the username "<usernamedata>"
When Enter the password	"<pworddata>"
When Click the login button
Then Verify login successfull or not
Examples: 
|usernamedata|pworddata|
|Tester|test|
@OrderParameter @Sanity
Scenario Outline: OrderWithTestParameter
When Enter the username "<usernamedata>"
And Enter the password	"<pworddata>"
And Click the login button
And Click Order button
And Address Information
And Customername "<customername>"
And Street "<street>"
And City "<city>"
And State "<state>"
And Zip	"<zip>"
Examples: 
|usernamedata|pworddata|customername|street|city|state|zip|
|Tester|test|Naga|AnnSt|chennai|TamilNadu|612204|
|Tester|test|vino|kamarjSt|chennai|TamilNadu|612204|
|Tester|test|Naga1|kalaignar St|madurai|TamilNadu|612204|
@OrderwithDataTableConcept
Scenario: OrderwithDataTableConcept
When Enter the username 
|Tester|naga|
|AAA|BBB|
And Enter the password	
|test|

And Click the login button
And Click Order button
And Address Information
And Customername 
|Yazh|
And Street 
|Anna st|
And City 
|Trichy|
And State 
|AP|
And Zip	
|600098|


