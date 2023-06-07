package tdd;

public class Car {
    private String model;
    private String year;
    private double price;

 public Car(String model, String year, double price){
     this.model=model;
     this.price=price;
     this.year=year;
 }

    public String getModel() {
        return model;
    }

    public String getYear() {
     return year;
    }

    public double getPrice() {
     return price;
    }

    public void setPrice(double price) {
     if (price > 0) this.price = price;
    }

    public void applyDiscount(double discountRate) {
     double discount = (discountRate/100) * price;
     price = price - discount;
    }
}
