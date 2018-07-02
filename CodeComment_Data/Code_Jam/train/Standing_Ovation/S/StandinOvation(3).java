package methodEmbedding.Standing_Ovation.S.LYD68;


import java.util.*;
import java.io.*;

public class StandinOvation {
    public static void main (String[] args) throws FileNotFoundException {
        File a = new File ("s.in");
        File b = new File ("output.out");
        
        Scanner in = new Scanner (a);
        PrintWriter out = new PrintWriter (b);
        
        int casi;
        
        casi=in.nextInt();
        
        for (int i=0; i<casi; i++)   
        {
            
            int up=0;
            int Sol=0;
            int Smax;
            do{
                Smax=in.nextInt();
            }while(casi>0 && casi <6);
            String S =in.nextLine();
            
            int V []= new int [Smax+1];
                    
            for (int l=0; l<S.length()-1; l++)
                V[l]=S.charAt(l+1)-48;
            
            up=V[0];
            
            for (int k=1; k<S.length()-1; k++)
            {
                if (V[k]!=0)
                {
                    if (up<k){
                        Sol=Sol+k-up;
                        up=k;
                    }
                }
                
                up+=V[k];
            }
                        
            out.println ("Case #"+ (i+1)+": "+Sol);
        }
        
        out.close();
    }
    
}
