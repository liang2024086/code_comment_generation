package methodEmbedding.Speaking_in_Tongues.S.LYD1274;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class main {
	public static void main(String[] args) {
		File archivo = null;
	      FileReader fr = null;
	      FileWriter wr=null;
	      PrintWriter pw=null;
	      BufferedReader br = null;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:/Users/Pc/Desktop/input.in");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         wr=new FileWriter("C:/Users/Pc/Desktop/output.out");
	         pw=new PrintWriter(wr);
	         // Lectura del fichero
	         String linea;
	         String aux="";
	         int ind=0;
	         Integer num=0;
	         Map<String,String> traduc=new HashMap<String,String>();
	         Map<String,String> traduc2=new HashMap<String,String>();
	         traduc.put("a", new String("y"));
	         traduc.put("b", new String("n"));
	         traduc.put("c", new String("f"));
	         traduc.put("d", new String("i"));
	         traduc.put("e", new String("c"));
	         traduc.put("f", new String("w"));
	         traduc.put("g", new String("l"));
	         traduc.put("h", new String("b"));
	         traduc.put("i", new String("k"));
	         traduc.put("j", new String("u"));
	         traduc.put("k", new String("o"));
	         traduc.put("l", new String("m"));
	         traduc.put("m", new String("x"));
	         traduc.put("n", new String("s"));
	         traduc.put("o", new String("e"));
	         traduc.put("p", new String("v"));
	         traduc.put("q", new String("z"));
	         traduc.put("r", new String("p"));
	         traduc.put("s", new String("d"));
	         traduc.put("t", new String("r"));
	         traduc.put("u", new String("j"));
	         traduc.put("v", new String("g"));
	         traduc.put("w", new String("t"));
	         traduc.put("x", new String("h"));
	         traduc.put("y", new String("a"));
	         traduc.put("z", new String("q"));
	         traduc.put(" ", " ");
	         
	         for (String s:traduc.keySet())
	         {
	        	 traduc2.put(traduc.get(s), s);
	         }
	         
	         while((linea=br.readLine())!=null)
	         {
	        	 if (num!=0){
	        		 aux="Case #"+num.toString()+": ";
	        		 for (int i=0;i<linea.length();i++)
	        		 {
	        			 aux+=traduc2.get(linea.charAt(i)+"");
	        		 }
	        		 pw.println(aux);
	        	 }
	        	 num++;
	        	 
	         }
	            
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();  
	               wr.close();
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
	}

}
