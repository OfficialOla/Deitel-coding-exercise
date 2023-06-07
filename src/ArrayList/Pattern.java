package ArrayList;

public class Pattern {
    public static void main(String[] args) {
//        int number = 4;
        pattern2(4);
    }

    public static void pattern1(int number){
        for (int i = 0; i <=number ; i++ ) {
            for (int j = 1; j <=number + 1- i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int number){
        for (int i = 0; i <=number ; i++ ) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int number){
        for (int i = 0; i <=number ; i++ ) {
            for (int j = 1; j <=number ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
