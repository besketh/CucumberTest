package projectName.locators.form1;

import projectName.Form1;

import javax.swing.*;
import java.util.HashMap;

public class LabelLocators {

    public enum LocatorName {
        RES
    }

    private Form1 form;

    private HashMap<LocatorName, JLabel> map = new HashMap<>();

    public LabelLocators(Form1 form) {
        this.form = form;
        if (form.getF().isDisplayable()) {
            map.put(LocatorName.RES, this.form.getF().getRes());
        }
    }

    public HashMap<LocatorName, JLabel> getMap() {
        return map;
    }

}
