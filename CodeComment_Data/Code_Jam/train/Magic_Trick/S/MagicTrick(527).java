package methodEmbedding.Magic_Trick.S.LYD79;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Fantin on 4/12/14.
 */
public class MagicTrick {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("C:\\Users\\fantin\\Documents\\text.txt"));
            int i = 0;
            int testCases = 0 ;
            int firstRow = -1 ;
            int firstRowAt = -1 ;
            int secondRowAt = -1 ;
            int secondRow = -1 ;
            boolean firstRowFound = false ;
            HashSet<Integer> integerHashSetFirst = new HashSet<Integer>();
            while ((sCurrentLine = br.readLine()) != null) {
               if(i%5 == 0) {
                   if(!firstRowFound){
                   firstRow = Integer.parseInt(sCurrentLine);
                   firstRowFound = true ;
                       firstRowAt = i ;
                   }else{
                       secondRow = Integer.parseInt(sCurrentLine);
                       firstRowFound = false  ;
                       secondRowAt = i;
                   }
               }
                if(firstRowFound && firstRow+firstRowAt == i){
                    integerHashSetFirst = new HashSet<Integer>();
                    Scanner scanner = new Scanner(sCurrentLine);
                    while (scanner.hasNext()){
                        integerHashSetFirst.add(scanner.nextInt());
                    }
                }else{
                    if(!firstRowFound && secondRow+secondRowAt == i){
                    String ans = "Case #"+(++testCases)+": ";
                    Scanner scanner = new Scanner(sCurrentLine);
                        Integer val = -1 ;
                        while (scanner.hasNext()){
                            Integer input = scanner.nextInt() ;
                            if(integerHashSetFirst.contains(input)){
                                val = input;
                            }
                        integerHashSetFirst.remove(input);
                    }
                    if(integerHashSetFirst.size() ==3){
                        System.out.println(ans+val);
                    }else{
                        if(integerHashSetFirst.size() == 4){
                            System.out.println(ans+"Volunteer cheated!");
                        }else{
                            System.out.println(ans+"Bad magician!");
                        }
                    }
                    }
                }
                i++ ;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
