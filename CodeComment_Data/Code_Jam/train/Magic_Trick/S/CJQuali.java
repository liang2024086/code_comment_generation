package methodEmbedding.Magic_Trick.S.LYD2092;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class CJQuali {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("ans.txt"));
		int T = Integer.parseInt(br.readLine()); 
		HashSet<Integer> hm = new HashSet<Integer>();
		for(int i = 0; i < T; i++){
			hm.clear();
			int m = Integer.parseInt(br.readLine());
			System.out.println(m);
			for(int j = 1; j <= 4; j++){
				String[] tmpArray = br.readLine().split(" ");
				for(int k = 0; k < 4; k++){
					int tmp = Integer.parseInt(tmpArray[k]);
					if(j == m)
						hm.add(tmp);
				}
			}
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			int result = 0;
			for(int j = 1; j <= 4; j++){
				String[] tmpArray = br.readLine().split(" ");
				for(int k = 0; k < 4; k++){
					int tmp = Integer.parseInt(tmpArray[k]);
					if(j == n){
						if(hm.contains(tmp)){
							count++;
							result = tmp;
						}
					}
				}
			}
			if(count == 0){
				bw.write("Case #" + (i+1) + ": " + "Volunteer cheated!\n");
			}
			else if(count > 1){
				bw.write("Case #" + (i+1) + ": " + "Bad magician!\n");
			}
			else{
				bw.write("Case #" + (i+1) + ": " + result +"\n");
			}
		}
		br.close();
		bw.close();
		
	}
}
