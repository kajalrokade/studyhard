package practice.src.designPatterns.creationalDesignPatterns.Adapter;

public class ICICIBankAdapter implements BankApi {
    ICICI icici = new ICICI();
    @Override
    public double getBalance(String accountNumber) {
        return icici.getBal(accountNumber);
    }

    @Override
    public void sendMoney(String to, String from, double amount) {
        icici.deposit(to,from,amount);
    }
}
