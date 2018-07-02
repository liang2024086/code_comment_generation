package methodEmbedding.Counting_Sheep.S.LYD168;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Sheeps {

	public static void main(String[] args)throws FileNotFoundException{
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new File("A-small-attempt2.in"));
		int T = scan.nextInt();
		scan.nextLine();
		int test = 0;
		while(test < T){
			long N = scan.nextLong();
			int i = 1;
			boolean[] Nbool = new boolean[10];
			int Ncount = 0;
			long val = N;
			boolean isInsomnia = false;
			
			HashSet<Long> set = new HashSet<Long>(); 
			while(Ncount < 10 && !isInsomnia){
				val = i * N;
				if(set.add(val)){
					long num = val;
					while(num > 0 && Ncount < 10){
						long r = num % 10;
						if (!Nbool[(int)r]){
							Nbool[(int)r] = true;
							Ncount++;
						}
						num = num/10;
					}
					i++;
				}
				else{
					isInsomnia = true;
				}
			}
			if(isInsomnia){
				System.out.println("Case #"+(test+1)+": INSOMNIA");
			}
			else{
				System.out.println("Case #"+(test+1)+": " + val);
			}
			test++;
		}
		
	}
}
