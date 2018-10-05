package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1084;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		for (int z=1;z<=t;z++){
			String n = in.next();
			int ans = 0;
			n = n.replace("+","1");
			n = n.replace("-","0");
			String[] sl = n.split("");
			List<String> wordList = new LinkedList<String>(Arrays.asList(sl));
			int ws = wordList.size();

			for (int i = ws - 1;0<=i;i--){
				if (wordList.get(i).equals("1")){
					wordList.remove(i);
					continue;
				}
				break;
			}

			if (wordList.size() == 1){
				ans += (1-Integer.valueOf(wordList.get(0)));
			} else if (wordList.size() != 0){
				String tmpA = "0";
				ans++;
				for (int i = wordList.size()-1;0<=i;i--){
					if ( tmpA.equals(wordList.get(i))){
						continue;
					}
					tmpA = wordList.get(i);
					ans++;
				}
			}



			System.out.println("Case #" + z + ": " + ans);
		}
	}

}
