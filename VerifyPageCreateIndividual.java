package pagesMarathon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.java.en.And;

public class VerifyPageCreateIndividual extends BaseClassMarathon {
	@And ("Verify Individual {string}")
	public void verifyIndividual(String nameverify)
	{
	
String message = getDriver().findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();

	
	if(message.contains(nameverify))
	{
		System.out.println("Individual was Verified and it was created Successfully");
	}
	else
	{
		System.out.println("Individual was Verified and it was not created Successfully");
	}
	}

	@And ("Verify Deleted as {string}")	
	public void verifyDelete(String delname) throws InterruptedException
	{
		String msg = getDriver().findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		 //System.out.println(msg);
		 getDriver().findElement(By.xpath("//input[@class='slds-input']")).sendKeys(delname,Keys.ENTER);
		Thread.sleep(3000);
		String verify = getDriver().findElement(By.xpath("//span[text()='No items to display.']")).getText();
		//Verify Whether Individual is Deleted using Individual last name"
		if(verify.contains("No items to display"))
		{
			System.out.println("Individual was verfied and it was Deleted Successfully");
		}
		else
		{
			System.out.println("Individual was verfied and it was not Deleted Successfully");
		}
	}

	
	@And ("Verify the first name as {string}")
	public void verifyEdit(String fnamearg)
	{
	String msg = getDriver().findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
	   //Verify the first name as 'Ganesh'
		//System.out.println(msg);
		if(msg.contains(fnamearg))
		{
			System.out.println("Individual was Verified and it was Edited Successfully");
		}
		else
		{
			System.out.println("Individual was Verified and it was not Edited Successfully");
		}
	}
}
