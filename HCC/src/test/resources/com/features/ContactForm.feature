Feature: Contact Form field validation

@Validdetails
Scenario: Check whether user is able to fill contact form fields or not
Given User is in homepage and clicking the contact link to reach its contact form page
When user enters the data into the respective fields
Then user should be able to submit the details on clicking submit button


@DataDriven
Scenario Outline: Check whether user is able to fill contact form fields with different data
Given User clicks on contact menu link available on home page
When user enters the "<name>","<phonenumber>","<email>" and "<message>" into the respective fields
Then user should be able to submit the Contact Form
Examples:
|name       |phonenumber|    |email                  |message   |
|Ambika     |8978897AA0 |    |ambika@gmail.com       |For bcom  |
|Vaishnavi  |           |    |vaishu@gmail.com       |For mba   |
|Minaxi     |8978897883 |    |minaxigmail.com       |For bba   |
