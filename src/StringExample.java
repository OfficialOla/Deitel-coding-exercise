public class StringExample {
    public static void main(String[] args) {
//        byte[] byt = {65,66,67};
//        String string = new String(byt);
//        System.out.println(string);
//        String zen = "Trichinosis";
//        char[] dst = new char[9];
//        zen.getChars(1,5, dst, 0);
//        System.out.println(zen.charAt(0));
//        System.out.println(zen.length());
//        System.out.println(dst);
        String firstString = new String("Semicolon");
        String secondString = new String("Semicolon");
        System.out.println(firstString == secondString);
        String thirdString = "Semicolon";
        String fourthString = "Semicolon";
        System.out.println(thirdString == fourthString);

    }
}
