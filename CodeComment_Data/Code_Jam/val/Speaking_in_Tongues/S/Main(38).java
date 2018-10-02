package methodEmbedding.Speaking_in_Tongues.S.LYD88;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static char [] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input"));
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		for(int i = 1; i <= n; i++)
		{
			String l = s.nextLine();
			System.out.print("Case #"+i+": ");
			for(int j = 0; j < l.length(); j++)
			{
				if(l.charAt(j) == ' ') System.out.print(" ");
				if(l.charAt(j)>='a' &&  l.charAt(j) <='z')
					System.out.print(map[l.charAt(j) - 'a']);
			}
			System.out.println();
		}
	}

}
