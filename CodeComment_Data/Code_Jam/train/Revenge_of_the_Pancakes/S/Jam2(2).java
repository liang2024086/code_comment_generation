package methodEmbedding.Revenge_of_the_Pancakes.S.LYD293;

import java.util.Scanner;

public class Jam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<t;i++){
			char arr[]=scan.nextLine().toCharArray();
			char last=arr[0];
			long ans=0;
			for(int j=1;j<arr.length;j++){
				if(last!=arr[j]){
					if(last=='+')
						last='-';
					else
						last='+';
					ans++;
				}
			}
			if(last=='-')
				ans++;
			System.out.println("Case #"+(i+1)+": "+ans);
		}

	}

}
