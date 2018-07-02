package methodEmbedding.Magic_Trick.S.LYD1973;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class A
{

    public static void main(String[] args) throws FileNotFoundException
    {
        // TODO Auto-generated method stub
        Scanner fin = new Scanner(new File("A-small-attempt0.in"));
        
        int cases = Integer.parseInt(fin.nextLine());
        for(int i = 1; i <= cases; i++){
            int firstRow = Integer.parseInt(fin.nextLine());
            int j;
            for(j = 1; j < firstRow; j++)
                fin.nextLine();
            ArrayList<Integer> s1 = new ArrayList<>();
            String[] s = fin.nextLine().split(" ");
            for(int k = 0; k < 4; k++){
                s1.add(Integer.parseInt(s[k]));
            }
            for(; j < 4; j++)
                fin.nextLine();
            
            int secondRow = Integer.parseInt(fin.nextLine());
            for(j = 1; j < secondRow; j++)
                fin.nextLine();
            ArrayList<Integer> s2 = new ArrayList<>();
            s = fin.nextLine().split(" ");
            for(int k = 0; k < 4; k++)
                s2.add(Integer.parseInt(s[k]));
            for(; j < 4; j++)
                fin.nextLine();
            s1.retainAll(s2);
            s1.trimToSize();
            System.out.print("Case #" + i + ": ");
            if(s1.size() == 0){
                System.out.println("Volunteer cheated!");
            }
            else if(s1.size() == 1){
                System.out.println(s1.get(0));
            }
            else{
                System.out.println("Bad Magician!");
            }
        }
        
        fin.close();
    }

}
