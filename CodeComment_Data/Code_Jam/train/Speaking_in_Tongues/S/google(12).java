package methodEmbedding.Speaking_in_Tongues.S.LYD1379;


import java.io.*;
class google
{
	public static void main(String args[])throws IOException
	{
		
		char[] str4 = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'}; 
		
		String fileName = "C:/Users/vindu@avi/Downloads/A-small-attempt0 (2).in";
		
		BufferedReader input  = new BufferedReader(new FileReader(fileName));
		
		 
		PrintWriter out = new PrintWriter(new FileWriter("ouput.txt"));
		
		int t;
		t = Integer.parseInt(input.readLine());
		String[] T = new String[t];
		for(int l=0;l<t;l++)
		T[l] = input.readLine();
		for(int i=0;i<t;i++)
		{	
			
			StringBuilder temp = new StringBuilder(T[i]);
			for(int j=0;j<temp.length();j++)
			{
				
				char c = temp.charAt(j);
				int k = (int)c;
				if(k>=97 && k<123)
				temp.setCharAt(j,str4[k%97]);
			}
			
			out.println("Case #"+(i+1)+": "+temp);
			System.out.println("Case #"+(i+1)+": "+temp);
			
		}
		out.close();
	}
}	
