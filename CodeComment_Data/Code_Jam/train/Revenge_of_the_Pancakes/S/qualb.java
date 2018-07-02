package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1098;

import java.util.Scanner;


public class qualb {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0; i<t; i++) {
			String str = s.next();
			String str2="";
			for(int j=0; j<str.length(); j++) {
				str2 += "+";
			}
			int counter=0;
			while(!str.equals(str2)) {
				if(str.charAt(0)=='-') {
					for(int k=0; k<str.length() && str.charAt(k)=='-'; k++) {
						str = str.substring(0,k) + '+' + str.substring(k+1);
					}
				}
				else {
					for(int k=0; k<str.length() && str.charAt(k)=='+'; k++) {
						str = str.substring(0,k) + '-' + str.substring(k+1);
					}
				}
				counter++;
			}
			System.out.println("Case #" + (i+1) + ": " + counter);
		}
	}

}
