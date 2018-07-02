package methodEmbedding.Magic_Trick.S.LYD713;

import java.io.*;

class magic{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t, ans1, ans2, tc=1, i,j, count, matchPos;
		String[] line;
		String res;
		int [] values1 = new int[4];
		int [] values2 = new int[4];
		t = Integer.parseInt(br.readLine());
		while(tc <= t){
			ans1 = Integer.parseInt(br.readLine());
			for(i=1;i<=4;i++){
				line = br.readLine().split(" ");
				if(i==ans1){
					for(j=0; j<4; j++){
						values1[j] = Integer.parseInt(line[j]);
					}
				}
			}
			ans2 = Integer.parseInt(br.readLine());
			for(i=1;i<=4;i++){
				line = br.readLine().split(" ");
				if(i==ans2){
					for(j=0; j<4; j++){
						values2[j] = Integer.parseInt(line[j]);
					}
				}
			}
			count=0;
			matchPos=0;
			for(i=0;i<4;i++){
				for(j=0;j<4;j++){
					if(values1[i]==values2[j]){
						matchPos = j;
						count++;
					}
				}
			}
			if(count == 1)
				res = values2[matchPos] + "";
			else if( count== 0)
				res = "Volunteer cheated!";
			else
				res = "Bad magician!";
			System.out.println("Case #" + tc + ": " + res);
			tc++;
		}
	}
	
}
