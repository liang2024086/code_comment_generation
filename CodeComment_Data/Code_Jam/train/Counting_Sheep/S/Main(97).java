package methodEmbedding.Counting_Sheep.S.LYD1271;

import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		for(int i=0; i<Integer.parseInt(args[0]); i++) {
			System.out.print("Case #"+(i+1)+": ");
			int n = Integer.parseInt(args[i+1]);
			
			LinkedList<Integer> numbers = new LinkedList<Integer>();
			for(int j=0; j<10; j++) {
				numbers.add(j);
			}
			
			int cont=1, number, digit = 0, aftNum = 0;
			boolean insomnia = true;
			while(!numbers.isEmpty() && cont<(200)) {
				number = cont*n;
				aftNum = number;
				while(number!=0) {
					digit = number % 10;
					numbers.remove((Object)digit);
					number /= 10;
				}
				insomnia = !numbers.isEmpty();
				cont++;
			}
			
			if(!insomnia) {
				System.out.println(aftNum);
			} else {
				System.out.println("INSOMNIA");
			}
		}
	}

}
