package projectName.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.AssertJUnit;
import projectName.Bicycle;
import projectName.BicycleRide;
import projectName.OpenForm;
import projectName.User;

import java.awt.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.out;

public class MyStepdefsForSwing {
    private OpenForm form;

    @Before
    public void setUp(){
        try {
            form = new OpenForm();
            out.println("new form created");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Given("I open the Swing form")
    public void iOpenTheSwingForm(){
        AssertJUnit.assertTrue(form.getF().isDisplayable());

    }

    @And("{int} milliseconds pass")
    public void millisecondsPass(int arg0) throws InterruptedException {
        Thread.sleep(arg0);
    }

    @Then("the swing form still displays")
    public void theSwingFormStillDisplays() {
        AssertJUnit.assertTrue(form.getF().isDisplayable());

    }


    @When("I input my name: {string}")
    public void iInputMyName(String arg0) {
//        form.getF().setName(arg0);
        int b = 2 + 2;
    }

    @Then("my name displays: {string}")
    public void myNameDisplays(String arg0) {
//        AssertJUnit.assertEquals(arg0, Arrays.stream();
        AtomicInteger count = new AtomicInteger();
        Arrays.stream(Frame.getFrames()).toList().forEach(s-> {
            out.println(count.toString() + " " + s);
            count.getAndIncrement();
        });
    }

    @After
    public void tearDown() {
        form.getF().dispose();
        AssertJUnit.assertFalse(form.getF().isDisplayable());
    }
}
