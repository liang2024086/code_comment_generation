package methodEmbedding.Counting_Sheep.S.LYD472;

import java.util.*;
import java.io.*;
public class problema1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); 
		if(t<=100 && t>0)
		{
			for (int i = 1; i <= t; ++i) 
			{
				int n = in.nextInt();
				if(n<=200 && n>=0)
				{
					boolean memory[]=new boolean[]{false,false,false,false,false,false,false,false,false,false};
					int j, modulo, m, aux,div;
					if(n!=0)
					{
						m=n;
						j=1;
						do
						{
							div=m;
							do{
								modulo=div%10;
								div=div/10;
								memory[modulo]=true;
								
							}while(div>0);
							j++;
							aux=m;
							m=n*j;
						}while(memory[0]==false || memory[1]==false || memory[2]==false || memory[3]==false || memory[4]==false ||
							   memory[5]==false || memory[6]==false || memory[7]==false || memory[8]==false || memory[9]==false);					
						System.out.println("Case #" + i + ": "+ aux);
					}
					else
					{
						System.out.println("Case #" + i + ": INSOMNIA");
					}
				}
				
			}
		}
	}
}
