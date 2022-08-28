Feature: ValidationAutomationApplication
Background: 
Given Open the Browser
Given Navigate to the Application
@Validate @Sanity
Scenario: ValidateLoginFail
When Enter the username
When Enter the password
When Click the login button
#Then Verify login successfull or not
@order @Regression
Scenario: Order
When Enter the username
When Enter the password
When Click the login button
When Click Order button
When Product Information
When Address Information
When Payment Information
Then Click Reset
Then Verify the Process