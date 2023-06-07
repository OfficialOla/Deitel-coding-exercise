package FilesChapt15;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.FileOutputStream;
import java.io.IOException;

public class StreamExample2 {
    public static void main(String[] args) {
      try(var fileOutputStream = new FileOutputStream("C:\\Users\\ADMIN\\IdeaProjects\\javaProjectOne\\src\\FilesChapt15\\text_output.txt")){
        byte[] bytes = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100 };
        fileOutputStream.write(bytes);
      }catch (IOException exception){
          System.out.println(exception.getMessage());
      }

    }
}
