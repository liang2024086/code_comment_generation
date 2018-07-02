package methodEmbedding.Standing_Ovation.S.LYD1025;

import java.util.Scanner;


public class Audience {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		int tot,res;
		for (int i=0;i<len;i++)
		{
			tot=0;
			res=0;
			int k=sc.nextInt();
			String s =sc.next();
			for (int j=0;j<k+1;j++)
			{
				while (s.charAt(j)=='0') j++;
				if (j>tot)
				{
					res+=j-tot;
					tot+=res;
				}
				tot+=s.charAt(j)-'0';
			}
			System.out.println("Case #"+(i+1)+": "+res);
		}
	}

}
