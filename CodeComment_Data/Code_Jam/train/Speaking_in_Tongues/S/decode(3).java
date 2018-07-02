package methodEmbedding.Speaking_in_Tongues.S.LYD1448;

import java.util.Scanner;


public class decode {
	public static String[] alph = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static String[] sub = {"y","n","f","i","c","w","l","b","k","u","o","m","x","s","e","v","z","p","d","r","j","g","t","h","a","q"};
	
	public static void main(String... args){
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		in.nextLine();
		String[] decoded = new String[cases];
		for(int i = 0;i<cases;i++){
			String line = in.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int k = 0;k<line.length();k++){
				for(int j = 0;j<26;j++){
					if(String.valueOf(line.charAt(k)).equals(" ")){
						sb.append(" ");
						break;
					}
					else if(String.valueOf(line.charAt(k)).equals(sub[j])){
						sb.append(alph[j]);
					}
				}
			}
			decoded[i] = sb.toString();
		}
		for(int i = 0;i<cases;i++){
			System.out.printf("Case #%d: "+decoded[i]+"\n",i+1);
		}
	}
}
