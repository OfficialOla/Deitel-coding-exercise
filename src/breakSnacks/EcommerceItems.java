package breakSnacks;

public class EcommerceItems {
    private String name;
    private int quantity;
    private double price;
    private double totalPrice;

    public EcommerceItems(String name, int quantity, double amount, double totalPrice) {
        this.name = name;
        this.quantity = quantity;
        this.price = amount;
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void display() {
        System.out.printf(" %9s    %7d     %9.2f      %12.2f\n", name, quantity, price, totalPrice);
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }



    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    }
