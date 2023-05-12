package runnerMarathon;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import baseclassMarathon.BaseClassMarathon;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/feature/DeleteIndividual.feature",glue="pagesMarathon",monochrome=true,publish=true)
public class TC_003Delete extends BaseClassMarathon {
	
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	@BeforeTest
	public void setData()
	{
		testcase="DeleteIndividual";
		testCaseDescription="Postive Data";
		testcaseCategory="Salesforce";
		testcaseAuthor="Venkatesh";
	}

}
