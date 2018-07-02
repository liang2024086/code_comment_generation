package methodEmbedding.Counting_Sheep.S.LYD1104;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=0;
		N=sc.nextInt();
		int M=0;
		for(int k=1;k<=N;k++){
			M=sc.nextInt();
			if(M==0){
				System.out.println("Case #"+k+": INSOMNIA");
				continue;
			}
			HashSet set=new HashSet<Integer>();
			int count=1;
			int tempNum=1;
			while(set.size()<10){
				tempNum=M*count++;
				String tempStr=String.valueOf(tempNum);
				char[] tempArray=tempStr.toCharArray();
				for(int i=0;i<tempArray.length;i++){
					set.add(tempArray[i]);
				}
			}
			System.out.println("Case #"+k+": "+tempNum);
		}
	}
}
