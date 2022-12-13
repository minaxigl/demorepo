Feature: Copying the text from web page to notepad
@CopytextPassscenario
Scenario: Check whether text is copied and pasted in notepad
Given User is in HomePage and Navigating to About Hindustancollege page
When Copy the text from webpage
And Paste it in Notepad
Then save the Notepad
And close it

@CopytextFailscenario
Scenario: Failing deliberately
Given User is in HomePage and Navigating to Invalid page
When Copy the text from AboutHindustanCollege Page
And Paste it in textfile
Then save the textfile
And close the textfile