package breakSnacks;

import java.text.SimpleDateFormat;
import java.util.*;
public class EcommerceMain {

    public static void main(String[] args) {
        final int PERCENT = 100;
        final double VAT_GIVEN = 17.50;
        String name = null;
        String customerName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double billTotal = 0.0;
        double subTotal = 0.0;
        double discount = 0.0;
        double discountGiven= 0.0;
        String cashierName= null;
        String userInput = null;
       Scanner scanner = new Scanner(System.in);

        List<EcommerceItems> product = new ArrayList<EcommerceItems>();
        System.out.println("What is the customer's name? ");
        customerName = scanner.nextLine();

        do {
            System.out.println("What did the user buy? ");
            name = scanner.nextLine();
            System.out.println("How many pieces? ");
            quantity = scanner.nextInt();
            System.out.println("How much per unit? ");
            price = scanner.nextInt();
            totalPrice = price * quantity;
            billTotal = billTotal + totalPrice;
            product.add(new EcommerceItems(name, quantity, price, totalPrice));
            System.out.println("Add more items? (yes or no): ");
            userInput = scanner.next();

        }
        while (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("Yes"));
        System.out.println("What is your name? ");
        cashierName = scanner.next();
        System.out.println("How much discount will he get? ");
        discountGiven = scanner.nextDouble();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        Calendar calender = Calendar.getInstance();
        String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        heading(customerName, cashierName, product, formatter, date, calender, days);
        System.out.format("--------------------------------------------------------------------");
        subTotal = billTotal-discount;
        System.out.printf("\n\t\t\t\t\t\t\t\tSub Total: \t %.02f", subTotal);
        discount = (discountGiven/PERCENT) * subTotal;
        System.out.printf("\n\t\t\t\t\t\t\t\tDiscount: \t %.02f", discount);
        double VAT = (VAT_GIVEN/PERCENT) * subTotal;
        System.out.printf("\n\t\t\t\t\t\t\t\tVAT @ %.02f%s: %.02f", VAT_GIVEN,"%", VAT);
        System.out.format("\n====================================================================");
        billTotal = subTotal - discount + VAT;
        System.out.printf("\n\t\t\t\t\t\t\t\tBill Total: %.02f ", billTotal);
        System.out.format("\n====================================================================");
        System.out.printf("\nTHIS IS NOT A RECEIPT, KINDLY PAY %.02f", billTotal);
        System.out.println();
        System.out.println("How much did the customer give to you? ");
        double amountPaid = scanner.nextDouble();
        heading(customerName, cashierName, product, formatter, date, calender, days);
        System.out.format("--------------------------------------------------------------------\n");
        System.out.printf("\n\t\t\t\t\t\t\t\tSub Total: \t%.02f", subTotal);
        System.out.printf("\n\t\t\t\t\t\t\t\tDiscount: \t %.02f", discount);
        System.out.printf("\n\t\t\t\t\t\t\t\tVAT @ %.02f%s: %.02f\n", VAT_GIVEN,"%", VAT);
        System.out.format("====================================================================");
        System.out.printf("\n\t\t\t\t\t\t\t\tBill Total: %.02f", billTotal);
        System.out.printf("\n\t\t\t\t\t\t\t\tAmount Paid: %.02f\n", amountPaid);
        double balance = amountPaid - billTotal;
        if (amountPaid < billTotal){
            System.out.println("\t\t\t\t\t\t\tOga your money no complete ");
            System.exit(0);
        }else System.out.printf("\t\t\t\t\t\t\t\tBalance: %.2f\n", balance);
        System.out.format("====================================================================");
        System.out.println("\n\tTHANK YOU FOR YOUR PATRONAGE, WE HOPE TO SEE YOU AGAIN!");
        System.out.format("====================================================================");
        scanner.close();
    }
    private static void heading(String customerName, String cashierName, List<EcommerceItems> product, SimpleDateFormat formatter, Date date, Calendar calender, String[] days) {
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 08133028335 ");
        dateFormat(customerName, cashierName, product, formatter, date, calender, days);
    }
    private static void dateFormat(String customerName, String cashierName, List<EcommerceItems> product, SimpleDateFormat formatter, Date date, Calendar calender, String[] days) {
        System.out.println("Date: "+formatter.format(date)+" "+days[calender.get(Calendar.DAY_OF_WEEK)-1]);
        System.out.println("Cashier: " +cashierName);
        System.out.println("Customer's Name: " +customerName);
        EcommerceMain.displayLine();
        for (EcommerceItems p:product) {
            p.display();
        }
    }public static void displayLine(){
        System.out.format("====================================================================");
        System.out.println("\n\t\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
        System.out.format("--------------------------------------------------------------------\n");
    }

}
