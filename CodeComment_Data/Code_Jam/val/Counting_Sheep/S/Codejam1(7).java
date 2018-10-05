package methodEmbedding.Counting_Sheep.S.LYD1342;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Codejam1 
{     
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        int oveja=0,f=1;
        String escritura=null;
        List<String> numeros = new ArrayList(0);
        List<Integer> casos      = new ArrayList(0);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        archivo = new File ("C:\\Users\\FAVAWIN-10\\Downloads\\A-small-attempt2.in");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         FileWriter fichero = null;
         PrintWriter pw = null;
         fichero = new FileWriter("C:\\Users\\FAVAWIN-10\\Downloads\\prueba.txt");
         pw = new PrintWriter(fichero);
         
         String linea;
         linea=br.readLine();
         while((linea=br.readLine())!=null)
         {
            int archivonumero=Integer.valueOf(linea);
            casos.add(archivonumero);
         }
       
        for(int caso:casos)
        {
           numeros.clear();
           int j=1;
           while(numeros.size() <10)
            { 
                if(caso ==0)
                {   
                    escritura = "INSOMNIA";
                    break;
                }
                else
                {
                    oveja = caso * j;
                    String num = String.valueOf(oveja);
                    j = j+1;
                    for(int i=0;i<num.length();i++)
                    {
                        String me = Character.toString(num.charAt(i));
                        if(!numeros.contains(me))
                        {
                          numeros.add(me);
                        }
                    }
                }
                escritura = String.valueOf(oveja);
            }
                pw.println("Case #"+f+": "+escritura);
                f=f+1;
        }
         fichero.close();
    }    
    
}
