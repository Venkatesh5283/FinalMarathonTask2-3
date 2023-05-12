Feature: Edit Individual in SalesForce Application




Scenario Outline: Launch Browser and Load URL
And Enter the Username as <username>
And Enter the Password as <password>
When Click on Login
And Click on toggle menu button from the left corner
And Click view All
And click Individual from App Launcher
And Click on the Individuals tab 
And Search the Individuals <nameedit>
And Click on the Dropdown icon
And Select Edit
And Select Salutation as Mr
And Enter the first name as <fname>
And Click on Save
And Verify the first name as <fname>


Examples:
|username|password|nameedit|fname|
|'venky@testleaf.sandbox'|'Mine@1234'|'Venkatesh'|'Shanmugam'|