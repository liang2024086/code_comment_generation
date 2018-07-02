package methodEmbedding.Standing_Ovation.S.LYD2033;

import java.util.Scanner;
import java.io.File;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("input5.txt");
		try{
			Scanner in = new Scanner(file);
			int T;
			T = in.nextInt();
			int[] shyness = new int[T];
			String[] data = new String[T];
			int index = 0;
			while(index < T){
				shyness[index] = in.nextInt();
				data[index] = in.next();
				index++;
			}

			for(int i = 0 ; i < T ; i++){
				System.out.print("Case #" + (i+1) +": ");
				int ans = 0;
				int temp = 0;
				for(int k = shyness[i] ; k >=0 ; k--){
					if( temp < shyness[i] - k ){
						ans++;
						temp++;
					}
					temp += Integer.parseInt(data[i].substring(shyness[i] - k, shyness[i] - k+1));
				}
				System.out.println(ans); 
				
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}

}
