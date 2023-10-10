package Adapter;

public class Phonepe {
    //BankApi bankapi=new YesBankadapterapi();
    //by changing the 3rd party bank yesbank to Icicibank
      BankApi bankapi=new ICICIBankadapterapi();
    void transfermoney(String accountfrom,String accountto,double amount){
        bankapi.transfermoney(accountfrom,accountto,amount);
    }
    double check(String account){
        return bankapi.check(account);
    }
}
