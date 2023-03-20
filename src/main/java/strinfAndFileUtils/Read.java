package strinfAndFileUtils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.apache.commons.lang3.StringUtils.*;

public class Read {
//    public static void main(String[] args) {
//        File file = new File("my.txt");
//        try{
//            List<String> list = FileUtils.readLines(file, StandardCharsets.UTF_8);
//            List<String> strings = list.stream().distinct().collect(Collectors.toList());
//            strings.forEach(System.out::println);
//            System.out.println(strings.stream().count());
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
private static final String DELIMITERS = " \n\t\r.,;:!?@{}[]()*&^%$#|/.";

    public static void main(String[] args) {
        try {
            String unique = "";
            uniqueFile(DELIMITERS, "my.txt", "out1.txt");
        } catch (IOException e) {
            LogManager.getLogger(Read.class).info(e.getMessage());
        }
    }

    public static void uniqueFile(String delimiters, String input, String output) throws IOException {
        String s = lowerCase(join(split((FileUtils.readFileToString(new File(input), UTF_8)), delimiters), " "));
        for (String i : new LinkedHashSet<>(List.of(StringUtils.split(s)))) {
            FileUtils.write(new File(output), i + " ", UTF_8, true);
        }
        FileUtils.write(new File(output), "\n", UTF_8, true);
    }

}
