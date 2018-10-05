package methodEmbedding.Revenge_of_the_Pancakes.S.LYD778;




import java.util.*;




public class pancakes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count,noOfFlips;
        boolean isLastMinus;
        
       
        for(int a0 = 1; a0 <= t; a0++){
            count=0;
            isLastMinus=false;
        	String str = in.next();
            char[] charArray = str.toCharArray();
        	for(int i=0;i<charArray.length-1;i++) {
        		if(charArray[i]!=charArray[i+1]){
        			count++;
        		}
        	}
        	
        	if(charArray[charArray.length-1]=='-') {
        		isLastMinus=true;
        	}
        	if(isLastMinus) {
        		noOfFlips=count+1;
        	}
        	else 
        		noOfFlips=count;
           if(a0!=t){
        	   System.out.println("Case #"+a0+": "+noOfFlips);
           }
           else
           	System.out.print("Case #"+a0+": "+noOfFlips);
            		
        }     		
            		
           
     in.close();      
    }
}
