Feature: Login functionlity

Background: User is on main page
Given user launch "chrome" browser with exe as "G:\\Automation Support\\chromedriver.exe"
Given user provide url as "http://primusbank.qedgetech.com/"



Scenario: Login functionality with valid credentials
When user provide "Admin" as Username
When user provide "Admin" as password
When user click on Login button
Then application shows user profile to user



 