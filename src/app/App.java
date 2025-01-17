package app;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class App {
    public static void main(String[] args) throws Exception {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
}





