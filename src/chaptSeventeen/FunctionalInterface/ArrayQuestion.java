package chaptSeventeen.FunctionalInterface;

public class ArrayQuestion {
    public static void main(String[] args) {
        String[] arrayOfNum = new String[]{"Ab1396", "Q2RBS", "G381AC"};
        System.out.println(countIntegers(arrayOfNum));
    }

public static int countIntegers(String[] arr) {
        int count = 0;
        for (String stringInArr : arr) {
            for (int i = 0; i < stringInArr.length(); i++) {
                if (Character.isDigit(stringInArr.charAt(i))) {
                    count++;
                }
            }
        }
        return count;
    }

}
