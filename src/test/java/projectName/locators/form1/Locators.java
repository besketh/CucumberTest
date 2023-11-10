package projectName.locators.form1;

import projectName.Form1;

public class Locators {
    private TextFieldLocators textFieldLocators;
    private TextAreaLocators textAreaLocators;
    private ButtonLocators buttonLocators;
    private LabelLocators labelLocators;
    private CheckBoxLocators checkBoxLocators;


    public Locators(Form1 form) {
        textFieldLocators = new TextFieldLocators(form);
        textAreaLocators = new TextAreaLocators(form);
        buttonLocators = new ButtonLocators(form);
        labelLocators = new LabelLocators(form);
        checkBoxLocators = new CheckBoxLocators(form);
    }

    public TextFieldLocators getTextFieldLocators() {
        return textFieldLocators;
    }

    public TextAreaLocators getTextAreaLocators() {
        return textAreaLocators;
    }

    public ButtonLocators getButtonLocators() {
        return buttonLocators;
    }

    public LabelLocators getLabelLocators() {
        return labelLocators;
    }

    public CheckBoxLocators getCheckBoxLocators() {
        return checkBoxLocators;
    }
}
