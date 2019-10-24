package kz.edu.nu.cs.teaching;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class App {
    static final String h = "~~~~~~~~~~~~\n";
    
    public static void main(String[] args) {
        
        System.out.println("\nTask 1 " + h);
        wordcount(getTestLinesStream());
        
        System.out.println("\nTask 2 " + h);
        filterbywordlength(getTestLinesStream());

        System.out.println("\nTask 3 " + h);
        groupwordsbylength(getTestLinesStream());
    }
    
    /*
     * Task 1, count words in entire file
     */
    public static void wordcount(Stream<String> stream) {
        // complete method
    }
    
    /*
     * Task 2, filter lines by lengths of longest words
     */
    public static void filterbywordlength(Stream<String> stream) {
        // complete method
    }
    
    /*
     * Task 3, group words by first character
     */
    public static void groupwordsbylength(Stream<String> stream) {
        // complete method
    }
    
    /*
     * Create Stream of lines from file
     */
    public static Stream<String> getTestLinesStream() {
        File file = new File("lambtest.txt");
        
        try {
            return Files.lines(file.toPath());
        } catch (Exception e) {
            System.out.println("Error reading from file");
            return null;
        }
    }
    
    
}
