package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ReDirectionSteps extends CommonFunctions {

    @Given("I'm on Home Page {string}")
    public void i_m_on_home_page(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@data-test=\"allow-all\"]")).click();
    }
    @When("I click on our shops link")
    public void i_click_on_our_shops_link() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div/div/div[1]/div/ul/li[2]/a")).click();
    }
    @Then("I should get re-directed appropriately with heading as {string}")
    public void i_should_get_re_directed_appropriately_with_heading_as(String expectedHeading) {
        String actualHeading = driver.findElement(By.xpath("/html/body/main/div[1]/div/h1")).getText();

        Assert.assertEquals(expectedHeading, actualHeading);
    }

}
