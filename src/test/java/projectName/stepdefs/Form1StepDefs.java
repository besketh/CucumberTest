package projectName.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.testng.AssertJUnit;
import projectName.Form1;
import projectName.locators.form1.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

import static java.lang.System.out;


public class Form1StepDefs {
    private Form1 form;


    private Locators locators;

    @Before
    public void setUp() {
        try {
            form = new Form1();
            locators = new Locators(form);

            out.println("new form created");
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @AfterStep
    public void sleep() throws InterruptedException {
        //purely for the human eye to see the tests occuring
        Thread.sleep(2000);
    }

    @Given("I open the Swing form")
    public void iOpenTheSwingForm() {
        AssertJUnit.assertTrue(form.getF().isDisplayable());
    }

    @Then("the swing form still displays")
    public void theSwingFormStillDisplays() {
        AssertJUnit.assertTrue(form.getF().isDisplayable());
    }

    @When("I input my name: {string}")
    public void iInputMyName(String arg0) {
        locators.getTextFieldLocators().getMap().get(TextFieldLocators.LocatorName.NAME).setText(arg0);
    }

    @Then("my name displays: {string}")
    public void myNameDisplays(String arg0) {
        AssertJUnit.assertEquals(arg0, form.getF().getTname().getText());
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

        locators.getTextFieldLocators().getMap().get(TextFieldLocators.LocatorName.NAME).setText(keyValueMap.get("Name"));
        locators.getTextAreaLocators().getMap().get(TextAreaLocators.LocatorName.ADDRESS).setText(keyValueMap.get("Address"));
    }

    @When("I click submit")
    public void iClickSubmit() {
        locators.getButtonLocators().getMap().get(ButtonLocators.LocatorName.SUBMIT).doClick();
    }

    @Then("The message {string} is displayed")
    public void theMessageIsDisplayed(String arg0) {
        String text = locators.getLabelLocators().getMap().get(LabelLocators.LocatorName.RES).getText();
        AssertJUnit.assertEquals(arg0,text);
    }

    @After
    public void tearDown() {
        form.getF().dispose();
        AssertJUnit.assertFalse(form.getF().isDisplayable());
    }

    @And("I accept the T+Cs")
    public void iAcceptTheTCs() {
        JCheckBox checkbox = locators.getCheckBoxLocators().getMap().get(CheckBoxLocators.LocatorName.TRMS_CDTIONS_ACCPT);
        checkbox.doClick();
    }

    @Then("then details are saved")
    public void thenDetailsAreSaved() {
        String outputText = locators.getTextAreaLocators().getMap().get(TextAreaLocators.LocatorName.OUTPUT).getText();
        AssertJUnit.assertFalse(outputText.isEmpty());
    }
}
