package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1456;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cookie {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("B-small-attempt0.in"));
//			Scanner sc = new Scanner(new File("B-large.in"));

			
			
			int count = Integer.parseInt(sc.nextLine());
			
			PrintWriter pw = new PrintWriter(new File("output.txt"));
			
			double c = 0, f = 0, x = 0, br = 2;


			for(int i=0; i<count; i++){
				
				c = sc.nextDouble();
				f=sc.nextDouble();
				x=sc.nextDouble();
				
//				System.out.println(c);
//				System.out.println(f);
//				System.out.println(x);
//				System.out.println(br);
				
				double curTime = x / br;
				double testtime = 0;
				int j = 1;
//				System.out.println("CT: "+curTime+" TT: "+testtime);
				while(testtime<=curTime){
					if(testtime !=0 && testtime<curTime) curTime=testtime;
					testtime = 0;
					int m;
					for (m = 0;m<j;m++)
						testtime+=(c/(br+m*f));
					testtime+=x/(br+m*f);
//					System.out.println("CT: "+curTime+" TT: "+testtime+" M: "+m);
					j++;
				}
				
				pw.println("Case #"+(i+1)+": "+curTime);
								
			}
			sc.close();
			pw.close();
		}catch(Exception e){e.printStackTrace();}
	}

}
