package methodEmbedding.Counting_Sheep.S.LYD1113;


import java.util.Scanner;

public class FirstMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int k=1;k<=T;k++){
		String strr="";
		byte digits;
		long i,ii,c;
		i=sc.nextLong();
		ii=i;
		
		for(c=1;;c++){
		i=ii*c;
		while(i > 0) {
	        digits=(byte) (i % 10);
	        i /= 10;
	        String st=Integer.toString(digits);
	        if(!strr.contains(st)){
	        	strr+=st;
	        }
	    }
		if(strr.length()==10){
			System.out.println("Case #"+k+": "+(ii*c));
			break;
		}
		if(ii==0){
			System.out.println("Case #"+k+": INSOMNIA");
			break;
	}
		i=ii*c;
 }
}
		

	}

}
