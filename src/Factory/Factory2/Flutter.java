package Factory.Factory2;

public class Flutter {

    public Uifactory createuifactory(Platform platform){
       return Fluttersubclass.createuifactory(platform);
    }
}
