package Singleton.BySynchronizedkeyWord;

public class Client {
    public static void main (String [] args){
        A a1=A.getinstance();
        A a2=A.getinstance();

        System.out.println("check");

    }
}
