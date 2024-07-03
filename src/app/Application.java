package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 * Los usuarios de la fábrica no se preocupan por cuál fábrica concreta usan,
 * ya que trabajan con fábricas y productos a través de interfaces abstractas.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}






