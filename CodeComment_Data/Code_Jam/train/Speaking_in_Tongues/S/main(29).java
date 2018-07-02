package methodEmbedding.Speaking_in_Tongues.S.LYD1318;


import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < n ; i++) {
			char[] tmp = in.nextLine().toCharArray();
			for(int j = 0; j < tmp.length; j++) {
				if(tmp[j] == ' ')
					tmp[j] = ' ';
				else
					tmp[j] = (map[tmp[j] - 'a']);
			}
			System.out.println("Case #"+(i+1)+": " + new String(tmp));
		}

	}

}
