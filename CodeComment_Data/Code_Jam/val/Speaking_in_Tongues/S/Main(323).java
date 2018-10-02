package methodEmbedding.Speaking_in_Tongues.S.LYD227;

import java.util.Scanner;


public class Main {

	public static void main(String[] args)
	{
	char []suff = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	Scanner console = new Scanner(System.in);
	int tc = Integer.parseInt(console.nextLine());
	StringBuffer input;
	int i,j=1;
	while(j <= tc )
	{
		input=new StringBuffer(console.nextLine());
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=32)
			input.setCharAt(i,suff[input.charAt(i)-97]);
		}
		System.out.println("Case #"+j+": "+input.toString());
		j++;
	}
	}
	

}
