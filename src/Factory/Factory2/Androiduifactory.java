package Factory.Factory2;

import Factory.Factory2.Components.AndroidButton;
import Factory.Factory2.Components.AndroidMenu;
import Factory.Factory2.Components.Button;
import Factory.Factory2.Components.Menu;

public class Androiduifactory implements Uifactory{

    @Override
    public Button createbutton() {
        return new AndroidButton();
    }

    @Override
    public Menu createmenu() {
        return new AndroidMenu();
    }
}
