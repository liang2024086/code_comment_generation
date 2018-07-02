package methodEmbedding.Revenge_of_the_Pancakes.S.LYD908;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q201602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numOfCase = scanner.nextInt();
		scanner.nextLine();
		for(int i=1;i<=numOfCase;i++) {
			String input = scanner.nextLine();
			int result ;
			if(!input.contains("-")){
				System.out.println("Case #"+i+": 0");
				continue;
			}
			if(!input.contains("+")){
				System.out.println("Case #"+i+": 1");
				continue;
			}
			char[] splits = input.toCharArray();
			int numOfPattern = splits[0]=='-'?1:0;
			boolean isPlus = splits[0]=='+'?true:false;
			for(char ch : splits) {
				if(ch=='+' && isPlus) {
					continue;
				}
				if(ch=='-' && !isPlus) {
					continue;
				}
				if(ch=='+') isPlus=true;
				if(ch=='-') {numOfPattern+=2;isPlus=false;}
			}
			result = numOfPattern;

			System.out.println("Case #"+i+": "+result);
		}
	}
}


