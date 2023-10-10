package Adapter;

public class Client {
    public static void main(String[] args) {
        Phonepe phonepe=new Phonepe();
        String s1 ="vaibhav";
        String s2="Ayansh";
        double d=10;

        phonepe.transfermoney(s1,s2,10);
        System.out.println( phonepe.check(s1));
    }
}
