package methodEmbedding.Cookie_Clicker_Alpha.S.LYD328;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CCA {

	public static void main(String[] args) throws FileNotFoundException{
		if (args.length > 0) {
			System.setIn(new FileInputStream(args[0]));
			System.setOut(new PrintStream(new FileOutputStream("test"+ ".txt")));
		}
		
		Scanner sc = new Scanner (System.in);
		 DecimalFormat df = new DecimalFormat("0.0000000");
		int t = sc.nextInt();
		for (int i = 0; i<t;i++){
			double cost = sc.nextDouble();
			double inc = sc.nextDouble();
			double goal = sc.nextDouble();
			double time =0;
			double cookie =2;
			boolean flag =true;
			ArrayList<Double> arr = new ArrayList<Double>();
			ArrayList<Double> magic = new ArrayList<Double>();
			
			while(flag){
				double con1 = cost/cookie;
				double con2 = goal/cookie;
				double temp =time+con2;
				if(con1>con2){
					time+=con2;
					flag=false;
				}
				else{
					if(arr.size()<=2){
						arr.add(temp);
						time+=con1;
						cookie+=inc;
						magic.add(con2);
					}
					else{
						if(arr.get(arr.size()-2)<arr.get(arr.size()-1)){
							time+=magic.get(arr.size()-2);
							flag= false;
						}
						else{
							time+=con1;
							magic.add(con2);
							cookie+=inc;
							arr.add(temp);
						}
					}
				}
				
				
			}
			
			Collections.sort(arr);
			
			if(arr.size()>=2){
				time = arr.get(0);
			}
			
			
			int caso =i+1;
			System.out.println("Case #"+caso+": "+df.format(time));
		}
		
		sc.close(); 
	}

}
