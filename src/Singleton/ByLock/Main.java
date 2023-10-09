package Singleton.ByLock;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        A a=A.getinstance();
        A a1=A.getinstance();



        System.out.println("check");

    }
}