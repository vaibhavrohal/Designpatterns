package Factory.Factory2;

import Factory.Factory2.Components.Button;
import Factory.Factory2.Components.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();

        Uifactory uifactory=flutter.createuifactory(Platform.Ios);
        Button button=uifactory.createbutton();
        button.createbutton();

        Uifactory uifactory1=flutter.createuifactory(Platform.Android);
        Menu menu=uifactory1.createmenu();
        menu.createmenu();
    }
}
