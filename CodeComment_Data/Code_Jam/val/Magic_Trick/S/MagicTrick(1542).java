package methodEmbedding.Magic_Trick.S.LYD2124;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NENE
 */
import java.io.*;
import java.util.*;
public class MagicTrick 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(new File("C:/txt/small.in"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:/txt/output.txt"));
        int t=Integer.parseInt(sc.next());
        for(int i=0;i<t;i++)
        {
            int r1=Integer.parseInt(sc.next());
            for(int j=1;j<r1;j++)
            {
               sc.next();
               sc.next();
               sc.next();
               sc.next();
            }
            HashSet<Integer> hs1=new HashSet<Integer>();
            for(int j=0;j<4;j++)
                hs1.add(Integer.parseInt(sc.next()));
            for(int j=r1;j<4;j++)
            {
                sc.next();
                sc.next();
                sc.next();
                sc.next();
            }
            
            int r2=Integer.parseInt(sc.next());
            for(int j=1;j<r2;j++)
            {
                sc.next();
                sc.next();
                sc.next();
                sc.next();
            }
            HashSet<Integer> hs2=new HashSet<Integer>();
            for(int j=0;j<4;j++)
                hs2.add(Integer.parseInt(sc.next()));
            for(int j=r2;j<4;j++)
            {
                sc.next();
                sc.next();
                sc.next();
                sc.next();
            }
            System.out.println(hs1.toString()+"  "+hs2.toString());
            hs1.retainAll(hs2);
            System.out.println(hs1.toString());
            int x=hs1.size();
            if(x==0)
            {
                bw.write("Case #"+(i+1)+": Volunteer cheated!\n");
            }
            if(x>1)
            {
                bw.write("Case #"+(i+1)+": Bad magician!");
            }
            if(x==1)
            {
                ArrayList arr=new ArrayList(hs1);
                bw.write("Case #"+(i+1)+": "+arr.get(0) +"\n");
            }
            bw.newLine();
        }
        bw.close();
    }
}
