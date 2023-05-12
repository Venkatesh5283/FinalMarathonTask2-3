package runnerMarathon;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.testng.CucumberOptions;
import pages.LoginPage;

@CucumberOptions(features="src/test/java/feature/CreateIndividual.feature",glue="pagesMarathon",monochrome=true,publish=true)
public class TC_001Create extends BaseClassMarathon{

	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
		
	}
	
	
	@BeforeTest
	public void setData()
	{
		testcase="CreateIndividual";
		testCaseDescription="Postive Data";
		testcaseCategory="Salesforce";
		testcaseAuthor="Venkatesh";
	}
	

}
