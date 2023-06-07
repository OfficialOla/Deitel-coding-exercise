package practices;

public class DiamondAccount {
    private String name;
    private double balance;
    public DiamondAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public DiamondAccount() {
        DiamondAccount account1 = new DiamondAccount("Olayinka", 10_000);
        DiamondAccount account2 = new DiamondAccount("Folahan", 5000);
    }


    public void depositAmount(double balance){
        double withdrawalAmount = 5000;
    }
}
