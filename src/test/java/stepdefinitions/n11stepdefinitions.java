package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.N11;
import utilities.ConfigReader;
import utilities.Driver;

public class n11stepdefinitions {
    N11 n11 = new N11();

    @Given("Goes to page n11")
    public void goes_to_page_n11() {
        Driver.getDriver().get(ConfigReader.getProperty("n11Url"));
    }
    @Then("Types {string} into the search engine and searches")
    public void types_into_the_search_engine_and_searches(String products) {
        n11.n11Search.sendKeys(products+Keys.ENTER);
    }
    @Then("Verifies that search results contain {string}")
    public void verifies_that_search_results_contain(String products) {
        String expected = products;
        String actual = n11.searchResults.getText();
        Assert.assertTrue(actual.contains(expected));
    }




}
