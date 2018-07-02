package methodEmbedding.Counting_Sheep.S.LYD1483;

import java.io.*;
import java.util.*;

public class codejam1 {
	
	
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("A-small-attempt2.in");
//    	Scanner sc = new Scanner(System.in);
    	Scanner sc = new Scanner(file);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			HashSet<Integer> set = new HashSet<>();
			int temp = a[i];
			if (temp == 0) {
				System.out.println("Case #" +(i +1) + ": " +"INSOMNIA");
				continue;
			}
			 while (set.size() != 10){
				int x = a[i];
				while (a[i] > 0){
					set.add(a[i] % 10);
					a[i] /= 10;
				}
				if(set.size() == 10) System.out.println("Case #" +(i +1)+ ": " +x);
				a[i] = x + temp;
			}
		}
    	
    
    }
}
