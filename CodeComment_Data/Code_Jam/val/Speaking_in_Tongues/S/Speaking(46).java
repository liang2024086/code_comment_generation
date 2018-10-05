package methodEmbedding.Speaking_in_Tongues.S.LYD1199;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Speaking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			  // Open the file that is the first 
			  // command line parameter
			
			  FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  
			  FileOutputStream ostream  = new FileOutputStream("Output.txt");
			  DataOutputStream out = new DataOutputStream(ostream);
			  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
			  
			  char mapping[] = {'y'/*a*/,'h'/*b*/,'e'/*c*/,'s'/*d*/,'o'/*e*/,'c'/*f*/,'v'/*g*/,'x'/*h*/,'d'/*i*/, 
					  'u'/*j*/,'i'/*k*/, 'g'/*l*/,'l'/*m*/,'b'/*n*/,'k'/*o*/,'r'/*p*/,'z'/*q*/,'t'/*r*/,'n'/*s*/,
					  'w'/*t*/,'j'/*u*/,'p'/*v*/,'f'/*w*/,'m'/*x*/,'a'/*y*/,'q'/*z*/};
			  //Read File Line By Line
			  int count = Integer.parseInt(br.readLine());
			  for (int i = 0; i < count; i++)   {
			  // Print the content on the console
				String stringArray = br.readLine();  
			   char array[] = stringArray.toCharArray();
			   int stringLength = stringArray.length();
			   for (int j = 0; j < stringLength; j++){
				   char key = array[j];
				   
				   if (key >= 'a' && key <= 'z')
					   array[j] = mapping[key-'a'];
			   }
			   String outputString = new String(array);
			   bw.write("Case #" + (i+1) + ": " + outputString);
			   bw.newLine();
			   bw.flush();
			  }
			  //Close the input stream
			  in.close();
			  out.close();
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
	}

}
