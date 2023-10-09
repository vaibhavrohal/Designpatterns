package Factory.Factory2;

public class Fluttersubclass {
    public static Uifactory createuifactory(Platform platform){
        if (platform.equals(Platform.Android)) return new Androiduifactory();
        else if (platform.equals(Platform.Ios)) return new Iosuifactory();
        else return null;
    }
}
