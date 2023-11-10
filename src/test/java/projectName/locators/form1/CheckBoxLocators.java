package projectName.locators.form1;

import projectName.Form1;

import javax.swing.*;
import java.util.HashMap;

public class CheckBoxLocators {

    public enum LocatorName {
        TRMS_CDTIONS_ACCPT
    }

    private Form1 form;

    private HashMap<LocatorName, JCheckBox> map = new HashMap<>();

    public CheckBoxLocators(Form1 form) {
        this.form = form;
        if (form.getF().isDisplayable()) {
            map.put(LocatorName.TRMS_CDTIONS_ACCPT, this.form.getF().getTerm());
        }
    }

    public HashMap<LocatorName, JCheckBox> getMap() {
        return map;
    }

}
