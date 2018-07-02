package methodEmbedding.Counting_Sheep.S.LYD1247;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mohamed Khafaga
 */
public class CountingSheep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> s =  new HashSet<>();
        List<String> l = new LinkedList<>();
        int cases = Integer.parseInt(scanner.nextLine().trim());
        for(int i=0;i<cases;i++){
        int current = Integer.parseInt(scanner.nextLine().trim());
        if(current==0){
            l.add("INSOMNIA");
            continue;
        }
        int count=1;
        int newCurrent = current;
        while(s.size()!=10){
          newCurrent = current*count;
          String currentTextual = newCurrent+"";
        for(char x : currentTextual.toCharArray())
            s.add('0'-x);
        count++;
        }
        s.clear();
        l.add(newCurrent+"");
        }
        for(int i=0;i<l.size();i++)
            System.out.println("Case #"+(i+1)+": "+l.get(i));
    }
    
}
