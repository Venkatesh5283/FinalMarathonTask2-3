package pagesMarathon;

import java.io.IOException;

import org.openqa.selenium.By;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pagesAssignment.HomePageAssignment;
import pagesAssignment.SalesforceLoginPageAssignment;

public class LoginPageCreateIndividual extends BaseClassMarathon {
	
	@And ("Enter the Username as {string}")
	public LoginPageCreateIndividual salesforceUsername(String user1) throws IOException
	{
		
		try {
			getDriver().findElement(By.id("username")).sendKeys(user1);
			reportStep("Username Entered Successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Username Entered not Successfully", "fail");
		}
		return this;
		
	}
	@And ("Enter the Password as {string}")
	public LoginPageCreateIndividual salesforcePassword(String pass1) throws IOException
	{
		try {
			getDriver().findElement(By.id("password")).sendKeys(pass1);
			reportStep("Password Entered Successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Password Not Entered Successfully", "fail");
		}
		return this;
	}
	@When ("Click on Login")
	public HomePageCreateIndividual clicksalesforceLogin() throws IOException
	{
		try {
			getDriver().findElement(By.id("Login")).click();
			reportStep("Login Clicked Successfully", "pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Login Not Clicked Successfully", "fail");
		}
		return new HomePageCreateIndividual();
	}

}
