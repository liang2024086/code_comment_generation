package methodEmbedding.Magic_Trick.S.LYD828;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

public class Magic_Trick 
{

    public static void main(String[] args) throws Exception 
    {
        Set<Integer> arr1=new HashSet<Integer>();
        Set<Integer> arr2=new HashSet<Integer>();
        BufferedReader br=new BufferedReader(new FileReader(new File("D:\\krunal\\input\\A-small-attempt0.in")));
        String s;
        int T,rn,l=0;
        T=Integer.parseInt(br.readLine());
        FileWriter wr=new FileWriter(new File("D:\\krunal\\input\\_MagicOut.txt"));
        while(l<T)
        {l+=1;
         rn=Integer.parseInt(br.readLine());
         for(int i=0;i<4;i++)
         {
             s=br.readLine();
             if(i+1==rn)
             {
                 String[] w=s.trim().split(" ");                              
                 for(String st:w)
                     arr1.add(Integer.parseInt(st));                
             }
         }
         rn=Integer.parseInt(br.readLine());
         for(int i=0;i<4;i++)
         {
             s=br.readLine();
             if(i+1==rn)
             {
                 String[] w=s.trim().split(" ");
                 for(String st:w)
                     arr2.add(Integer.parseInt(st));
             }
         }
         Set<Integer> tt=new HashSet<Integer>();
         tt.addAll(arr1);
         tt.retainAll(arr2);
         if(tt.size()==1)
             wr.write("Case #"+l+": "+tt.toArray()[0]+"\r");
         if(tt.size()>1)
             wr.write("Case #"+l+": Bad magician!\r");
         if(tt.isEmpty())
             wr.write("Case #"+l+": Volunteer cheated!\r");
         wr.write("\n");
         arr1.clear();
         arr2.clear();
        }
        wr.close();
    }
}
