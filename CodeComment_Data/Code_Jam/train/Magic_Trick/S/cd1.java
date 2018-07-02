package methodEmbedding.Magic_Trick.S.LYD1624;


import java.util.ArrayList;
import java.util.Scanner;

public class cd1 {
	public static ArrayList<Integer> s= new ArrayList<Integer>();
	public static ArrayList<Integer> q= new ArrayList<Integer>();	
	
public static void main(String[] args) {
	Scanner inp= new Scanner(System.in);
	
	int a= inp.nextInt();
    for(int x=0;x<a;x++){
    	
    	int b= inp.nextInt();
	    int [][]c= new int[4][4];
	    for(int i=0;i<4;i++){
		  for(int j=0;j<4;j++){
		 	  c[i][j]= inp.nextInt();
		}
	}
	
	    int []f= new int[4];
	    for(int j=0;j<4;j++){
		f[j]=c[b-1][j];
	 }
	  
	    
	    int d= inp.nextInt();
	    int [][]e= new int[4][4];
	    for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			e[i][j]= inp.nextInt();
		}
	}
	
	int [] g= new int[4];
   for(int j=0;j<4;j++){
	   g[j]=e[d-1][j];
   }
  
    int counter=0;
    ArrayList<Integer> v= new ArrayList<Integer>();
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			if(f[i]==g[j]){
				counter++;
			    v.add(g[j]);
			}
		}
	}if(counter==1){
		q.add(v.get(0));
	}
	 s.add(counter);
	}
    int m=0;
   for(int i=0;i<a;i++){
	   int k=s.get(i);
	   if(k==1){
			int z=q.get(m);
			System.out.println("Case #"+(i+1)+": "+z);
			m++;
		}
		else if(k>1){
			System.out.println("Case #"+(i+1)+": Bad magician!");
		}
		else{
			System.out.println("Case #"+(i+1)+": Volunteer cheated!");
		}

   }
}
}
