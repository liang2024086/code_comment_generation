package methodEmbedding.Counting_Sheep.S.LYD520;

import java.util.*;
public class Main {

	
	public static void main (String[]args){
		Main f = new Main();
		Scanner sc =new Scanner(System.in);
		
		int m = sc.nextInt();
		for(int i =1;i<=m;i++){
			Set set = new HashSet();
			long n = sc.nextLong();
			if(n==0){
				System.out.println("Case #"+i+": INSOMNIA");
			}else {
			long temp=0;
			long number=0;
			while(set.size()!=10){
				temp+=n;
				number = temp;
				while (number > 0) {
				    set.add( number % 10);
				    number = number / 10;
				}
			}
			System.out.println("Case #"+i+": "+temp);
			}
		}
	}
	
}
