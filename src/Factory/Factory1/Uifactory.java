package Factory.Factory1;

import Factory.Factory1.Components.Button;
import Factory.Factory1.Components.Menu;

public interface Uifactory {
    public Button createbutton();

    public Menu createmenu();
}
