Feature: Login functionlity

Background: User is on main page
Given user launch "chrome" browser with exe as "G:\\Automation Support\\chromedriver.exe"
Given user provide url as "http://primusbank.qedgetech.com/"
When user provide "Admin" as Username
When user provide "Admin" as password
When user click on Login button


Scenario: add address functionality
When user click on branches
When user select "INDIA" as country
When user select "MAHARASTRA" as state
When user select "MUMBAI" as city
When user click on submit
Then application shows list of branches for mumbai city



 