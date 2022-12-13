Feature: Comparing the images

@imagecomparison
Scenario: Compare the captured screenshot manually with captured screenshot via automation
Given User is on home page and captured the screenshot manually
And Capture the screenshot via automation
When Reading both the images from their location and Compare the both images
Then We can see that two images are different or same