package methodEmbedding.Counting_Sheep.S.LYD566;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int liczbaProb = sc.nextInt();
		for(int licznik=1;licznik<=liczbaProb;licznik++){
			System.out.print("CASE #" +licznik + ": ");
			Integer N = sc.nextInt();
				if(N!=0){
					Integer n = N.intValue();
					char[] nTab;
					SortedSet<Integer> set = new TreeSet<>();		
					int i=0;
					
					while(true){
						nTab = n.toString().toCharArray();
						
						for(char a: nTab)
							set.add(Integer.valueOf(a));
						
						if(set.size()==10)
							break;
						
						i++;
						n=N*(i+1);
						
					}
					
					System.out.println(n);
				}
				else{
					System.out.println("INSOMNIA");
				}
		}
	}
}
