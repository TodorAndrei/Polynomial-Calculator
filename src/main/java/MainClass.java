public class MainClass {
    public static void main(String[] args) {
        ViewClass view = new ViewClass();
        ModelClass model = new ModelClass();
        ControllerClass controller = new ControllerClass(view, model);
    }
}
