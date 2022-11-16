package practices;
import java.util.Objects;
import java.util.Scanner;
public class TipCalculator {
    private String productName;
    private double price;
    private int quantity;

    int value1 = Integer.parseInt("Yam");
    String value2 = "Rice";
    String value3 = "Noodles";
    public TipCalculator(String rice) {
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tWelcome to Goodness store!\n\t\twe are glad to have you here today.\uD83C\uDF5D \uD83D\uDE0A");
        System.out.println();
//        System.out.println("Here is a list of our products and price: ");
//        System.out.println();
//        System.out.println("\tA tuber of yam is #1000\n\tA paint of rice is #2000\n\tA carton of noodles is #3000");
//        System.out.println();
        System.out.println("What would you like to buy please\uD83D\uDE0A?: ");
//        String userInput = input.nextLine();
        System.out.println("Press 1 for yam\uD83E\uDD54\uD83E\uDD54\uD83E\uDD54 ");
        System.out.println("Press 2 for rice ");
        System.out.println("Press 3 for noodles\uD83C\uDF5D\uD83C\uDF5D");
        String userInput = input.nextLine();
        switch (userInput) {
            case "1" -> {
                System.out.println("How many tuber?: ");
                int value1 = Integer.parseInt(input.nextLine());
                if (value1 >=1) {
                    System.out.println("life's good");
                }
                break;
            }
            case "2" -> {
                System.out.println("How many paints?: ");
                String value2 = input.nextLine();
                break;
            }
            case "3" -> {
                System.out.println("how many carton?: ");
                String value3 = input.nextLine();
                break;
            }
        }
    }
        }


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("List of products are: ");
//        System.out.println("rice");
//        System.out.println("yam");
//        System.out.println("what would you like to buy?: ");
//        String userInput = input.next();
//        if (userInput == yam);

//        if (Objects.equals(userInput, yam)) {
//            System.out.println("goat");
//        String yes = userInput;
//        Object yes = null;
//        if (Objects.equals(yes, userInput)) {
//            System.out.println("yam");
//            System.out.println("rice");
//            System.out.println("beans");
//




//        }

