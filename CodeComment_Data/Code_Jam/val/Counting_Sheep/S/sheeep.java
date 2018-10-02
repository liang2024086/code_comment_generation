package methodEmbedding.Counting_Sheep.S.LYD1269;

import java.math.BigInteger;
import java.util.Scanner;

public class sheeep {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int q=1; q<=cases; q++){
			System.out.print("Case #"+q+": ");
			boolean[] seen = new boolean[10];
			BigInteger num = new BigInteger(in.next());
			if(num.intValue()!=0){
				BigInteger sum = new BigInteger("0");
				while(true){
					sum=sum.add(num);
					for(char c : sum.toString().toCharArray()){
						seen[c-'0']=true;
					}
					boolean done = true;
					for(int i =0; i<10; i++){
						if(!seen[i]){
							done = false;;
						}
					}
					if(done){
						break;
					}
				}
				System.out.println(sum.toString());
			}
			else{
				System.out.println("INSOMNIA");
			}
		}
	}
}
