package projectName.locators.form1;

import projectName.Form1;

import javax.swing.*;
import java.util.HashMap;

public class ButtonLocators {

    public enum LocatorName {
        SUBMIT
    }

    private Form1 form;

    private HashMap<LocatorName, JButton> map = new HashMap<>();

    public ButtonLocators(Form1 form) {
        this.form = form;
        if (form.getF().isDisplayable()) {
            map.put(LocatorName.SUBMIT, this.form.getF().getSub());
        }
    }

    public HashMap<LocatorName, JButton> getMap() {
        return map;
    }

}
