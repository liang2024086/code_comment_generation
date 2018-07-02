package methodEmbedding.Speaking_in_Tongues.S.LYD646;

import java.io.*;

class Speaking_in_Tounges{
	public static void main(String[] args)
	{
		String lang = "abcdefghijklmnopqrstuvwxyz";
		String googlerese = "yhesocvxduiglbkrztnwjpfmaq";
		
		int i,j,len = 0;
		int k = 1;
		try
		{
			FileInputStream fstream = new FileInputStream("d:\\input.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			FileWriter fstreamout = new FileWriter("d:\\out.txt");
			BufferedWriter out = new BufferedWriter(fstreamout);
			String strLine;
			strLine = br.readLine();
			while ((strLine = br.readLine()) != null)
			{
				StringBuffer result = new StringBuffer();
				result.append("Case #");
				result.append(new Integer(k).toString()+": ");
				k++;
				len = strLine.length();
				
				for(i=0;i<len;i++)
				{
					
					char c = strLine.charAt(i);
					j = lang.indexOf(c);
					if(j!=-1)
					{
						char res = googlerese.charAt(j);
						result.append(res);
					}
					else
						result.append(c);
					
			    }	
				String result1 = result.toString();
				out.write(result1);
				out.write("\r\n");
			}
			in.close();
			out.close();
			
		}
		catch(Exception e)
		{
			System.err.println("Error: " + e.getMessage());
		}
		
	}
}
