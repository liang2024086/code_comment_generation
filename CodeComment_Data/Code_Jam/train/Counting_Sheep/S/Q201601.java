package methodEmbedding.Counting_Sheep.S.LYD1691;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q201601 {
	boolean[] check = new boolean[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numOfCase = scanner.nextInt();
		//scanner.nextLine();
		for(int i=1;i<=numOfCase;i++) {
			int input = scanner.nextInt();
			if(input==0) {
				System.out.println("Case #"+i+": "+"INSOMNIA");
				continue;
			}
			BigDecimal base = new BigDecimal(input);
			BigDecimal input1 = new BigDecimal(input);
			BigDecimal temp = new BigDecimal(input);
			boolean[] check = new boolean[10];
			BigDecimal ten = new BigDecimal(10);
			BigDecimal zero = new BigDecimal(0);
			boolean finish = false;
			
			while(!finish) {
				temp = input1;
				while(temp.compareTo(BigDecimal.ONE)>=0) {
					check[temp.remainder(ten).intValue()] = true;
					temp = temp.divide(ten);
				}
				for(int j=0;j<10;j++) {
					if(!check[j])
						break;
					if(j==9) {
					System.out.println("Case #"+i+": "+input1.toString());
					finish=true;
					}
				
				}
				input1 = input1.add(base);
			
			}
		}
	}

}
