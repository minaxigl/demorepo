package runnerTestng;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="Features\\functionality.feature",glue= {"steps"},tags="@ValidLogin")
public class Run1 extends AbstractTestNGCucumberTests{

}
