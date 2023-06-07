package FilesChapt15.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("C:\\Users\\ADMIN\\IdeaProjects\\javaProjectOne\\src\\FilesChapt15\\text.txt")){
            writer.append("Thank God it's fridayyyy");
        }catch(IOException exception){
            System.out.println(exception.getMessage());
        }

    }
}
