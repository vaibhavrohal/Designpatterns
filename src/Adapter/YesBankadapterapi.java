package Adapter;

public class YesBankadapterapi implements BankApi{
    YesBank yesbank=new YesBank();
    @Override
    public void transfermoney(String accountfrom, String accountto, Double amount) {
        yesbank.credit(accountfrom,accountto,amount);
    }

    @Override
    public double check(String account) {
        return yesbank.show(account);
    }
}
