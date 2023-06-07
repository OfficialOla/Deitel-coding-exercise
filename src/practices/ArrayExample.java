package practices;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[][] arr = {{"James, Spencer, Lucky"}, {"Michael, Felix, John"}, {"Imma, Sam, Chibuzor"}};

//       int[][] arr = new int[3][];
//       arr[0]= new int[4];
//       arr[1] = new int[3];
//       arr[2] = new int[2];
//       int count = 0;
//        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++)
//            for (int j = 0; j <arr[i].length ; j++)
//        System.out.println("Contents of Jagged array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
