package methodEmbedding.Magic_Trick.S.LYD678;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CodeJamA {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int k = 1; k <= t; k++){
			int r = Integer.parseInt(br.readLine());
			boolean[] check = new boolean[16];
			for(int i = 1; i <= 4; i++){
				String line = br.readLine();
				if(i == r){
					StringTokenizer st = new StringTokenizer(line);
					while(st.hasMoreTokens()){
						check[Integer.parseInt(st.nextToken()) - 1] = true;
					}
				}
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			r = Integer.parseInt(br.readLine());
			for(int i = 1; i <= 4; i++){
				String line = br.readLine();
				if(i == r){
					StringTokenizer st = new StringTokenizer(line);
					while(st.hasMoreTokens()){
						int num = Integer.parseInt(st.nextToken());
						if(check[num - 1]){
							al.add(num);
						}
					}
				}
			}
			System.out.printf("Case #%d: ",k);
			if(al.size() == 1){
				System.out.println(al.get(0));
			}
			else if(al.size() == 0){
				System.out.println("Volunteer cheated!");
			}
			else{
				System.out.println("Bad magician!");
			}
		}

	}
}
