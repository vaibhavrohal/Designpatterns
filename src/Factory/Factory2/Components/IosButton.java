package Factory.Factory2.Components;

public class IosButton implements Button{
    @Override
    public void createbutton() {
        System.out.println("ios Button created");
    }
}
