package methodEmbedding.Counting_Sheep.S.LYD1086;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class CountingSheep {
	public static void main(String[] args){
		String arg = args[0];
		Scanner s = null;
		try {
			s = new Scanner(new File(arg));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int numberOfCases = s.nextInt();
		for(int i=1;i<=numberOfCases;i++){
			int initialNumber = s.nextInt();
			List<Integer> allNumbers = new ArrayList<Integer>(); 
			int sum = 0;
			int k = 2;
			int newNumber = initialNumber;
			if(initialNumber == 0){
				System.out.println("Case #"+ String.valueOf(i) + ": "+"INSOMNIA");
				continue;
			}
			while(true){
				
				do{
					if(!allNumbers.contains(newNumber%10)){
						allNumbers.add(newNumber%10);
						
					}
					newNumber /= 10;
				}while(newNumber >= 1);
				
				for(Integer j : allNumbers){
					sum = sum + j;
				}
				
				if(sum == 45 && allNumbers.size() == 10){
					System.out.println("Case #"+ String.valueOf(i) + ": " + String.valueOf(initialNumber *(k-1)));
					break;
				}
				newNumber = initialNumber * k;
				k++;
				sum = 0;
			
			}
		}
	}
}
