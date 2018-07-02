package methodEmbedding.Counting_Sheep.S.LYD1144;

import java.util.*;
import java.lang.*;
import java.io.*;

class firstProb
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		int count = 1;
		while(count <= t){
			int num = sc.nextInt();
			if(num == 0){
				System.out.println("Case #"+count+": INSOMNIA");
			}else{
				Set<Integer> set = new HashSet<Integer>();
				int i = 1, temp = 0;
				while(set.size() != 10){
					temp = num * (i++);
					while(temp > 0){
						set.add(temp % 10);
						temp = temp / 10;
					}
				}
				System.out.println("Case #"+count+": "+num * (i-1));
			}
			count++;
		}
	}
}
