package projectName;

public class OpenForm {
    private FormSwingGUI f;
    public OpenForm() throws Exception {
        this.f = new FormSwingGUI();
    }

    public FormSwingGUI getF() {
        return f;
    }

    public void setF(FormSwingGUI f) {
        this.f = f;
    }
}
