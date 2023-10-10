package Adapter;

public interface BankApi {
    void transfermoney(String accountfrom,String accountto,Double amount);
    double check(String account);
}
