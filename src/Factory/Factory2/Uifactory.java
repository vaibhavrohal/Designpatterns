package Factory.Factory2;

import Factory.Factory2.Components.Button;
import Factory.Factory2.Components.Menu;

public interface Uifactory {
    public Button createbutton();
    public Menu createmenu();
}
