package methodEmbedding.Standing_Ovation.S.LYD2144;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main2 {
    public static void main(String args[])
    {
        File file = new File("C:/codejam/f1.txt");
        Scanner s = null;
        try {
            s = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int t=s.nextInt();
        for(int j=1;j<=t;j++)
        {
            int n=s.nextInt();
            String str=s.next();
            
            int cs=Integer.parseInt(""+str.charAt(0));
            int count=0;
            for(int i=1;i<=n;i++)
            {
                String g=""+str.charAt(i);
                int m=Integer.parseInt(g);
                
                if(cs<i)
                {
                    count=count+(i-cs);
                    cs=cs+(i-cs);
                }
             cs=cs+m;
            }
      PrintWriter out = null;
            try {
                out = new PrintWriter(new FileWriter("C:/codejam/f2.txt",true));
            } catch (IOException ex) {
                Logger.getLogger(Main2.class.getName()).log(Level.SEVERE, null, ex);
            }
      out.println("Case #"+j+": "+count);
      out.close();
        }
    }
    
}
