package projectName.locators.form1;

import projectName.Form1;

import javax.swing.*;
import java.util.HashMap;

public class TextFieldLocators {

    public enum LocatorName {
        NAME
    }

    private Form1 form;

    private HashMap<LocatorName, JTextField> map = new HashMap<>();

    public TextFieldLocators(Form1 form) {

        this.form = form;
        if (form.getF().isDisplayable()) {
            map.put(LocatorName.NAME, this.form.getF().getTname());
        }
    }

    public HashMap<LocatorName, JTextField> getMap() {
        return map;
    }

}
