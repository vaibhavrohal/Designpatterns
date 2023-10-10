package Adapter;

public class ICICIBank {

    void sendmoney(String accountfrom,String accountto,double amount){
        System.out.println(accountfrom+" from account ,to account "+accountto+" an amount through ICICIBNAK  Rs."+amount);
    }
    double getbalance(String account){
        return 1000;
    }
}
