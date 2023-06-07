package FilesChapt15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

public class ClassFile {
    public static void main(String[] args) {
//        Path path = Paths.get("a", "b", "c", ".java"); //Todo ../ to go back to previous folder. (.normalize)
//        System.out.println("fileName:: " +path.getFileName());
//        System.out.println("fileSystem:: " +path.getFileSystem());
//        System.out.println("normal path:: " +path.normalize());
//        System.out.println(path);
//        System.out.println("Path ends with .java:: " +path.endsWith(".java"));
Path path = Path.of("C:\\Users\\ADMIN\\Desktop\\regnos\\test.java");
try {
//    Set<PosixFilePermission> set = new HashSet<>(PosixFilePermission.values())
//   Path filePath = Files.createFile(path);
    Path filePath = Files.createFile(path);
    System.out.println(filePath);
}catch(IOException exception){
    System.out.println(exception.getMessage());
}
    }
}
