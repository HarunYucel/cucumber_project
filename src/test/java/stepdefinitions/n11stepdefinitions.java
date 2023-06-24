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

    @Given("n11 sayfasına gider")
    public void n11_sayfasına_gider() {
       Driver.getDriver().get(ConfigReader.getProperty("n11Url"));
           }

    @Given("arama sonuclarının {string} icerdiğini dogrular")
    public void arama_sonuclarının_icerdiğini_dogrular(String dyson) {

        String expected = dyson;
        String actual = n11.searchResults.getText();
       Assert.assertEquals(expected,actual);
    }


    @Then("aramaMotoruna {string} yazar ve aratir")
    public void aramamotorunaYazarVeAratir(String dyson) {
        n11.n11Search.sendKeys(dyson+Keys.ENTER);
    }
}
