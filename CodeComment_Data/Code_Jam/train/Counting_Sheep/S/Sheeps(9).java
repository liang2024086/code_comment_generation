package methodEmbedding.Counting_Sheep.S.LYD1313;

import java.util.*;

public class Sheeps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int i=0;i<N;i++){
			int x = in.nextInt();
			if (x==0){
				System.out.println("Case #"+(i+1)+": "+"INSOMNIA");
			}
			else{
				int counter = 0;
				List<Integer> numbers = new ArrayList<Integer>();
				for (int j = 0; j < 10; j++) {
					  numbers.add(0);
				}
				int result=x;
				while (counter<10){
					int y = result;
					while (y > 0) {
					    int temp = y%10;
					    if (numbers.get(temp)!=1){
					    	numbers.set(temp, 1);
					    	counter++;
					    }
					    y = y / 10;
					}
					//System.out.println(result);
					if (counter==10){
						System.out.println("Case #"+(i+1)+": "+result);
					}
					result+=x;
				}
			}
		}

	}

}
