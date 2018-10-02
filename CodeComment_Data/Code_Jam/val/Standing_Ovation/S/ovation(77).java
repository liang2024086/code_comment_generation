package methodEmbedding.Standing_Ovation.S.LYD308;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ovation {
	public static void main(String[] args) throws FileNotFoundException{
    	Scanner sc = new Scanner(new File("test.in"));
    	
    	int n = sc.nextInt();
    	
    	for(int cases=1; cases<=n; cases++){
    	    int smax = sc.nextInt();
    	    String d = sc.next();
    	    int totalStanding = 0;
    	    int friendsNeeded = 0;
    	    
    	    for(int i=0; i<d.length(); i++){
    	    	int digit = d.charAt(i)-'0';
    	    	if(totalStanding < i){
    	    		friendsNeeded += i-totalStanding;
    	    		totalStanding = i;
    	    	}
    	    	totalStanding += digit;	
    	    }
    	    System.out.println("Case #" + cases + ": " + friendsNeeded);
    		
    	}
	}
}
