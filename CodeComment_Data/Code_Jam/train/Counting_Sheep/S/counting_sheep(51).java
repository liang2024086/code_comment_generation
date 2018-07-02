package methodEmbedding.Counting_Sheep.S.LYD970;


import java.io.PrintWriter;
import java.util.Scanner;

public class counting_sheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int q=sc.nextInt();
		for(int z=1;z<=q;z++){
			long n=sc.nextLong();
			if(n==0){
				pw.println("Case #"+z+": INSOMNIA");		
				continue;
				}
			short[] a=new short[10];
			short count=0;
			long i=1;
			//boolean flag=false;
			while(count!=10){
				long check=n*(i++);
				while(check>0){
					short m=(short)(check%10);
					check/=10;
					if(a[m]==0){
						a[m]=1;
						count++;
					}
				}
			}
			pw.println("Case #"+z+": "+(i-1)*n);
		}
		pw.close();
	}

}
