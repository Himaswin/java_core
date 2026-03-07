package March4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FilePractice {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src", "March4", "story.txt");




//        int count = 0;
        try {
            List<String> strings = Files.readAllLines(path);
            long count1 = strings.stream().flatMap(line -> Arrays.stream(line.split(" ")))
                    .filter(word -> word.contains("Alice"))
                    .count();
            System.out.println(count1);
            Files.createDirectories(Paths.get("src", "March4", "newfolder"));

            List<Integer> list = List.of(1,2,3,4,5,5,6,7,8,9,10, 0, 1, 2);

            Set<Integer> set = new HashSet<>();
            List<Integer> list1 = list.stream()
                    .filter(i -> !set.add(i))
                    .toList();
            System.out.println(list1);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try{
//
//            while(Files.readString(path).contains("Alice")){
//                count++;
//            }
//            System.out.println(count);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        Path path = Paths.get("src", "March4", "random.txt");
//        try {
//            Files.writeString(path, "hello");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        File file = new File("C:/Users/Himaswin/IdeaProjects/lambdas-stream/src/March4/story.txt");
////        System.out.println(file.isFile());
//
//
//        try(InputStream inputStream = new FileInputStream(file)){
//            byte[] bytes = inputStream.readAllBytes();
//            String str = new String(bytes);
//            System.out.println(str);
//            System.out.println("hello");
//        } catch (FileNotFoundException e){
//            throw new RuntimeException(e);
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }

    }
}
