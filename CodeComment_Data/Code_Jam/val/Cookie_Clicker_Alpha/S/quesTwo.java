package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1096;

import java.util.*;

public class quesOne {
public static void main(String args[]){
	
		
Scanner input=new Scanner(System.in);
int cases=input.nextInt();

for (int counter=1; counter<=cases; counter++) {
	
	
double c=input.nextFloat();
double f=input.nextFloat();
double x=input.nextFloat();
int farms=0;
 ArrayList<Float> times = new ArrayList<Float>();
 times.add((float) x/2);
 
 ArrayList<Float> sub_times = new ArrayList<Float>();
 float time_total=0;
 do { 
	 
	 farms+=1;
	 
	 for (int a=0;a<farms;a++){
		 double var=c/(a*f + 2);
		 sub_times.add((float) var);
		 
		 
	 }
		 sub_times.add((float) ((float)  x/((farms)*f + 2)));
		 
	
		 for (int b=0;b<=farms;b++){
			 time_total+=sub_times.get(b);
			 
			 
		 } times.add((float)time_total);
		 sub_times.clear(); time_total=0;
		
		 
 } while(times.get(farms-1)>times.get(farms));
	 
  
 System.out.println("Case #" + counter+": "+times.get(farms-1));
 

}
input.close();
}}
 

