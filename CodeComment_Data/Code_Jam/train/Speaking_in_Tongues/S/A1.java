package methodEmbedding.Speaking_in_Tongues.S.LYD758;



import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class A1 {
    
    public static void main(String []args)
    {
        
            StringTokenizer gsc=new StringTokenizer("ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv"," ");
            StringTokenizer esc=new StringTokenizer("our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up"," ");
            
            TreeMap hm=new TreeMap();
            hm.put('z','q');
            hm.put('q','z');
            while((gsc.hasMoreElements())&&(esc.hasMoreElements()))
            {
               String gs=gsc.nextToken();String es=esc.nextToken();
               char []gc=gs.toCharArray();char []ec=es.toCharArray();
               for(int i=0;i<gc.length;i++)
               {
                   char a=gc[i];char b=ec[i];
                   
                   hm.put(new Character(a),new Character(b));
                   
               }
               
            }
          // System.out.print(hm.toString());
            Scanner s=new Scanner(System.in);
            String x=s.nextLine();
            int i=Integer.parseInt(x);
           
           
            for(int j=1;j<=i;j++)
            {
                String a=s.nextLine();
                
                char[] g=new char[a.toCharArray().length];
                g=a.toCharArray();
                System.out.print("Case #"+j+": ");
                for(int k=0;k<g.length;k++)
                { 
                  Character r=(Character) hm.get((Character)g[k]); 
                  System.out.print(r==null?" ":r);
                }
                System.out.println();
              
             }
            
         
    }
}
