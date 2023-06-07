package practices;

import java.util.Scanner;

public class ArrayMode {
    static int mode(int a[]) {
    int maxValue = 0, maxCount = 0, i, j;

    for (i = 0; i < a.length; ++i) {
        int count = 0;
        for (j = 0; j < a.length; ++j) {
            if (a[j] == a[i])
                ++count;
        }

        if (count > maxCount) {
            maxCount = count;
            maxValue = a[i];
        }
    }
    return maxValue;
}
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many number do you want to enter? ");
        int userInput = scanner.nextInt();
        int[] arrNumber = new int[userInput];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Enter numbers... " + (i + 1));
            arrNumber[i] = scanner.nextInt();
        }
        System.out.println("Mode ::"+mode(arrNumber));
    }
}
