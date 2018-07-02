package methodEmbedding.Magic_Trick.S.LYD854;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

class  M_TRICK{

	public static void main(String s[]) throws IOException
	{
		System.setIn(new FileInputStream("A-small-attempt0.in"));
		System.setOut(new PrintStream(new FileOutputStream("A-small-attempt0.out")) );
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream output = new BufferedOutputStream(System.out);
		StringBuilder strbldr = new StringBuilder(15000);
		int tcases = Integer.parseInt(br.readLine());
		int k=0;
		while (k++!=tcases) 
		{
			boolean a[]=new boolean[17];
			int m=Integer.parseInt(br.readLine());
			int i=0,j=0;
			for(i=1;i<m;i++)
				br.readLine();
			StringTokenizer stringTokenizer=new StringTokenizer(br.readLine());
			for(j=0;j<4;j++)
				a[Integer.parseInt(stringTokenizer.nextToken())]=true;
			for(i++;i<=4;i++)
				br.readLine();
			int n=Integer.parseInt(br.readLine());
			for(i=1;i<n;i++)
				br.readLine();
			int count=0,num=0;
			stringTokenizer=new StringTokenizer(br.readLine());
			for(j=0;j<4;j++)
			{	
				int p=Integer.parseInt(stringTokenizer.nextToken());
				if(a[p])
				{
					count++;
					num=p;
				}
			}
			for(i++;i<=4;i++)
				br.readLine();
			strbldr.append("Case #").append(k).append(": ");
			if(count==0)
				strbldr.append("Volunteer cheated!\n");
			else if(count==1)
				strbldr.append(num).append("\n");
			else
				strbldr.append("Bad magician!\n");
		}
		output.write(strbldr.toString().getBytes());
		output.flush();
		output.close();
	}
	
}
