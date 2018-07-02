package methodEmbedding.Counting_Sheep.S.LYD1394;




import java.util.*;




public class firstSheep {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count,countDigit;
        boolean flag;
        int[] alldigits = {0,0,0,0,0,0,0,0,0,0};
       
        for(int a0 = 1; a0 <= t; a0++){
            int n = in.nextInt();
            int n1;
            count=0;
            countDigit=0;
            for(int i=0;i<10;i++) {
            	alldigits[i]=0;
            }
            flag=true;
            if(n==0) {
            	System.out.println("Case #"+a0+": INSOMNIA");
            	
            }
            else {
            	while(flag) {
            		n1=n*count;
            		while (n1 > 0 ) {
            			  int k = n1 / 10;
            			  int d = n1 - k * 10;
            			  if(alldigits[d]==0) {
            			  alldigits[d]=1;
            			  countDigit++;
            			  }
            			  
            			  n1 = k;
            		}
            		if(countDigit==10) {
            			flag=false;
            			System.out.println("Case #"+a0+": "+n*count);
            			break;
            		}
            		
            		count++;
            		
            	 }
            	
             }
            
        }
           
     in.close();      
    }
}
