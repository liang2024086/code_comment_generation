package methodEmbedding.Speaking_in_Tongues.S.LYD570;

import java.util.Scanner;


public class SiT {

	static String a = " yhesocvxduiglbkrztnwjpfmaq";
	static String b = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		for (int k = 0; k<n; k++)
		{
			String input = sc.nextLine();
			int l = input.length();
			System.out.print("Case #" + (k+1) + ": ");
			for (int i =0; i<l; i++)
				if (input.charAt(i) != ' ')
					System.out.print(a.charAt(input.charAt(i)-96));
				else System.out.print(input.charAt(i));
			System.out.println();
		}
	}

}
