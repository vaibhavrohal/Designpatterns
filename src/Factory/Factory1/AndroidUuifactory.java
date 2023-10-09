package Factory.Factory1;

import Factory.Factory1.Components.AndroidButton;
import Factory.Factory1.Components.AndroidMenu;
import Factory.Factory1.Components.Button;
import Factory.Factory1.Components.Menu;

public class AndroidUuifactory implements Uifactory {

    @Override
    public Button createbutton(){
        return new AndroidButton();
    }

    public Menu createmenu(){
        return new AndroidMenu();
    }
}
