package FilesChapt15.reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ExampleFileReader {
    public static void main(String[] args) {
        char[] chars = new char[1024];
        try(FileReader fileReader = new FileReader("C:\\Users\\ADMIN\\IdeaProjects\\javaProjectOne\\src\\FilesChapt15\\text.txt")) {
            var numberOfCharactersRead = fileReader.read(chars);
            System.out.println(numberOfCharactersRead);
            System.out.print(Arrays.toString(chars));
        } catch(IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
