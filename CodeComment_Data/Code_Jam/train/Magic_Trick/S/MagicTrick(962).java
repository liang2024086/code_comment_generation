package methodEmbedding.Magic_Trick.S.LYD727;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MagicTrick {
	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		int cases = Integer.parseInt(br.readLine());
		for(int i =0; i<cases; i++){
			int[] counts = new int[16];
			int row = Integer.parseInt(br.readLine());
			for(int j=1; j<=4; j++){
				String[] info = br.readLine().split(" ");
				if(j==row){
					for(int k=0; k<4; k++){
						counts[Integer.parseInt(info[k])-1]++;
					}
				}
			}
			int row2 = Integer.parseInt(br.readLine());
			for(int j=1; j<=4; j++){
				String[] info = br.readLine().split(" ");
				if(j==row2){
					for(int k=0; k<4; k++){
						counts[Integer.parseInt(info[k])-1]++;
					}
				}
			}
			int matches = 0;
			int target = -1;
			for(int j=0; j<16; j++){
				if(counts[j]==2){
					matches++;
					target = j;
				}
			}
			System.out.print("Case #" + (i+1) + ": ");
			if(matches==0){
				System.out.println("Volunteer cheated!");
			}else if(matches>1){
				System.out.println("Bad magician!");
			}else{
				System.out.println(target+1);
			}
			
		}

	}
}
