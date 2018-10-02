package methodEmbedding.Speaking_in_Tongues.S.LYD1396;

import java.io.*;
public class Speaking {
    
    public static void main(String[] args) {
        
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int count;
	char c;
	String out;
	String[] intake;
	char[] output;	
	char[] input=new char[26];
	char[] output_ref=new char[] {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	
	try
	{

		for(int i=1;i<26;i++)
			input[i]=(char)(97+i);

		count=Integer.parseInt(br.readLine());
		intake =new String[count];
		
		for(int i=0;i<count;i++)
			intake[i]=br.readLine();

	
		for(int i=0;i<count;i++)
		{
			output=new char[intake[i].length()];
		
			for(int j=0;j<intake[i].length();j++)
			{
				c=intake[i].charAt(j);
				if(c==' ')
				{
					output[j]=' ';
					continue;
				}
				
				output[j]=output_ref[((int)c-97)];
						
			}
			
			out=new String(output);
			System.out.println("Case #"+(i+1)+": "+out);
		}

		
		

		
	}
	catch(Exception e)
	{
		System.out.println("PROBLEM !!!  " +e.getMessage());
	}
	
    }
}
