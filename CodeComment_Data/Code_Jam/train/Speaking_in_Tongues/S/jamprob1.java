package methodEmbedding.Speaking_in_Tongues.S.LYD1325;

import java.io.*;
class jamprob1
{
	public static void main(String args[])throws IOException
	{
		FileWriter fw=new FileWriter("OutJam1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		FileReader fr=new FileReader("jam1.txt");
		BufferedReader br=new BufferedReader(fr);
		int T=Integer.parseInt(br.readLine());
		String str;
		int k=1;
		int i=0;
		int ch=0;
		char inparr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char outarr[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		while(T>0)
		{
			i=0;
			str=br.readLine();
			pw.print("Case #");
			pw.print(k);
			pw.print(": ");
			while(i<str.length())
			{
				ch=str.charAt(i);
				if(ch==32)
				pw.print(' ');
				else
				pw.print(outarr[ch-97]);
				i++;
			}
			pw.println();
			T--;
			k++;
		}
		pw.close();
		br.close();
	}
}
