package FilesChapt15.Deserializable;

import FilesChapt15.serialize.Dog;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example {
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\ADMIN\\IdeaProjects\\javaProjectOne\\dog"))){
            var dog = (Dog)objectInputStream.readObject();
            System.out.println(dog);
        }catch (IOException| SecurityException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
