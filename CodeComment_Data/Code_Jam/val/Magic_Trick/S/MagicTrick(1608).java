package methodEmbedding.Magic_Trick.S.LYD1777;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
//import static java.lang.System.*;

public class MagicTrick 
{
    public static void main(String[] saber) throws IOException 
    { 
        Scanner in=new Scanner(new File("A-small-attempt1.in"));  
        PrintWriter out=new PrintWriter(new File("out.txt"));
        int count=in.nextInt(); 
        for(int i=1;i<count+1;i++) 
        { 
            int row1=in.nextInt()-1; 
            in.nextLine();
            String[][] cards1=new String[4][4]; 
            cards1[0]=in.nextLine().split(" "); 
            cards1[1]=in.nextLine().split(" "); 
            cards1[2]=in.nextLine().split(" "); 
            cards1[3]=in.nextLine().split(" "); 
            ArrayList<String> cardsInRow=new <String>ArrayList();
            //System.out.println(row1);
            for(String x:cards1[row1]) 
            {
                //System.out.print(x+" ");
                cardsInRow.add(x);
            } 
            //System.out.println();
            
            int row2=in.nextInt()-1; 
            in.nextLine();
            String[][] cards2=new String[4][4]; 
            cards2[0]=in.nextLine().split(" "); 
            cards2[1]=in.nextLine().split(" "); 
            cards2[2]=in.nextLine().split(" "); 
            cards2[3]=in.nextLine().split(" ");  
            
            ArrayList<String> realCards=new <String>ArrayList();
            for(String y:cards2[row2])
            {
                //System.out.print(y+" ");
                if(cardsInRow.contains(y)) 
                    realCards.add(y);
            } 
            //System.out.println();
            if(realCards.size()==1) 
            { 
                out.println("Case #"+i+": "+realCards.get(0));
            }
            else if(realCards.size()>1) 
            { 
                out.println("Case #"+i+": Bad magician!");
            } 
            else if(realCards.isEmpty()) 
                out.println("Case #"+i+": Volunteer cheated!"); 
            //if(i==26) 
            //    System.out.println(realCards.get(0)+"***");
        } 
        out.close();
    }
}
