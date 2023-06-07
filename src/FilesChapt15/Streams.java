package FilesChapt15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ADMIN\\IdeaProjects\\javaProjectOne\\src\\FilesChapt15\\text.txt")){
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            for (byte b : bytes){
                System.out.print(Character.toString(b) + " ");
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
