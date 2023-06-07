package ProblemSolving;

public class firstUnique {
    public static void main(String[] args) {
        System.out.println(findFirstUnique(new int[]{8,8,9, 2, 3, 2, 6, 6}));
    }

    public static int findFirstUnique(int[] arr) {
        // Initialize an array to keep track of the count of each integer
        int[] counts = new int[100000];

        // Iterate through the array to count the occurrences of each integer
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }

        // Iterate through the array again to find the first unique integer
        for (int i = 0; i < arr.length; i++) {
            if (counts[arr[i]] == 1) {
                return arr[i];
            }
        }

        // If no unique integer is found, return -1
//        return -1;
        return 0;
    }

}
