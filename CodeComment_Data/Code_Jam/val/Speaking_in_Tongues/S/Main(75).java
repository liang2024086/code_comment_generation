package methodEmbedding.Speaking_in_Tongues.S.LYD1369;

import java.io.*;

class Main
{	

public static void main(String a[]) throws Exception
{
	BufferedReader br=new BufferedReader( new InputStreamReader(System.in) );
	
	int testCases=Integer.parseInt(br.readLine());
	String s;
	int count=0;
	for(int i=0;i<testCases;i++)
		{
			s=br.readLine();
			for(int j=0;j<s.length();j++)
				{
					char c=s.charAt(j);
					switch(c)
					{
						case 'a': 
						{
							s=s.substring(0,j)+'y'+s.substring(j+1);
							break;
						}
						case 'b': 
						{
							s=s.substring(0,j)+'h'+s.substring(j+1);
							break;
						}
						case 'c': 
						{
							s=s.substring(0,j)+'e'+s.substring(j+1);
							break;
						}
						case 'd': 
						{
							s=s.substring(0,j)+'s'+s.substring(j+1);
							break;
						}
						case 'e': 
						{
							s=s.substring(0,j)+'o'+s.substring(j+1);
							break;
						}
						case 'f': 
						{
							s=s.substring(0,j)+'c'+s.substring(j+1);
							break;
						}
						case 'g': 
						{
							s=s.substring(0,j)+'v'+s.substring(j+1);
							break;
						}
						case 'h': 
						{
							s=s.substring(0,j)+'x'+s.substring(j+1);
							break;
						}
						case 'i': 
						{
							s=s.substring(0,j)+'d'+s.substring(j+1);
							break;
						}
						case 'j': 
						{
							s=s.substring(0,j)+'u'+s.substring(j+1);
							break;
						}
						case 'k': 
						{
							s=s.substring(0,j)+'i'+s.substring(j+1);
							break;
						}
						case 'l': 
						{
							s=s.substring(0,j)+'g'+s.substring(j+1);
							break;
						}
						case 'm': 
						{
							s=s.substring(0,j)+'l'+s.substring(j+1);
							break;
						}
						case 'n': 
						{
							s=s.substring(0,j)+'b'+s.substring(j+1);
							break;
						}
						case 'o': 
						{
							s=s.substring(0,j)+'k'+s.substring(j+1);
							break;
						}
						case 'p': 
						{
							s=s.substring(0,j)+'r'+s.substring(j+1);
							break;
						}
						case 'q': 
						{
							s=s.substring(0,j)+'z'+s.substring(j+1);
							break;
						}
						case 'r': 
						{
							s=s.substring(0,j)+'t'+s.substring(j+1);
							break;
						}
						case 's': 
						{
							s=s.substring(0,j)+'n'+s.substring(j+1);
							break;
						}
						case 't': 
						{
							s=s.substring(0,j)+'w'+s.substring(j+1);
							break;
						}
						case 'u': 
						{
							s=s.substring(0,j)+'j'+s.substring(j+1);
							break;
						}
						case 'v': 
						{
							s=s.substring(0,j)+'p'+s.substring(j+1);
							break;
						}
						case 'w': 
						{
							s=s.substring(0,j)+'f'+s.substring(j+1);
							break;
						}
						case 'x': 
						{
							s=s.substring(0,j)+'m'+s.substring(j+1);
							break;
						}
						case 'y': 
						{
							s=s.substring(0,j)+'a'+s.substring(j+1);
							break;
						}
						case 'z': 
						{
							s=s.substring(0,j)+'q'+s.substring(j+1);
							break;
						}
						
					}
					
				}
			System.out.println("Case #"+(++count)+": "+s);
		}
}


}
