package pagesMarathon;

import org.openqa.selenium.By;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.java.en.And;

public class DeletePageDeleteIndividual extends BaseClassMarathon {
	@And ("Click Delete")
	public VerifyPageCreateIndividual clickDeleteOpt()
	{
	
	getDriver().findElement(By.xpath("//span[text()='Delete']")).click();
	
	return new VerifyPageCreateIndividual();
	}

}
