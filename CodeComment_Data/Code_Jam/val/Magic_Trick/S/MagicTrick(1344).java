package methodEmbedding.Magic_Trick.S.LYD1138;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author A.H.F RIYAFA
 */
public class MagicTrick {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(new BufferedReader(new FileReader("Test.in")));
                PrintWriter wr=new PrintWriter(new BufferedWriter(new FileWriter("Test.out")),true)) {
            
            int N=sc.nextInt();
            
            
            
            
            for(int i=1;i<=N;++i){
                
                int R=sc.nextInt();
                for(int j=1;j<R;++j){
                    sc.nextInt();sc.nextInt();sc.nextInt();sc.nextInt();
                }
                List<Integer> l1=new ArrayList<>();
                for(int j=1;j<=4;++j){
                    l1.add(sc.nextInt());
                }
                for(int j=R+1;j<=4;++j){
                    sc.nextInt();sc.nextInt();sc.nextInt();sc.nextInt();
                }
                 R=sc.nextInt();
                for(int j=1;j<R;++j){
                    sc.nextInt();sc.nextInt();sc.nextInt();sc.nextInt();
                }
                List<Integer> l2=new ArrayList<>();
                for(int j=1;j<=4;++j){
                    l2.add(sc.nextInt());
                }
                for(int j=R+1;j<=4;++j){
                    sc.nextInt();sc.nextInt();sc.nextInt();sc.nextInt();
                }
                
                Set<Integer> s=new HashSet<>(l1);
                s.addAll(l2);
                if(s.size()==8)
                    wr.print("Case #"+i+": Volunteer cheated!");
                else if(s.size()==7){
                    l1.addAll(l2);
                    for(int j=0;j<4;++j)
                        if(Collections.frequency(l1, l1.get(j))==2){
                            wr.print("Case #"+i+": "+l1.get(j));
                            break;
                        }
                            
                }
                else{
                    wr.print("Case #"+i+": Bad magician!");
                }
                
                wr.println();
            }
                
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
