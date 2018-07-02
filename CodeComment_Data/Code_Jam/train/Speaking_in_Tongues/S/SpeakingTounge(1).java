package methodEmbedding.Speaking_in_Tongues.S.LYD1018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class SpeakingTounge {

	public static void main(String[] args){
		FileInputStream fstream = null;
		DataInputStream in = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter out = null;
		
		try{
			  fstream = new FileInputStream(args[0]);
			  in = new DataInputStream(fstream);
			  br = new BufferedReader(new InputStreamReader(in));
			  
			  fw = new FileWriter(args[1]);
			  out = new BufferedWriter(fw);
			  
			  String strLine;
			  int i = 0;
			  int tc = 0;
			  
			  String alphStr = "abcdefghijklmnopqrstuvwxyz ";
			  String mappStr = "yhesocvxduiglbkrztnwjpfmaq ";
			  while ((strLine = br.readLine()) != null)   {
				  if(i == 0){
					 tc = Integer.parseInt(strLine);
					 i++;
					 continue;
				  }
				  if( i <= tc){
					  String convStr = "";
					  for(int j=0; j<strLine.length();j++){
						  char ch1 = strLine.charAt(j);  
						  int index = alphStr.indexOf(Character.toString(ch1));
						  char ch2 = mappStr.charAt(index);
						  convStr = convStr + Character.toString(ch2);
					  }
					  
					  System.out.println("Case #"+i+": "+convStr);
					  out.write("Case #"+i+": "+convStr);
					  out.write(System.getProperty( "line.separator" ));
				  }
				  i++;
			  }
			  
			  in.close();
			  out.close();
		}catch (Exception e){
			e.printStackTrace();
			System.err.println("Error: " + e.getMessage());
		}
	}
	

}
