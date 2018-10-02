package methodEmbedding.Speaking_in_Tongues.S.LYD164;


import java.util.Scanner;

public class Mapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] table = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		char temp[];
		int len,ch;
		for(int i=0;i<T;i++)
		{
			temp = sc.nextLine().toCharArray();
			len = temp.length;
			for(int c = 0; c < len; c++)
			{
				ch = temp[c];
				if(ch != 32)
					temp[c] = table[ch-97];
			}
			System.out.println("Case #"+(i+1)+": "+new String(temp));
		}
	}

}
