package methodEmbedding.Magic_Trick.S.LYD280;

import java.io.*;
 
public class MagicTrick{   
	
    public static void main(String[] args){
		int T;  
		String[] in;
		
		try{
			FileReader fr = new FileReader("A-small-attempt0.in");
			BufferedReader br = new BufferedReader(fr);
			T = Integer.parseInt(br.readLine());   
			
			int[][][] D = new int[2*T][4][4];
			int[] A = new int[2*T];

			for (int i = 0; i < 2*T; i++){
				A[i] = Integer.parseInt(br.readLine());  
				for (int j = 0; j < 4; j++){
					in = (br.readLine()).split(" ");
					for (int k = 0; k < 4; k++){
						D[i][j][k] = Integer.parseInt(in[k]);
					}
				}
			}
			br.close();

			FileWriter fw = new FileWriter("A-small-attempt0.out");
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < T; i++){
				int[] V1 = new int[4];
				int[] V2 = new int[4];
				int res = 0;
				int ans = 0;

				for (int j = 0; j < 4; j++){
					V1[j] = D[2*i][A[2*i]-1][j];
					V2[j] = D[2*i+1][A[2*i+1]-1][j];
				}

				for (int m = 0; m < 4; m++){
					for (int n = 0; n < 4; n++){
						if (V1[m] == V2[n]){
							res++;
							ans = V1[m];
						}
					}
				}

				if (res == 0){
					bw.write("Case #"+(i+1)+": "+"Volunteer cheated!");
				} else if (res == 1){
					bw.write("Case #"+(i+1)+": "+ans);
				} else if (res > 1){
					bw.write("Case #"+(i+1)+": "+"Bad magician!");
				}

				if ((i+1) < T){
					bw.newLine();
				}

			}
			bw.close();

		}
		catch(FileNotFoundException ex){
			System.out.println("File not found.");
		}
		catch(IOException ex){
			System.out.println("IO Error");
		}    
    }    
}
