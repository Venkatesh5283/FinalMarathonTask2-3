package pagesMarathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.java.en.And;
import pagesAssignment.SalesPage;

public class AppLauncherPageCreateIndividual extends BaseClassMarathon{
	
	@And ("click Individual from App Launcher")
	public IndividualPageCreateIndividual clickIndividualc() throws InterruptedException
	{
		WebElement scroll = getDriver().findElement(By.xpath("//p[text()='Party Consent']"));
		getDriver().executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = getDriver().findElement(By.xpath("//p[text()='Individuals']"));
		getDriver().executeScript("arguments[0].click();", individual);
		Thread.sleep(3000);
		
		return new IndividualPageCreateIndividual();
	}

}
