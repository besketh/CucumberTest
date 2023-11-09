package projectName.locators;

import projectName.OpenForm;

import javax.swing.*;
import java.util.HashMap;

public class ButtonLocators {

    public enum LocatorName {
        SUBMIT
    }

    private OpenForm form;

    private HashMap<LocatorName, JButton> map = new HashMap<>();

    public ButtonLocators(OpenForm form) {
        this.form = form;
        if (form.getF().isDisplayable()) {
            map.put(LocatorName.SUBMIT, this.form.getF().getSub());
        }
    }

    public HashMap<LocatorName, JButton> getMap() {
        return map;
    }

}
