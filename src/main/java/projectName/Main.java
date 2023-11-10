package projectName;

public class Main {
    public static void main(String[] args) {
        try {
            Form1 form1 = new Form1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
