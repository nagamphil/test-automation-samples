Feature: AutomatingSmartBearApplication
Scenario: ValidateLogin
Given Open the Browser
Given Navigate to the Application
When Enter the username
When Enter the password
When Click the login button
Then Verify login successfull or not
Scenario: ValidateLoginFail
Given Open the Browser
Given Navigate to the Application
When Enter the username
When Enter the password
When Click the login button
Then Verify login successfull or not
Scenario: Order
When Click Order button
When Product Information
When Address Information
When Payment Information
Then Click Reset
Then Verify the Process
Scenario Outline: LoginWithTestParameter
Given Open the Browser
Given Navigate to the Application
When Enter the username "<usernamedata>"
When Enter the password	"<pworddata>"
When Click the login button
Then Verify login successfull or not
Examples: 
|usernamedata|pworddata|
|Tester|test|
Scenario Outline: OrderWithTestParameter
Given Open the Browser
Given Navigate to the Application
When Enter the username "<usernamedata>"
When Enter the password	"<pworddata>"
When Click the login button
When Click Order button
When Address Information
When Customername "<customername>"
When Street "<street>"
When City "<city>"
When State "<state>"
When Zip	"<zip>"
Examples: 
|usernamedata|pworddata|customername|street|city|state|zip|
|Tester|test|Naga|AnnSt|chennai|TamilNadu|612204|
|Tester|test|vino|kamarjSt|chennai|TamilNadu|612204|
|Tester|test|Naga|kalaignar St|madurai|TamilNadu|612204|


