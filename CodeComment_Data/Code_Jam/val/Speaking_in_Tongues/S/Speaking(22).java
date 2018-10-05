package methodEmbedding.Speaking_in_Tongues.S.LYD491;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Speaking {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int N = 0;
		
		StringBuffer sb = new StringBuffer();
		// Open the file that is the first 
		// command line parameter
		FileInputStream fstream = new FileInputStream("A-small-attempt1.in");
		// Get the object of DataInputStream
		FileOutputStream ostream = new FileOutputStream("Speaking.out");
		DataOutputStream out = new DataOutputStream(ostream);
		
		
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		String strLine2;
		strLine2 = "";
		
		int C;
		
		N = Integer.parseInt(br.readLine().trim());

		String a = "abcdefghijkl mnopqrstuvwxyz";
		String b = "yhesocvxduig lbkrztnwjpfmaq";
		
		for(int i=0; i<N; i++)
		{
			strLine = br.readLine();  
			for (int x=0; x<strLine.length(); x++)
				for (int G=0; G<27; G++)
				{
				
					if (strLine.charAt(x) == a.charAt(G))
					{
						strLine2 +=	String.valueOf(b.charAt(G));
						
					}
					
					
				}
		

			sb.append("Case #" + (i+1) + ": ");
			sb.append(strLine2);
			sb.append("\n");



				//System.out.print("Case #" + (i+1) + ": ");
				//System.out.print(strLine2);
				//System.out.print("\n");
				strLine2 = "";
						
		}
		
		System.out.print(sb.toString());
		out.writeBytes(sb.toString());
		
	}

}
