package methodEmbedding.Speaking_in_Tongues.S.LYD448;

import java.io.*;   
import java.util.HashMap;

public class Speaking {
    public static void main(String[] args) throws FileNotFoundException, IOException{
                String alphabet="abcdefghijklmnopqrstuvwxyz ";
                String g="ynficwlbkuomxsevzpdrjgthaq ";
                String ligne="";
                int compt=1;
                char [] car=alphabet.toCharArray();
                char []carg=g.toCharArray();
                 HashMap<String ,String> tablo= new HashMap<String ,String>();
                        for (int j=0; j<alphabet.length(); j++)
                        {
                            tablo.put(""+carg[j],""+car[j] );
                            
                        }
                                {
        }
                 
                   BufferedReader entree = new BufferedReader (new FileReader ("A-small-attempt1.in"));
                   PrintWriter ecrire= new  PrintWriter( new FileWriter("ouput.txt"));
                   StringBuilder line= new StringBuilder();
                   int nbre=Integer.parseInt(ligne=entree.readLine());
                   
                      
                  while(ligne!=null && compt<=nbre )
                  {
                      line.append("Case #");
                      ligne=entree.readLine();
                      if(ligne!=null)
                      { 
                          line.append(compt).append(": ");
                        for (int j=0;j<ligne.length();j++)
                            line.append(tablo.get(""+ligne.charAt(j)));
                      }
                     ecrire.println(line.toString());
                     compt++;
                     line.delete(0, line.toString().length());
      
                  }
                  entree.close();
                  ecrire.close();
              
                }
    
}
