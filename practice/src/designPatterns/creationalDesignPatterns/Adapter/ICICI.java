package practice.src.designPatterns.creationalDesignPatterns.Adapter;

public class ICICI {
    public double getBal(String accountNumber) {
        return 15.0;
    }

    public void deposit(String to, String from, double amount) {
        System.out.println("Amount" + amount +" Deposit to " + to+ "from " + from);
    }
}
