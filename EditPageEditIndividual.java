package pagesMarathon;

import org.openqa.selenium.By;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.java.en.And;

public class EditPageEditIndividual extends BaseClassMarathon {
	@And ("Select Salutation as Mr")
	public EditPageEditIndividual selectMR()
	{
	getDriver().findElement(By.xpath("//a[@class='select']")).click();
	getDriver().findElement(By.xpath("//a[text()='Mr.']")).click();
	return this;
	}
	
	@And ("Enter the first name as {string}")
	public EditPageEditIndividual enterFirstNameedit(String fnamearg)
	{
		getDriver().findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys(fnamearg);
		return this;
	}
	
	
	@And ("Click on Save")
	public VerifyPageCreateIndividual clickSaveedit() throws InterruptedException
	{
		getDriver().findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	Thread.sleep(2000);
	return new VerifyPageCreateIndividual();
	}

}
