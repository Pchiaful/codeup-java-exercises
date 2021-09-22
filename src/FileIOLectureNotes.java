import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class FileIOLectureNotes {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
//        Path pathToThisLectureFile = Paths.get("src", "FileIOLectureNotes.java");
//        System.out.println(pathToThisLectureFile);
//        Path pathToOurDatDir = Paths.get("src/data");
//        Files.createDirectories(pathToOurDatDir);
//        try{
//            Files.createDirectories(pathToOurDatDir);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        Path pathToNewTestDir = Paths.get("src/test");
//        try{
//            Files.createDirectories(pathToNewTestDir);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }
        Path pathToOurFile = Paths.get("src/data", "list.txt");
//        try{
//            if (Files.notExists(pathToOurFile)){
//                Files.createFile(pathToOurFile);
//            }else {
//                System.out.println(pathToOurFile + " already exitst.");
//            }
//        }catch (IOException ioe){
//            System.out.println("A problem!");
//            ioe.printStackTrace();
//        }
        List<String> imperials = Arrays.asList("Claudius", "Nero", "Romulus", "Caesar");
        try{
            Files.write(pathToOurFile, imperials);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
