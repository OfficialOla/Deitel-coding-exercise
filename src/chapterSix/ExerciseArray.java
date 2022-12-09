package chapterSix;

public class ExerciseArray {
        public static int numberIsPrime(int number) {
            int count;
            int counter = 0;
            for (count = 1; count <= number; count++) {
                if (number % count == 0) counter++;
            }
            if (counter == 2) {
                System.out.println(number + " is a prime number " );
                return number;
            }return 0;
        }
        public static void primeLessThan10_000(int number) {
            int count;
            int counter = 0;
            for (count = 1; count <= number; count++) {
                numberIsPrime(count);

            }

        }
        public static void main(String[] args) {
                    numberIsPrime(1);
            primeLessThan10_000(10000);
        }

    }

