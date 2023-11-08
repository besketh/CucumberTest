package projectName;

public class Main {
    public static void main(String[] args) {
        try {
            OpenForm openForm = new OpenForm();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
