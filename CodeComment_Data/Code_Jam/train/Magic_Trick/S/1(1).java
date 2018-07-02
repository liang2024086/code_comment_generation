package methodEmbedding.Magic_Trick.S.LYD366;

    codejam/qualifing/1
	*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


class Main  

 {
		public static long ans;
		public static int[] arr=new int[17];
  public static void main(String[] args)throws Exception

    {                 

       BufferedReader br=new BufferedReader(new FileReader("A-small-attempt2.in"));
	   BufferedWriter out=new BufferedWriter(new FileWriter("output.txt"));
    
      // byte digit[]=new byte[101];
	 //boolean[] check=new boolean[101];
     //int num[]=new int[99999]; 
        ans=0;     
        int tests=Integer.parseInt(br.readLine());
     
    for(int t=0;t<tests;t++){
					for(int i=1;i<=16;i++)arr[i]=-10;			
					int n=Integer.parseInt(br.readLine());	
					//int num[]=new int[n];					
					//String[] ss=br.readLine().split(" ");    
					
  					for(int i=1;i<=4;i++){
				         String[] ss=br.readLine().split(" ");
					 if(i==n){	
						for(int j=0;j<4;j++){
															
								int x=Integer.parseInt(ss[j]);
								if(arr[x]<0)arr[x]=0;
								arr[x]++;
									}	
							
				         	}
					}
					n=Integer.parseInt(br.readLine());
                                        //int num[]=new int[n];                                 
                		         // ss=br.readLine().split(" ");
		
                                        for(int i=1;i<=4;i++){
                                         String[] ss=br.readLine().split(" ");
                                         if(i==n){      
                                                for(int j=0;j<4;j++){

                                                                int x=Integer.parseInt(ss[j]);
                                                                //if(arr[x]<0)arr[x]=0;
                                                                arr[x]--;
                                                                        }

                                                }
                                        }
					ans=0;int num=0;
					for(int i=1;i<=16;i++){
					if(arr[i]==0){ans++;num=i;}
					}

				if(ans==1){out.write("\nCase #"+(t+1)+": "+num);out.flush();
					}else if(ans>1){out.write("\nCase #"+(t+1)+": Bad magician!");out.flush();
						}else{ out.write("\nCase #"+(t+1)+": Volunteer cheated!");out.flush();
							}		
				}		
        			
  		      
  }
}
