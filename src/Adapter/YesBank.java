package Adapter;

public class YesBank {
    public void credit(String from,String to,Double amount){
        System.out.println(from +" account ,to account "+to+" an ammount through Yes Bank, Rs."+amount);
    }
    public double show(String account){
        return 100;
    }
}
