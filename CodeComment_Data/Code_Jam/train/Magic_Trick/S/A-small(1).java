package methodEmbedding.Magic_Trick.S.LYD1980;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class HelloWorld{

     final static Charset ENCODING = StandardCharsets.UTF_8;

     public static void main(String []args) throws IOException {
         
        Path path = Paths.get("input.txt");
        
        try (Scanner scanner = new Scanner(path, ENCODING.name())) {
            
            int cases = Integer.parseInt(scanner.nextLine());
            
            for (int k = 1; k <= cases; k++) {
                int firstChoiceRowNumber = Integer.parseInt(scanner.nextLine());
                int i = 1;
                while(i < firstChoiceRowNumber)
                {
                    scanner.nextLine();
                    i++;
                }
                String[] firstChoiceRowArr = scanner.nextLine().split(" ");
                Set<String> firstSet = new HashSet<String>(Arrays.asList(firstChoiceRowArr));
                
                while(i < 4)
                {
                    scanner.nextLine();
                    i++;
                }
                
                int secondChoiceRowNumber = Integer.parseInt(scanner.nextLine());
                i = 1;
                while(i < secondChoiceRowNumber)
                {
                    scanner.nextLine();
                    i++;
                }
                String[] secondChoiceRowArr = scanner.nextLine().split(" ");
                Set<String> secondSet = new HashSet<String>(Arrays.asList(secondChoiceRowArr));
                
                firstSet.retainAll(secondSet);
        
                if(firstSet.size() == 1)
                {
                    System.out.println("Case #" + k + ": " + firstSet.toArray()[0]);
                }
                else if(firstSet.size() > 1)
                {
                    System.out.println("Case #" + k + ": " + "Bad magician!");
                }
                else
                {
                    System.out.println("Case #" + k + ": " + "Volunteer cheated!");
                }
                
                while(i < 4)
                {
                    scanner.nextLine();
                    i++;
                }
            }
        }
     }
}
