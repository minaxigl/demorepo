Feature:  Downloading the Syllabus from Courses
@downloadcourse
Scenario: Check whether course is downloaded or not
Given User is in homepage and clicking the Courses link to reach Download page
And click the download button
When Save the Courses File
Then Check whether downloaded file is available