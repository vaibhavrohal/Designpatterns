package Adapter;

public class ICICIBankadapterapi implements BankApi{
    ICICIBank iciciBank=new ICICIBank();
    @Override
    public void transfermoney(String accountfrom, String accountto, Double amount) {
        iciciBank.sendmoney(accountfrom,accountto,amount);
    }

    @Override
    public double check(String account) {
        return iciciBank.getbalance(account);
    }
}
