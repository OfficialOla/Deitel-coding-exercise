package ArrayList;

public class PatternPrac {

    public static void main(String[] args) {
        pattern7(5);

    }

    public static void pattern1(int number){
        for (int row = 0; row <number ; row++) {
            for (int col = 0; col <number ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void pattern2(int number){
        for (int row = 0; row <number; row++) {
            for (int col = 0; col <row ; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void pattern3(int number){
        for (int row = 0; row <number ; row++) {
            for (int col = 0; col <number-row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int number){
        for (int row = 1; row <=number; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
   public static void pattern5(int number){
       for (int row = 0; row < number * 2 ; row++) {
           int totalCol = row > number ? 2 * number - row : row;
           for (int col = 0; col <totalCol ; col++) {
               System.out.print("*");
           }
           System.out.println();

       }
   }
  public static void pattern6(int number){
      for (int row = 0; row <number * 2 ; row++) {
          int totalCol = row > number ? 2 * number - row : row;
          int noOfSpace = number - totalCol;
          for (int s = 0; s <noOfSpace ; s++) {
              System.out.print(" ");
          }
          for (int col = 0; col < totalCol ; col++) {
              System.out.print("* ");
          }
          System.out.println();
          }
      }
      public static void pattern7(int number){
          for (int row = 1; row <=number ; row++) {
              int noOfSpace = number - row;
              for (int s = 0; s <noOfSpace ; s++) {
                  System.out.print("  ");
              }
              for (int col = row; col >= 1; col--) {
                  System.out.print(col + " ");
              }
              for (int col = 2; col <= row   ; col++) {
                  System.out.print(col + " ");
              }
              System.out.println();
          }
      }
  }

