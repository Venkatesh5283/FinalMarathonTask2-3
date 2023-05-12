package pagesMarathon;

import org.openqa.selenium.By;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.java.en.And;

public class NewIndividualPageCreateIndividual extends BaseClassMarathon {
	
	@And ("Enter the Last Name as {string}")
	public NewIndividualPageCreateIndividual enterName(String name1)
	{
	getDriver().findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(name1);
	return this;
	}
	@And ("Click save")
	public VerifyPageCreateIndividual clickSave()
	{
	getDriver().findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	return new VerifyPageCreateIndividual();
	}

}
