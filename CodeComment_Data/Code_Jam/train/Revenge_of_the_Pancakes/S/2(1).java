package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1122;

import java.util.Scanner;
  
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        
        for(int i=0;i<cases;i++)
        {
        	String pancake= sc.next();
        	char[] pancake2= pancake.toCharArray();

        	boolean flag=false;
        	int many =0;
        	int p2len=pancake2.length;

        	while(flag==false){
        		if(pancake2.length==1){
        			if(pancake2[0]=='+')
        			{
        				flag=true;
        			}
        			else
        			{
        				flag=true;
        				many+=1;
        			}
        			
        		}
        		else{
        			for(int j=1;j<p2len;j++){
        				if(pancake2[j]!=pancake2[j-1]){
        					char[] pancake3= new char[j];
	        				//j ?????? ????????? ?????????;
        						//System.out.println("j  "+j+"  ");

	        				for(int k=0;k<j;k++){
	        					//System.out.println("k   "+k+"  ");
	        					pancake3[k]=pancake2[j-1-k];
	        					//?????????.
	        				}
	        				//System.out.println("pancake3"+pancake3);
	        				for(int k=0;k<j;k++){
	        					//System.out.println("k   "+k);
	        					if(pancake3[k]=='-')
	        					{pancake2[k]='+';}
	        					else
	        					{pancake2[k]='-';}
	        					//System.out.println(pancake2[k]);
	        					//?????????.
	        				}
	        			//	System.out.println(pancake2);
	        				many+=1;
	        				break;
        				}
        			else
        				{

	        				if(j==(p2len-1)){
		        				if(pancake2[j]=='+')
		        				{
		        					flag=true;
		        					break;
		        				}
		        				else
		        				{
		        					many+=1;
		        					flag=true;
		        					break;
		        				}
	        				}
        				}
        			}
				}
        	}//end of while
        	System.out.println("Case #"+(i+1)+": "+many);

		}//end of outer for
   }//end of main method
}//end of main class
