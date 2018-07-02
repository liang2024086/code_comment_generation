package methodEmbedding.Counting_Sheep.S.LYD1056;

import java.io.*;
import java.util.*;
class One{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int i=1;i<=T;i++){
			String numStr = in.readLine();
			int num = Integer.parseInt(numStr);
			if(num == 0){
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}

			Map<Character, Boolean> map = new HashMap<>();
			int c = 1;
			outer:for(;;c++){
				numStr = String.valueOf(c * num);
				for(int j=0;j<numStr.length();j++){
					char ch = numStr.charAt(j);
					if(map.containsKey(ch))
						continue;
					else{
						map.put(ch, true);
						if(map.size() == 10)
							break outer;
					}
				}
			}
			System.out.println("Case #" + i + ": " + (c * num));
		}
	}
}
