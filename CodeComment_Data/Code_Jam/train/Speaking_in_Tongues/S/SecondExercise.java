package methodEmbedding.Speaking_in_Tongues.S.LYD175;



import java.io.*;
import java.util.*;

public class SecondExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			FileWriter fstream2 = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(fstream2);
			
			String strLine;
			int j=0;
		
			strLine = br.readLine();
			char dic[][]= {
					{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','w','z'},
					{'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','m','a','f','q'}
			};
					
			
			while ((strLine = br.readLine()) != null)   {
				char[] c = strLine.toCharArray();
				
				for (int i=0;i<c.length;i++)
				{
					for(int k=0;k<dic[1].length;k++)
						if (c[i]==dic[0][k])
						{
							c[i]=dic[1][k];
							break;
						}
				}
				
				strLine = new String(c);	
				//shkrimi i rezultatit	
					
				out.write("Case #"+(++j)+": "+strLine+" \n");
				
				
				//System.out.println(strLine);
								
				
			}
			//System.out.println(vec.size()+vec.toString());
		    in.close();
		    out.close();
		}
		catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}	
}
