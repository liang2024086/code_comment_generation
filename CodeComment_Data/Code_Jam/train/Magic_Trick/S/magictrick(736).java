package methodEmbedding.Magic_Trick.S.LYD251;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class magictrick {
    public static void main(String args[])throws Exception
    {
        FileInputStream fis=new FileInputStream("input1.in");
        DataInputStream dis=new DataInputStream(fis);
        FileOutputStream fos=new FileOutputStream("output.out");
        PrintWriter pw=new PrintWriter(fos);
        int n=Integer.parseInt((dis.readLine()));
        for (int i = 1; i <=n; i++) 
        {
            int cou=1;
            String sin1="";
            int in1=Integer.parseInt(dis.readLine());
            while(cou<=4)
            {
                if(cou==in1)
                sin1=dis.readLine();
                else
                    dis.readLine();
                //in1--;
                cou++;
            }
            int[] ain1=new int[4];
            int[] ain2=new int[4];
            ArrayList<String> a=new ArrayList<>();
            ArrayList<String> b=new ArrayList<>();
            String sin2="";
            int in2=Integer.parseInt(dis.readLine());
            cou=1;
            while(cou<=4)
            {
                if(cou==in2)
                sin2=dis.readLine();
                else
                    dis.readLine();
                cou++;
            }
            StringTokenizer st=new StringTokenizer(sin1);
            while(st.hasMoreTokens())
            {
                a.add(st.nextToken());
            }
            st=new StringTokenizer(sin2);
            while(st.hasMoreTokens())
            {
                b.add(st.nextToken());
            }
            int c=0;
            int val=0;
            for (int j = 0; j < 4; j++) 
            {
                for (int k = 0; k < 4; k++) 
                {
                    if(a.get(j).equals(b.get(k)))
                    {
                        c=c+4;
                        val=Integer.parseInt(a.get(j));
                    }
                }
            }
            if(c==0)
            {
                pw.println("Case #"+i+": Volunteer cheated!");
            }
            else if(c==4)
            {
                pw.println("Case #"+i+": "+val);
            }
            else
            {
                pw.println("Case #"+i+": Bad magician!");
            }
        }
    pw.close();
    fos.close();
    }
    
}
