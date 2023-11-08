package projectName.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.testng.AssertJUnit;
import projectName.OpenForm;
import projectName.locators.TextAreaLocators;
import projectName.locators.TextFieldLocators;


import java.util.HashMap;
import java.util.List;

import static java.lang.System.out;


public class MyStepdefsForSwing {
    private OpenForm form;
    private TextFieldLocators textFieldLocators;
    private TextAreaLocators textAreaLocators;


    @Before
    public void setUp() {
        try {
            form = new OpenForm();
            textFieldLocators = new TextFieldLocators(form);
            textAreaLocators = new TextAreaLocators(form);
            out.println("new form created");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Given("I open the Swing form")
    public void iOpenTheSwingForm() {
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
        textFieldLocators.getMap().get(TextFieldLocators.LocatorName.NAME).setText(arg0);
    }

    @Then("my name displays: {string}")
    public void myNameDisplays(String arg0) {
        AssertJUnit.assertEquals(arg0, form.getF().getTname().getText());
    }

    @After
    public void tearDown() {
        form.getF().dispose();
        AssertJUnit.assertFalse(form.getF().isDisplayable());
    }

    @And("I input the following form details")
    public void iInputTheFollowing(DataTable dataTable) {
        HashMap<String, String> keyValueMap = new HashMap<>();
        List<List<String>> rows = dataTable.asLists(String.class);
        List<String> varNames = rows.get(0);
        varNames.forEach(varName -> {
            int index = varNames.indexOf(varName);
            keyValueMap.put(varName, rows.get(1).get(index));
        });

        textFieldLocators.getMap().get(TextFieldLocators.LocatorName.NAME).setText(keyValueMap.get("Name"));
        textAreaLocators.getMap().get(TextAreaLocators.LocatorName.ADDRESS).setText(keyValueMap.get("Address"));

    }


}
