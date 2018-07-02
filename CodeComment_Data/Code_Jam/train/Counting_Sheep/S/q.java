package methodEmbedding.Counting_Sheep.S.LYD1386;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class q {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int t = Integer.parseInt(br.readLine());
	for(int l = 1;l<=t;l++)
	{
		long  n = Long.parseLong(br.readLine());
		String a = n+"";
		boolean s[] = new boolean[10];
		long i = 1;
		if(n==0)
		{
			bw.write("Case #"+l+": INSOMNIA"+"\n");
			bw.flush();
			continue;
		}
		long g = n;
		while(true)
		{//System.out.println(i);
			g = n*i;
			a = g+"";
			for(int j = 0;j<a.length();j++)
			{
				s[a.charAt(j)-48]=true;
			}
			boolean k = false;
			for(int j = 0;j<10;j++)
			{
              if(s[j]==false)
              {
                  k=true;
            	  break;
              }}
           if(k==false)
           {
        	   break;
           }
           i++;
              }
		
		bw.write("Case #"+l+": "+g+"\n");
		bw.flush();
		
		}
	}
}
