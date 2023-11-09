package projectName.locators;

import projectName.OpenForm;

import javax.swing.*;
import java.util.HashMap;

public class LabelLocators {

    public enum LocatorName {
        RES
    }

    private OpenForm form;

    private HashMap<LocatorName, JLabel> map = new HashMap<>();

    public LabelLocators(OpenForm form) {
        this.form = form;
        if (form.getF().isDisplayable()) {
            map.put(LocatorName.RES, this.form.getF().getRes());
        }
    }

    public HashMap<LocatorName, JLabel> getMap() {
        return map;
    }

}
