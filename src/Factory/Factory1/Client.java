package Factory.Factory1;

import Factory.Factory1.Components.Button;

public class Client {
    public static void main(String []args){
        Flutter flutter=new Flutter ();
           Uifactory uifactory=flutter.createfactory("Ios");

        Button button=uifactory.createbutton();

        button.createbutton();
    }
}
