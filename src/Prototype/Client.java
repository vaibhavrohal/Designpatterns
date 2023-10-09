package Prototype;

public class Client {
    public static void register (Registry reg ){
        Student s1=new Student ();
              s1.setBatch("Aug22");
        reg.setobject("Aug22",s1);
    }
    public static void main (String []args){
       Registry registry=new Registry ();
       register(registry);

        Student s2 = registry.getobject("Aug22").clone();
        Student s3=registry.getobject("Aug22").clone();
       //s2.Clone();
       // s3.clone();
      //if we do not use .clone() method, we directly use the registry. object s2 and s3 have same address.
        //i.e. new object is not crated but new reference to same object is created.

        System.out.println("debug");

    }
}
