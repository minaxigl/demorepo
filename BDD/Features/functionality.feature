Feature: Test the login of ksrtc

Background: 
Before and After methods are running.


@Datadriven
Scenario Outline: Test for valid details
Given Open the chrome browser and url of the application
When Enter the "<username>" and "<password>"
Then Login success

Examples:
 |username  |passwd   |
 |aaaa      |kgh      |
 |dvdd      |dvsdvsd  |

 
 @ValidLogin
Scenario: Test for valid details
Given Open the chrome browser and url of the application
When Enter the username and password
Then Login success
 