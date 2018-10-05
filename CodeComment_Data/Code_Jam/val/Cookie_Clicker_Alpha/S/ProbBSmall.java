package methodEmbedding.Cookie_Clicker_Alpha.S.LYD569;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ProbBSmall {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileReader(new File("E:/tools/eclipse/workspace/CodeJam/src/B-small-attempt2.in")));
			PrintWriter out = new PrintWriter(new File("E:/tools/eclipse/workspace/CodeJam/src/B-small-attempt2.out"));
			int t = sc.nextInt();
			if(t>=1 && t<=100)
			{
				for (int i = 0; i < t; i++) {
					double c = sc.nextDouble();
					double f = sc.nextDouble();
					double x = sc.nextDouble();
					
					if(c>=1 && c<=500 && f>=1 && f<=4 && x>=1 && x<=2000){
						double tempF = 2;
						
						
						double tx = x/tempF;
						double s = c/tempF;
						double tc =s+(x/(tempF+f));
						
						
						
						while(tc<tx){
							tx=tc;
							tempF+=f;
							s += c/tempF;
							tc =s+(x/(tempF+f));	
							
							
						}
						out.println("Case #"+(i+1)+": "+String.format("%.7f",tx));
//						if(x<c) {
//							s = x/2;
//						}
//						else{
//							
//							
//							for(int j=0;j<count;j++){
//								if(j==count-1){
//									s+=x/tempF;
//								}
//								else
//									s+= c/tempF;
//								tempF+=f;
//								
////								System.out.println(r);
//								
//							}
//						}
////						System.out.println("Case #"+(i+1)+": "+String.format("%.7f",s));
//						out.println("Case #"+(i+1)+": "+String.format("%.7f",s));
					}
					
					
				}
				
				
				
			}
			
			sc.close();
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
