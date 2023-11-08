package projectName.locators;

import projectName.OpenForm;

import javax.swing.*;
import java.util.HashMap;

public class TextAreaLocators {

    public enum LocatorName {
        ADDRESS
    }

    private OpenForm form;

    public HashMap<LocatorName,JTextArea> map = new HashMap<>();

    public TextAreaLocators(OpenForm form) {
        this.form = form;
        map.put(LocatorName.ADDRESS, this.form.getF().getTadd());
    }

    public HashMap<LocatorName, JTextArea> getMap() {
        return map;
    }

}
