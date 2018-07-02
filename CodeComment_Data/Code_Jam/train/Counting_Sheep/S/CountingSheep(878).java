package methodEmbedding.Counting_Sheep.S.LYD1434;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class CountingSheep {
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new FileReader("A-small-attempt0.in"));
		int t= Integer.parseInt(bf.readLine());
		PrintWriter out= new PrintWriter(new FileWriter("out.txt"));
		for(int c=1; c<=t; c++){
			int n= Integer.parseInt(bf.readLine());
			if(n==0)
				out.printf("Case #%d: INSOMNIA\n",c);
			else{
				boolean taken []= new boolean [10];
				int tmp=n;
				boolean flag=true;
				for(int i=1; true; i++){
					tmp= n*i;
					int x= tmp;
					while(x>0){
						taken[x%10]=true;
						x/=10;
					}
					for(int j=0; j<10; j++)
						if(!taken[j]){
							flag=false;
							break;
							}
					if(flag)
						break;
					flag=true;
				}
				out.printf("Case #%d: %d\n",c,tmp);
			}
				
		}
		out.flush();
		out.close();

		
		
	}

}
