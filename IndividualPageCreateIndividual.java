package pagesMarathon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.java.en.And;

public class IndividualPageCreateIndividual extends BaseClassMarathon{
	
	@And ("Click on the Dropdown icon in the Individuals tab")
	public IndividualPageCreateIndividual clickDropDown()
	{
	getDriver().findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
	return this;
	}
	
	@And ("Click on New Individual")
	public NewIndividualPageCreateIndividual clickNewIndividual()
	{
	WebElement clk = getDriver().findElement(By.xpath("//span[text()='New Individual']"));
	getDriver().executeScript("arguments[0].click();", clk);
	return new NewIndividualPageCreateIndividual();
	}
	
	
	@And ("Click on the Individuals tab")
	public IndividualPageCreateIndividual clickIndividuald() throws InterruptedException
	{
	Thread.sleep(3000);
	WebElement clk = getDriver().findElement(By.xpath("//a[@title='Individuals']//span[1]"));
	getDriver().executeScript("arguments[0].click();", clk);
	Thread.sleep(2000);
	return this;
	}
	
	
	@And ("Search the Individuals {string}")
	public IndividualPageCreateIndividual searchNamed(String delname) throws InterruptedException
	{
		
	
	WebElement name = getDriver().findElement(By.xpath("//input[@name='Individual-search-input']"));
	name.sendKeys(delname);
	name.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	return this;
	}
	
	
	@And ("Click on the Dropdown icon")
	public IndividualPageCreateIndividual clickRoleButtd()
	{
	WebElement pop = getDriver().findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
	getDriver().executeScript("arguments[0].click();", pop);////div[@class='uiPopupTrigger']
	return this;
	//Thread.sleep(2000);
	
	}
	@And ("Select Delete")
	public DeletePageDeleteIndividual clickDelete() throws InterruptedException
	{
	WebElement delete = getDriver().findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
	getDriver().executeScript("arguments[0].click();", delete);
	Thread.sleep(3000);
	return new DeletePageDeleteIndividual();
	}
	
	@And ("Select Edit")
	public EditPageEditIndividual clickEdite()
	{
	WebElement edit = getDriver().findElement(By.xpath("//a[@title='Edit']/div"));
	getDriver().executeScript("arguments[0].click();", edit);
	return new EditPageEditIndividual();
	}

}
