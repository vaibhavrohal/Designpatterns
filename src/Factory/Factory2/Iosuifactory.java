package Factory.Factory2;

import Factory.Factory2.Components.Button;
import Factory.Factory2.Components.IosButton;
import Factory.Factory2.Components.IosMenu;
import Factory.Factory2.Components.Menu;

public class Iosuifactory implements Uifactory{
    @Override
    public Button createbutton() {
        return new IosButton();
    }

    @Override
    public Menu createmenu() {
        return new IosMenu();
    }
}
