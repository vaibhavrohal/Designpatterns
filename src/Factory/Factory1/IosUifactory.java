package Factory.Factory1;

import Factory.Factory1.Components.Button;
import Factory.Factory1.Components.IosButton;
import Factory.Factory1.Components.IosMenu;
import Factory.Factory1.Components.Menu;

public class IosUifactory implements Uifactory {
    @Override
    public Button createbutton() {
        return new IosButton();
    }

    @Override
    public Menu createmenu() {
        return new IosMenu();
    }
}
