package methodEmbedding.Speaking_in_Tongues.S.LYD553;

import java.io.*;
import java.util.TreeMap;

public class Codigo {

    public static void main(String [] args) throws IOException {
      String [] c1={" ","f","g","u","o","v","w","h","k","a","t","b","e","j","p","m","y","s","l","c","d","x","v","n","r","i","q","z"};
      String [] c2={" ","c","v","j","k","p","f","x","i","y","w","h","o","u","r","l","a","n","g","e","s","m","p","b","t","d","z","q"};
      TreeMap<String,String> TM=new TreeMap<String, String>();

      for(int i=0;i<c1.length;i++)
          TM.put(c1[i],c2[i]);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c=Integer.parseInt(br.readLine().trim());
        FileWriter fichero = new FileWriter("largoc.txt");
        PrintWriter pw = new PrintWriter(fichero);
        String n;
        for(int j=1;j<=c;j++){
            n=br.readLine();
            StringBuilder s=new StringBuilder();
            for(int i=0;i<n.length();i++)
                s.append(TM.get(n.substring(i,i+1)));
            System.out.println("Case #"+j+": "+s.toString());
            //pw.println("Case #"+j+": "+s.toString());
        }
        fichero.close();
    }
}
