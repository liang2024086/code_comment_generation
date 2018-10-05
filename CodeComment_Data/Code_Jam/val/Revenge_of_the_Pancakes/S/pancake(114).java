package methodEmbedding.Revenge_of_the_Pancakes.S.LYD588;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pancake {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int t = Integer.parseInt(br.readLine());
	for(int r = 1;r<=t;r++)
	{
		String st = br.readLine(); 
		int l =-1;
		for(int i = st.length()-1;i>=0;i--)
		{
		   if(st.charAt(i)=='-')
		   {
			   l = i;
			   break;
		   }

 	}  
		
		long ans = 0;
		if(l>=0)
			ans = 1;
		for(int i = l-1;i>=0;i--)
	    {
			if(st.charAt(i)!=st.charAt(i+1))
			{
				ans++;
			}
	    }
		bw.write("Case #"+r+": "+ans+"\n");
		bw.flush();
}

}
}
