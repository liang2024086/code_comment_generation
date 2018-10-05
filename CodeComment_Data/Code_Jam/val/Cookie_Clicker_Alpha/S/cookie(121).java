package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1124;


import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class cookie {
	public static void main (String[] args) throws IOException{
		Scanner s= new Scanner(new File("B-small-attempt0.in"));
		int times = s.nextInt();
		for (int ti= 0; ti<times; ti++){
			double cm = s.nextDouble();
			double gr = s.nextDouble();
			double reach = s.nextDouble();
			double start = 2;
			double time = 0;
			//boolean i= true;
			if(reach<=2){
				out.println("Case #"+(ti+1)+": "+String.format("%.7f",reach/2));
			}else{
			while(reach/start>cm/start+reach/(start+gr)){
				time+=cm/start;//out.println(time);
				start+=gr;
			}time+=reach/start;
			out.println("Case #" + (ti+1)+": " +String.format("%.7f",time));
			}
		}
			
	}
}
