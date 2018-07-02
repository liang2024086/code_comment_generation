package methodEmbedding.Counting_Sheep.S.LYD919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int counter = 0;
		
		for(int i = 0; i < t; i++){
			counter++;
			String numstr = "INSOMNIA";
			int start_num = sc.nextInt();
			int n = 0;
			if(start_num != 0){
				ArrayList<String> list = new ArrayList<>();
				for(int j=0; j<10; j++){
					String jstr = String.valueOf(j);
					list.add(jstr);
				}
				while(list.size() > 0){
					n = n + start_num;
					numstr = String.valueOf(n);
					for(int k = 0; k<numstr.length(); k++){
						String thisNum = numstr.substring(k,  k+1);
						if(list.contains(thisNum)){
							list.remove(thisNum);
						}
					}
				}
			}
			System.out.println("Case #" + counter +": " + numstr);
			
		}
			
		
		sc.close();
	}
	

}
