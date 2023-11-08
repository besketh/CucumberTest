package projectName.locators;

import projectName.OpenForm;

import javax.swing.*;
import java.util.HashMap;

public class TextFieldLocators {

    public enum LocatorName {
        NAME
    }

    private OpenForm form;

    private HashMap<LocatorName, JTextField> map = new HashMap<>();

    public TextFieldLocators(OpenForm form) {
        this.form = form;
        if (form.getF().isDisplayable()) {
            map.put(LocatorName.NAME, this.form.getF().getTname());
        }
    }

    public HashMap<LocatorName, JTextField> getMap() {
        return map;
    }

}
