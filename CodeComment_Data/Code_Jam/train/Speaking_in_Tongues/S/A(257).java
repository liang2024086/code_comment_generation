package methodEmbedding.Speaking_in_Tongues.S.LYD609;

import java.io.*;
public class A 
{
	public static void main(String[] argv) throws IOException
	{
		String[] arr = {"y","h","e","s","o","c","v","x","d","u","i","g","l","b","k","r","z","t","n","w","j","p","f","m","a","q"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer result = new StringBuffer();
		int num = Integer.parseInt(br.readLine());
		for(int i=0 ; i<num ; i++)
		{
			String str = br.readLine();
			for(int j=0 ; j<str.length() ; j++)
			{
				try
				{
					int now = str.charAt(j)-'a';
					result.append(arr[now]);
				}
				
				catch(ArrayIndexOutOfBoundsException e)
				{
					result.append(" ");
				}
			}
			
			System.out.println("Case #" + (i+1) + ": " + result);
			result.delete(0,result.length());
		}
	}
}
