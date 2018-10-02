package methodEmbedding.Cookie_Clicker_Alpha.S.LYD399;

import java.util.*;
import java.io.*;
import java.text.*;
public class codejam2{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new FileReader("B-small-attempt13.in"));
		BufferedWriter write = new BufferedWriter(new FileWriter("output.txt"));
		int caseN = sc.nextInt();
		sc.nextLine();
		String[] allCase = new String[caseN];
		double c,f,x;
		c = f = x = 0;
		double[][] value;
		int bestcase = 0;
		double[] time;
		String ans;
		double speed = 2.0;
		for(int icase = 0;icase<caseN;icase++){
			c = sc.nextDouble();
			f = sc.nextDouble();
			x = sc.nextDouble();


			while(c/speed >1 || x/speed > 1){
				bestcase++;
				speed+=f;
			}
			speed = 2.0;
			if(c<10) bestcase*=10; 
			//System.out.println(bestcase+"****************");

			value = new double[bestcase][2];
			time = new double[bestcase];
			for(int i=0;i<bestcase;i++){
				value[i][0] = c/speed;
				value[i][1] = x/speed;
				speed+=f;
				//System.out.println(value[i][0]+", "+value[i][1]);
			}
			for(int i=0;i<bestcase;i++){
				time[i] += value[i][1];
				for(int j=i-1;j>=0;j--){
					time[i] += value[j][0];
				}
			}
			//System.out.println("Before "+Arrays.toString(time));
			//System.out.println("Before "+Arrays.toString(time));
			Arrays.sort(time);
			//System.out.println("After "+Arrays.toString(time));
			//System.out.println(time[0]);

			ans = String.format("%.7f",time[0]);
			allCase[icase] = "Case #"+(icase+1)+": "+ans;
			//System.out.println(allCase[icase]);

			speed = 2.0;
			bestcase = 0;
			ans = "";	
			
		}
		for(int i = 0;i<caseN;i++){
			write.append(allCase[i]+"\n");
		}

		write.close();
		//writeCHK.close();
	}
}
