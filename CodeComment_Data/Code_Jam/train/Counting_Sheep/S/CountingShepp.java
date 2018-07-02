package methodEmbedding.Counting_Sheep.S.LYD694;

import java.util.Scanner;

public class CountingShepp {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int cant = sc.nextInt();
	        for (int i = 0; i < cant; i++) {
	        	int n = sc.nextInt();
	        	int e=10,z=0,zz=0,var=0;
	        	int num[]= new int[10];
	        	num[0]=0;num[1]=1;num[2]=2;num[3]=3;num[4]=4;num[5]=5;num[6]=6;num[7]=7;num[8]=8;num[9]=9;
	        	while(z==0){
	        		int k=0;
	        		z=1;
	        		zz=zz+1;
	        		var=n*zz;
	        		k=var;
	    			if(var>=10){
	    				while(k>0){
	    					e=k%10;
	    					k=k/10;
	    					for(int h=0;h<10;h++){
	    						if(num[h]==e){
	    							num[h]=11;
	    						}
	    					}
	    				}
	    			}else if(var>0){
	    				for(int h=0;h<10;h++){
	    					if(num[h]==var){
	    						num[h]=11;
	    					}
	    				}
	    			}else{
	    				System.out.println("Case #"+(i+1)+": "+"INSOMNIA");
	    				break;
	    				
	    			}
	    			
	    			for(int j=0;j<10;j++){
	    				if(num[j]!=11){
	    					z=0;
	    				
	    				}
	    			}
	    		}
	        	if(var>0){
	        		System.out.println("Case #"+(i+1)+": "+var);
	        	}
	        	
	        }
	}
}
