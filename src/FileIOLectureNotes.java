import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
//        try{
//            Files.write(pathToOurFile, imperials);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        List<String> currentList = new ArrayList<>();
//        try{
//            currentList = Files.readAllLines(pathToOurFile);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        for (String item : currentList){
//            System.out.println(item);
//        }

//        ADDS TO OUR TXT LIST
        FileIOLectureNotes fiol = new FileIOLectureNotes();
//        fiol.readFileAndOutPut(pathToOurFile);
//
//        try{
//            Files.writeString(pathToOurFile, "Palpatine\n", StandardOpenOption.APPEND);
//        }catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
        fiol.readFileAndOutPut(pathToOurFile);
//        ADD MUTIPLE ITEMS TO LIST
        List<String> lateImperials = new ArrayList<>();
        lateImperials.add("Galla");
        lateImperials.add("Theodora");
        lateImperials.add("Augustus");

        try{
            Files.write(pathToOurFile, lateImperials, StandardOpenOption.APPEND);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        fiol.readFileAndOutPut(pathToOurFile);

        List<String> currentList = new ArrayList<>();
        try{
            currentList = Files.readAllLines(pathToOurFile);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
//        REMOVE FROM LIST
        Iterator<String> listIterator = currentList.iterator();
        while (listIterator.hasNext()){
            String item = listIterator.next();
            if (item.equalsIgnoreCase("Palpatine")){
                listIterator.remove();
            }
        }
//        REMOVE FROM LIST-WRITE THE MODIFIED ARRAYLIST TO THE TXT FILE
        try{
            Files.write(pathToOurFile, currentList);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        fiol.readFileAndOutPut(pathToOurFile);
    }

//        METHOD TO DRY CODE
        public void readFileAndOutPut (Path pathToFile){
            List<String> linesInTheFile = new ArrayList<>();
            try {
                linesInTheFile = Files.readAllLines(pathToFile);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            for (String line : linesInTheFile) {
                System.out.println(line);
            }

        }


    }



