package methodEmbedding.Standing_Ovation.S.LYD493;

import java.util.Scanner;
import java.io.File;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("input4.txt");
		try{
			Scanner in = new Scanner(file);
			int T;
			T = in.nextInt();
			int[][] data = new int[T][2];
			for(int i= 0 ; i < T ; i++){
				data[i][0] = in.nextInt();
				data[i][1] = in.nextInt();
			}
			for(int i = 0 ; i < T ; i++){
				System.out.print("Case #" + (i+1) +": ");
				int ans = 0;
				int temp = 0;
				for(int k = data[i][0] ; k >=0 ; k--){
					//System.out.print(temp);
					if( temp < data[i][0] - k ){
						ans++;
						temp++;
					}
					temp += data[i][1] / (int)Math.pow(10,k);
					data[i][1] = data[i][1] % (int)Math.pow(10,k);
				}
				System.out.println(ans);
				
			}
		} catch(Exception e){
			System.out.println("e");
		}
	}

}
