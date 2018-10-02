package methodEmbedding.Speaking_in_Tongues.S.LYD110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int t = -1;
		int cont = 1;
		String cadena = "", nuevaCadena = "";
		List<String> cadenas = new ArrayList<String>();
		try{
			  FileInputStream fstream = new FileInputStream("C:\\Users\\Joel\\Desktop\\A-small-attempt0.in");
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));			  
			  FileWriter fwstream = new FileWriter("C:\\Users\\Joel\\Desktop\\out.txt");
			  BufferedWriter out = new BufferedWriter(fwstream);
			  			  
			  String strLine;
			  //Read File Line By Line
			  while ((strLine = br.readLine()) != null)   {
				  if(t == -1){
					  t = Integer.valueOf(strLine);
				  }
				  else{
					  cadena = strLine;
					  nuevaCadena = "";
					  for(int i=0;i<cadena.length(); i++){
						  switch (cadena.charAt(i)) {
							case 'a':
								nuevaCadena += 'y'; 
								break;
							case 'b':	
								nuevaCadena += 'h';
								break;
							case 'c':	
								nuevaCadena += 'e';
								break;
							case 'd':		
								nuevaCadena += 's';
								break;
							case 'e':
								nuevaCadena += 'o';
								break;
							case 'f':	
								nuevaCadena += 'c';
								break;
							case 'g':				
								nuevaCadena += 'v';
								break;
							case 'h':				
								nuevaCadena += 'x';
								break;
							case 'i':				
								nuevaCadena += 'd';
								break;
							case 'j':				
								nuevaCadena += 'u';
								break;
							case 'k':				
								nuevaCadena += 'i';
								break;
							case 'l':				
								nuevaCadena += 'g';
								break;
							case 'm':				
								nuevaCadena += 'l';
								break;
							case 'n':				
								nuevaCadena += 'b';
								break;
							case 'o':				
								nuevaCadena += 'k';
								break;
							case 'p':				
								nuevaCadena += 'r';
								break;
							case 'q':				
								nuevaCadena += 'z';
								break;
							case 'r':				
								nuevaCadena += 't';
								break;
							case 's':				
								nuevaCadena += 'n';
								break;
							case 't':				
								nuevaCadena += 'w';
								break;
							case 'u':				
								nuevaCadena += 'j';
								break;
							case 'v':				
								nuevaCadena += 'p';
								break;
							case 'w':				
								nuevaCadena += 'f';
								break;
							case 'x':				
								nuevaCadena += 'm';
								break;
							case 'y':				
								nuevaCadena += 'a';
								break;
							case 'z':				
								nuevaCadena += 'q';
								break;
							case ' ':	
								nuevaCadena += ' ';
								break;
							default:
								break;
						}						 
					  }
					  //cadenas.add(nuevaCadena);	
					  out.write("Case #" + String.valueOf(cont) + ": " + nuevaCadena);
					  out.newLine();
					  cont++;
				  }			  
			  }
//			  for(String str :cadenas){
//				  System.out.println("Case: " + str);
//			  }
			  //Close the input stream
			  in.close();
			  //Close the output stream
			  out.close();
		}
		catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}

}
