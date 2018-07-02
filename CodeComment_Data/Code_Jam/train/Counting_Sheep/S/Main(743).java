package methodEmbedding.Counting_Sheep.S.LYD588;


import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args){
		try{
			int t = 0;
			int n[] = null;
			int count = 0;
			String sCurrentLine = "";
			boolean first = true;
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Vinicius\\Downloads\\A-small-attempt3.in"));
			while ((sCurrentLine = br.readLine()) != null) {
				if (first){
					t = Integer.parseInt(sCurrentLine);
					first = false;
					n = new int[t];
				}
				else{
					n[count++] = Integer.parseInt(sCurrentLine);
				}
				
			}
		
		
		
		
		
		
		String[] resposta = new String[t];
		int final_number = 0;
		for (int round=0;round<t;round++){
			count = 0;
			int[] numbers = new int[]{0,1,2,3,4,5,6,7,8,9};
			for (int i=1;i<=100;i++){
				int num = i * n[round];
				final_number = i * n[round];
				do{
					int value = num % 10;
					num = (int)(num/10);
					count = 0;
					for (int j=0;j<10;j++){
						if (value==numbers[j]){
							numbers[j] = -1;
						}
						if (numbers[j]== -1) count++;
					}
				}while (num!=0);
				if (count==10){
					resposta[round] = Integer.toString(final_number);
					break;
				}
				
			}
			
			if(count!=10){
				resposta[round] = "INSOMNIA";
			}
		}
		for (int i=0;i<t;i++){
			System.out.println("Case #"+Integer.toString(i+1)+": "+resposta[i]);
		}

		}catch (Exception e){e.printStackTrace();}
	}
}
