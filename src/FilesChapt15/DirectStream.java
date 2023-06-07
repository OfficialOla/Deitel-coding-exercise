package FilesChapt15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator; 

public class DirectStream {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\ADMIN\\Desktop\\regnos");
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            Iterator<Path> iterator = directoryStream.iterator();
            while (iterator.hasNext()){
                Path path1 = iterator.next();
                System.out.println(path1.getFileSystem());
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
