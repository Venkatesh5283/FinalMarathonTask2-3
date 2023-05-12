Feature: Delete Individual in SalesForce Application




Scenario Outline: Launch Browser and Load URL
And Enter the Username as <username>
And Enter the Password as <password>
When Click on Login
And Click on toggle menu button from the left corner
And Click view All
And click Individual from App Launcher
And Click on the Individuals tab 
And Search the Individuals <namedelete>
And Click on the Dropdown icon
And Select Delete
And Click Delete
And Verify Deleted as <namedelete>






Examples:
|username|password|namedelete|
|'venky@testleaf.sandbox'|'Mine@1234'|'Venkatesh'|