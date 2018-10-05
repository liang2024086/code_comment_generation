package methodEmbedding.Standing_Ovation.S.LYD632;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandingOvation {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N ; i++){
			sb.append("Case #"+(i+1)+": ");
			String[] str = br.readLine().trim().split(" ");
			int smax = Integer.parseInt(str[0]);
			String values = str[1].trim();
			char []ch = values.toCharArray();
			int count = 0;
			int friends = 0;
			for(int j = 0 ; j <= smax ; j++){
				count += ch[j]-'0';
				if(count<=j){
					count++;
					friends++;
				}
			}
			sb.append(friends+"\n");
		}
		System.out.println(sb);
	}

}
