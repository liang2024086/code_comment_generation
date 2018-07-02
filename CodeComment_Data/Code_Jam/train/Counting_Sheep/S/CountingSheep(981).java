package methodEmbedding.Counting_Sheep.S.LYD10;

import java.util.Scanner;

public class CountingSheep {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int dataset = reader.nextInt();
		reader.nextLine();
				
		for (int i=0; i<dataset; i++){
			//get input
			long number = reader.nextLong();

			String digitcheck = "0123456789";
			
			int increment = 1;
			long total = 0;
			if (number == 0){
				System.out.println("Case #"+(i+1)+": "+"INSOMNIA");
			} else{
				while (!digitcheck.equals("----------")){
					total = number * increment;
					String totalstr = String.valueOf(total);
					for (int j=0; j<totalstr.length(); j++){
						digitcheck = digitcheck.replace(totalstr.charAt(j), '-');
					}		
					increment++;
				}
				System.out.println("Case #"+(i+1)+": "+total);				
			}

		}
				
	}
}
