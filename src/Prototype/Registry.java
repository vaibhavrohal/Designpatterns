package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

   private Map<String,Student> registry =new HashMap<>();

    public Student getobject(String s){
        return registry.get(s);
    }
    public void setobject (String s,Student o){
        registry.put(s,o);
    }
}
