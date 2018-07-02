package methodEmbedding.Counting_Sheep.S.LYD502;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		for(int i=1;i<=T;i++){
			int N=scan.nextInt();
			Set<String> set=new HashSet<String>();
			boolean check=false;
			int j=1;
			int Num=N;
			String number = String.valueOf(Num);
			while (set.size()<10) {
				if(Num==0){
					number="INSOMNIA";
					break;
				}
				Num=j*N;
				j++;
				number = String.valueOf(Num);
				String[] digits = number.split("(?<=.)");
				List<String> dig = Arrays.asList(digits) ;
				set.addAll(dig);
			}
			System.out.print("Case #"+i+": "+number+"\n");
		}
	}
}
