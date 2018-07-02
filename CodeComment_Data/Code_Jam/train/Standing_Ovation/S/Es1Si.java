package methodEmbedding.Standing_Ovation.S.LYD271;

import java.io.*;
import java.util.*;
public class Es1Si {
    public static void main(String[] args)throws FileNotFoundException {
        File c= new File("A-small-attempt4.in");
        File d= new File("A-small-attempt4.out");
        Scanner in=new Scanner(c);
        PrintWriter out=new PrintWriter(d);
        int T,V[]=new int[7],Sm,z=0;
        T=in.nextInt();
        for(int i=0;i<T;i++){
            int x=0,g=0;
            do{
                Sm=in.nextInt();
            }while(Sm<0||Sm>6);
            String s=in.nextLine();
            for(int j=0;j<s.length()-1;j++){
             V[j]=(int)s.charAt(j+1)-48;
            }
            x=V[0];
            for(int j=1;j<s.length()-1;j++){
            if(V[j]!=0){
            if(x<j){
            g=g+j-x;
            x=j;
            }
            }
             x=x+V[j];
            }
            
                
            
            out.println("Case #"+(i+1)+": "+g);        
      
    }
        
out.close();
    }
    
}
    

