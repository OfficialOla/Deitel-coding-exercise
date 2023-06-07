package chapterFour;

public class HekkaParcels {
    private int quantity;
    private int amountPerParcel;
    private int bonus;
    private  int TPD;

    public HekkaParcels(){
//        this.collectionRate = collectionRate;
//        this.amountPerParcel = amountPerParcel;
    }

    public int totalParcelDelivered1(int quantity, int amountPerParcel) {
        if (quantity >= 50 && quantity <= 59) return bonus = quantity * 200;
        return quantity;
    }

    public int totalParcelDelivered2(int quantity, int amountPerParcel) {
        if (quantity >= 60 && quantity <= 69) return bonus = quantity * 250;
        return quantity;
    }

    public int totalParcelDelivered3(int quantity, int amountPerParcel) {
        if (quantity >= 70) return bonus = quantity * 500;
        return quantity;
    }


//    public void
}
