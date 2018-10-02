package methodEmbedding.Speaking_in_Tongues.S.LYD1224;

import java.util.Scanner;


public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for(int i=0; i<T; i++) {
			String line = in.nextLine();
			char[] lineasb = line.toCharArray();
			for(int j=0; j<lineasb.length; j++) {
				//System.out.print(lineasb[j]);
				switch(lineasb[j]) {
				case 'y' :
					lineasb[j] = 'a';
					break;
				case 'n' :
					lineasb[j] = 'b';
					break;
				case 'f' :
					lineasb[j] = 'c';
					break;
				case 'i' :
					lineasb[j] = 'd';
					break;
				case 'c' :
					lineasb[j] = 'e';
					break;
				case 'w' :
					lineasb[j] = 'f';
					break;
				case 'l' :
					lineasb[j] = 'g';
					break;
				case 'b' :
					lineasb[j] = 'h';
					break;
				case 'k' :
					lineasb[j] = 'i';
					break;
				case 'u' :
					lineasb[j] = 'j';
					break;
				case 'o' :
					lineasb[j] = 'k';
					break;
				case 'm' :
					lineasb[j] = 'l';
					break;
				case 'x' :
					lineasb[j] = 'm';
					break;
				case 's' :
					lineasb[j] = 'n';
					break;
				case 'e' :
					lineasb[j] = 'o';
					break;
				case 'v' :
					lineasb[j] = 'p';
					break;
				case 'z' :
					lineasb[j] = 'q';
					break;
				case 'p' :
					lineasb[j] = 'r';
					break;
				case 'd' :
					lineasb[j] = 's';
					break;
				case 'r' :
					lineasb[j] = 't';
					break;
				case 'j' :
					lineasb[j] = 'u';
					break;
				case 'g' :
					lineasb[j] = 'v';
					break;
				case 't' :
					lineasb[j] = 'w';
					break;
				case 'h' :
					lineasb[j] = 'x';
					break;
				case 'a' :
					lineasb[j] = 'y';
					break;
				case 'q' :
					lineasb[j] = 'z';
					break;
				case ' ':
					break;
				default :
					System.out.println("Failing: " + String.valueOf(lineasb[j]));
					throw new IllegalArgumentException();
				}
				
				//System.out.println(lineasb[j]);
			}
			System.out.print("Case #" + String.valueOf(i+1) + ": ");
			System.out.println(lineasb);
		}
	}
}


