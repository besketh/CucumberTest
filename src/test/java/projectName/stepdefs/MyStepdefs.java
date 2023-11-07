package projectName.stepdefs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.AssertJUnit;
import projectName.*;

import java.awt.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import static java.lang.System.out;

public class MyStepdefs {
    private BicycleRide testBicycleRide;
    private User testUser;
    private Bicycle testBicycle;
    private final OpenForm form = new OpenForm();

    public MyStepdefs() throws Exception {
    }


    @And("^user finds bicycle$")
    public void userFindsBicycle() {
        testBicycle =  new Bicycle();
        AssertJUnit.assertNotNull("bicycle does not exist",testBicycle);
    }


    @When("^user rides bike$")
    public void userRidesBike() {
        testBicycleRide = new BicycleRide(testUser,testBicycle);
        AssertJUnit.assertNotNull("bicycle could not be ridden",testBicycleRide);


    }

    @Then("^user falls off bike$")
    public void userFallsOffBike() {
        AssertJUnit.assertFalse("user must not be upright",testUser.isUpright());
    }


    @And("^user is upright$")
    public void userIsUpright() {
        AssertJUnit.assertTrue(testUser.isUpright());

    }

    @Given("^I am a user with (\\d+) years experience riding bikes$")
    public void iAmAUserWithYearsExperienceRidingBikes(int arg0) {
        testUser = new User(arg0);
        AssertJUnit.assertNotNull("user does not exist",testUser);
    }

    @Then("user does not fall off the bike")
    public void userDoesNotFallOffTheBike() {
        AssertJUnit.assertTrue(testUser.isUpright());

    }


}
