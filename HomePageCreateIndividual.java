package pagesMarathon;

import org.openqa.selenium.By;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.java.en.And;
import pagesAssignment.AppLauncherPage;
import pagesAssignment.HomePageAssignment;

public class HomePageCreateIndividual extends BaseClassMarathon {
	
	@And ("Click on toggle menu button from the left corner")

	public HomePageCreateIndividual clickToggleButton()
	{
	getDriver().findElement(By.className("slds-icon-waffle")).click();
		return this;
	}
	
@And ("Click view All")
	public AppLauncherPageCreateIndividual clickViewAll()
	{
	getDriver().findElement(By.xpath("//button[text()='View All']")).click();
		return new AppLauncherPageCreateIndividual();
	}

}
