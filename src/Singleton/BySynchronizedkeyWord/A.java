package Singleton.BySynchronizedkeyWord;

public class A {
    private static A instance;

    private A(){};

    public static A getinstance(){
        if (instance==null){
            synchronized (A.class){ //it is taking class level lock  because thread entering static method.
                                   // it can not take object level lock because in case of null object.synchronized
                                   // block through null pointer exception.
                if (instance==null) instance=new A();
            }
        }
        return instance;
    }
}
