package Singleton.ByLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A {
    private static A instance ;
    static Lock lock=new ReentrantLock();
    private A(){}

    public static A getinstance(){
        if (instance==null) {
            lock.lock();
            if (instance == null)
                instance = new A();
            lock.unlock();
        }
        return instance;
    }
}
