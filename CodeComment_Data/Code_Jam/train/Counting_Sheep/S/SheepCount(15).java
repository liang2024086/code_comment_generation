package methodEmbedding.Counting_Sheep.S.LYD515;

import java.util.*;

public class SheepCount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in) ;
		
		int N = sc.nextInt() ;
		
		for(int i = 0  ; i < N ; i ++){
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int j = 0 ;j < 10 ; j ++)
				arr.add(j) ;
				
			int M = sc.nextInt() ;
			boolean found = false;
			if(M == 0)
				System.out.println("Case #1: INSOMNIA") ;
			else{
				int count = 1 ;
				int V = M ;
				app: while(arr.size() > 0){
					int m = V  ;
					while(m > 0){
						int r = m % 10 ;
						int index = arr.indexOf(r) ;
						if(index != -1)
							arr.remove(index);
						m = m / 10 ;
						if(arr.size() == 0){
							System.out.println("Case #"+(i+1)+": "+V);
							break app;
						}						
					}
					count ++ ;
					V = count * M;
				}								
			}		
		}
	}
}
