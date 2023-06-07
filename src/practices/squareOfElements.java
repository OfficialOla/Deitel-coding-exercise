package practices;

public class squareOfElements {
    public static void main(String[] args) {
        int[] square = new int[100];
        for (int i = 0 ; i <= 99; i++) {
            square[i] = i * i;
        }
        for (int i = 0; i <= 99 ; i++) {
            System.out.println("The square of " +i +" is " +square[i]);
        }
        }
    }
