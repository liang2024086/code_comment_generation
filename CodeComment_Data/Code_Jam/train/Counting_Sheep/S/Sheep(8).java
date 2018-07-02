package methodEmbedding.Counting_Sheep.S.LYD193;

import java.util.Scanner;
public class Sheep {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		boolean arr[]=new boolean[10];
		int t=read.nextInt();
		for (int i = 0; i < t; i++) {
			int N=read.nextInt();
			if(N==0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			for(int j=0;j<10;j++){
				arr[j]=false;
			}
			int j=1;
			while(true){
				int x=j*N;
				while(x>0){
					int c=x%10;
					arr[c]=true;
					x=x/10;
				}
				int k=0;
				while(k<10){
					if(!arr[k]){
						j++;
						break;
					}
					else{
						k++;
						continue;
					}
				}
				if(k==10){
					System.out.println("Case #"+(i+1)+": "+j*N);
					break;
				}
			}
			
		}
		
		read.close();
	}

}

