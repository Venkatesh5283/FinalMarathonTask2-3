Feature: Create Individual in SalesForce Application




Scenario Outline: Launch Browser and Load URL
And Enter the Username as <username>
And Enter the Password as <password>
When Click on Login
And Click on toggle menu button from the left corner
And Click view All
And click Individual from App Launcher
And Click on the Dropdown icon in the Individuals tab
And Click on New Individual
And Enter the Last Name as <name>
And Click save
And Verify Individual <name>


Examples:
|username|password|name|
|'venky@testleaf.sandbox'|'Mine@1234'|'Venkatesh'|
