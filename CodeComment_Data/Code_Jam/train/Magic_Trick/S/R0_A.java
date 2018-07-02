package methodEmbedding.Magic_Trick.S.LYD15;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class R0_A {
	
	public static void main(String[] args) {
		
		try {
		
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			int T = Integer.parseInt(bf.readLine());
			
			for (int i=0; i<T; i++) {
				
				int A1 = Integer.parseInt(bf.readLine());
				int[] row1 = new int[4];
				
				for (int j=0; j<4; j++) {
					String[] strTemp = bf.readLine().split(" ");
					for (int k=0; j==A1-1 &&k<4; k++) {
						row1[k] = Integer.parseInt(strTemp[k]);
					}
				}
				
				int A2 = Integer.parseInt(bf.readLine());
				int[] row2 = new int[4];
				
				for (int j=0; j<4; j++) {
					String[] strTemp = bf.readLine().split(" ");
					for (int k=0; j==A2-1 &&k<4; k++) {
						row2[k] = Integer.parseInt(strTemp[k]);
					}
				}
				
				int count = 0;
				int result = 0;
				for (int x=0; x<4; x++) {
					for (int y=0; y<4; y++) {
						if (row1[x] == row2[y]) {
							count++;
							result = row1[x];
							break;
						}
					}
				}
				
				System.out.print("Case #" + (i+1) + ": ");
				if (count == 0) {
					System.out.print("Volunteer cheated!");
				} else if (count == 1) {
					System.out.print(result);
				} else {
					System.out.print("Bad magician!");
				}
				
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
