package methodEmbedding.Magic_Trick.S.LYD594;


import java.io.*;

public class Inicio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in = null;
	    FileWriter out = null;
	    BufferedReader br = null;
	    String respuesta = "";
	    String linea;
	    Integer testCase=0;
	    
	    try {
	         in = new FileReader("resource/input.txt");
	         br = new BufferedReader(in);
	         out = new FileWriter("resource/output.txt");
	         
	        	 linea = br.readLine();
        		 testCase = Integer.parseInt(linea);
        		 System.out.println(linea);
        		 
        		 for(int i=1;i<=testCase;i++){
        			 TestCase tc = new TestCase();
        			 linea = br.readLine();
        			 tc.setFirst(Integer.parseInt(linea));
        			 linea = br.readLine();
        			 tc.setGrid1(linea);
        			 linea = br.readLine();
        			 tc.setGrid1(linea);
        			 linea = br.readLine();
        			 tc.setGrid1(linea);
        			 linea = br.readLine();
        			 tc.setGrid1(linea);
        			 
        			 linea = br.readLine();
        			 tc.setSecond(Integer.parseInt(linea));
        			 linea = br.readLine();
        			 tc.setGrid2(linea);
        			 linea = br.readLine();
        			 tc.setGrid2(linea);
        			 linea = br.readLine();
        			 tc.setGrid2(linea);
        			 linea = br.readLine();
        			 tc.setGrid2(linea);
        			 
        			 respuesta = "Case #" + i + ": " + tc.resolve();
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
