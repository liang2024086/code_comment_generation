package methodEmbedding.Revenge_of_the_Pancakes.S.LYD270;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Codejam3 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        StringBuilder cam    = new StringBuilder();
        StringBuilder cam1    = new StringBuilder();
        String cambio;
        String cad;
        int ultimo ,contador,i,numero,f=1;
        
        List<String> casos      = new ArrayList(0);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        archivo = new File ("C:\\Users\\FAVAWIN-10\\Downloads\\B-small-attempt0.in");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         FileWriter fichero = null;
         PrintWriter pw = null;
         fichero = new FileWriter("C:\\Users\\FAVAWIN-10\\Downloads\\prueba.txt");
         pw = new PrintWriter(fichero);
        
         String linea;
         numero=Integer.valueOf(br.readLine());
         
         while((linea=br.readLine())!=null)
         {
             linea = linea.trim();
             casos.add(linea);
         }
         
         for(String caso:casos)
         {
            ultimo=0;
            contador=0;
            StringBuilder cadena = new StringBuilder(caso);
            cad = cadena.toString();
            while(cad.contains("-"))
            {
                if(cad.charAt(0)== '+')
                {
                    i=0;
                    while(cadena.charAt(i)=='+')
                    {
                        cadena.replace(i, (i+1), "-");
                        i=i+1;
                    }
                    cambio = cadena.substring(0, (i+1));
                    cam.delete(0, cam.length());
                    cam.replace(0, (i+1), cambio);
                    cam.reverse();
                    cadena.replace(0, (i+1),cam.toString());
                    cad = cadena.toString();
                    contador +=1;
                }
                else
                {
                    ultimo = cadena.lastIndexOf("-");
                    cambio = cadena.substring(0, (ultimo+1));
                    cam1.delete(0, cam.length());
                    cam1.replace(0, (cambio.length()+1), cambio);
                
                    for(i=0;i<=ultimo;i++)
                    {
                    
                        if(cadena.charAt(i)=='+')
                        {
                            cam1.replace(i, (i+1), "-");
                        }
                        else
                        {
                            cam1.replace(i,(i+1), "+");
                        }   
                    }
                    cam1.reverse();
                    cadena.replace(0, (i+1),cam1.toString());
                    cad = cadena.toString();
                    contador +=1;
                }

            }
            pw.println("Case #"+f+": "+contador);
            f=f+1;
         }    
         fichero.close();
    }
    
}
