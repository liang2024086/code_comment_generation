package methodEmbedding.Counting_Sheep.S.LYD987;

import java.util.Scanner;


public class CountingSheep {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[] cases = new int[t];
		
		for(int i = 0; i < t; i++){
			cases[i] = sc.nextInt();
		}
		
		for(int i = 0; i < t; i++){
			boolean[] sleep = new boolean[]{false, false, false, false, false, false, false, false, false, false};
			boolean isSleeping = false;
			
			int val = cases[i];
			
			if(val != 0){
				
				while(!isSleeping){
					
					for(int j = 0; j < String.valueOf(val).length(); j++){
						if(String.valueOf(val).charAt(j) == '0'){
							sleep[0] = true;
						}else if(String.valueOf(val).charAt(j) == '1'){
							sleep[1] = true;
						}else if(String.valueOf(val).charAt(j) == '2'){
							sleep[2] = true;
						}else if(String.valueOf(val).charAt(j) == '3'){
							sleep[3] = true;
						}else if(String.valueOf(val).charAt(j) == '4'){
							sleep[4] = true;
						}else if(String.valueOf(val).charAt(j) == '5'){
							sleep[5] = true;
						}else if(String.valueOf(val).charAt(j) == '6'){
							sleep[6] = true;
						}else if(String.valueOf(val).charAt(j) == '7'){
							sleep[7] = true;
						}else if(String.valueOf(val).charAt(j) == '8'){
							sleep[8] = true;
						}else if(String.valueOf(val).charAt(j) == '9'){
							sleep[9] = true;
						}
					}
					
					
					isSleeping = true;
					for(int j = 0; j < sleep.length; j++){
						if(!sleep[j]){
							isSleeping = false;
						}
					}
					
					if(!isSleeping){
						val += cases[i];
					}
				}
				System.out.println("Case #" + (i+1) + ": " + val);
			}else{
				System.out.println("Case #" + (i+1) + ": INSOMNIA");
			}
		}
		

	}

}
