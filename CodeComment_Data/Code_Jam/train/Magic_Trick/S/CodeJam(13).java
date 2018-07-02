package methodEmbedding.Magic_Trick.S.LYD474;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Furqan
 */
public class CodeJam {

    
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("A-small-attempt0.in");
        Scanner sc = new Scanner(f);
        int cases = sc.nextInt();
        for(int i=0;i<cases;i++){
            int foundCount = 0;
            int guess1 = sc.nextInt();
            ArrayList g1List = new ArrayList();
            for(int r=1;r<=4;r++){
                for(int c=1;c<=4;c++){
                    if(r==guess1){
                        g1List.add(sc.nextInt());
                    }
                    else
                        sc.nextInt();
                }
            }
            int guess2 = sc.nextInt();
            int found = 0;
            for(int r=1;r<=4;r++){
                for(int c=1;c<=4;c++){
                    if(r==guess2){
                        int tmp = sc.nextInt();
                        if(g1List.contains(tmp)){
                            foundCount++;
                            found = tmp;
                        }
                    }
                    else
                        sc.nextInt();
                }
            }
            
            if(foundCount == 1)
                System.out.println("Case #"+(i+1)+": "+found);
            else if(foundCount > 1)
                System.out.println("Case #"+(i+1)+": Bad magician!");
            else if(foundCount == 0)
                System.out.println("Case #"+(i+1)+": Volunteer cheated!");
            
        }
    }
    
}
