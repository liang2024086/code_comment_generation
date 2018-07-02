package methodEmbedding.Standing_Ovation.S.LYD1881;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Normal 
{
	public static void main(String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pr = new PrintWriter(System.out);
	int t = Integer.parseInt(br.readLine());
	int test =1;
	while(test<=t)
	{
		String str[] = br.readLine().split(" ");
		int count=0,lack=0;
		if(str[1].charAt(0)==0)
		{	lack++;
		}
		count += str[1].charAt(0) - 48;
		for(int i=1;i<str[1].length();i++)
		{
			if(count<i)
				{
					lack++;
					count += i - count;
				}
			count = count + str[1].charAt(i) -48;
		}
		pr.println("Case #"+test+": "+lack);
		test++;
	}
	pr.close();
	}
	}
