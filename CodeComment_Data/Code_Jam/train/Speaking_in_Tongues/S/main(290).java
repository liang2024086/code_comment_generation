package methodEmbedding.Speaking_in_Tongues.S.LYD1612;

import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		char[] google_launguage={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		int n=input.nextInt();
		input.nextLine();
		System.out.println();
		//	System.out.println(google_launguage.length);
		for(int i=1;i<=n;i++)
		{
			String google_text="";
			String english_text=input.nextLine();
			for(int j=0;j<english_text.length();j++)
			{
				if(english_text.charAt(j)!=' ')
				{
					int index=(int)english_text.charAt(j);
					google_text+=google_launguage[index-97];
				}
				else
					google_text+=" ";
			}
			System.out.println("Case #"+i+": "+google_text);
		}
	}

}
