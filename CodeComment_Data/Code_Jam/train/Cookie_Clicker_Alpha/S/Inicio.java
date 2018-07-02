package methodEmbedding.Cookie_Clicker_Alpha.S.LYD452;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Inicio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in = null;
	    FileWriter out = null;
	    BufferedReader br = null;
	    String respuesta = "";
	    String linea;
	    Integer i=1;
	    
	    try {
	         in = new FileReader("resource/input.txt");
	         br = new BufferedReader(in);
	         out = new FileWriter("resource/output.txt");
	         
	        	 linea = br.readLine();
        		 
        		 while((linea=br.readLine())!=null){
        			 TestCase tc = new TestCase();
        			 respuesta = "Case #" + i + ": " + tc.resolve(linea) +"\n";
        			 i++;
        			 out.write(respuesta);
        		 }		 
        		 
	      }finally {
	         if (in != null) {
	            in.close();
	            out.close();
	         }
	      }
	    
	}

}
