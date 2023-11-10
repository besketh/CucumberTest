package projectName.locators.form1;

import projectName.Form1;

import javax.swing.*;
import java.util.HashMap;

public class TextAreaLocators {

    public enum LocatorName {
        ADDRESS,
        OUTPUT
    }

    private Form1 form;

    public HashMap<LocatorName,JTextArea> map = new HashMap<>();

    public TextAreaLocators(Form1 form) {
        this.form = form;
        map.put(LocatorName.ADDRESS, this.form.getF().getTadd());
        map.put(LocatorName.OUTPUT, this.form.getF().getTout());
    }

    public HashMap<LocatorName, JTextArea> getMap() {
        return map;
    }

}
