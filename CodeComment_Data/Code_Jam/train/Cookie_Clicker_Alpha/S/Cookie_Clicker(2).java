package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1416;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cookie_Clicker {

	//testcase
	static int t;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	
	
	
	public static void main (String[] args) {
		
		double c = 0 , f = 0,x = 0;
		double earnPotnl=2;
		double time =0;
		boolean isGameOn = true;
		
		double timeToSucceed = 0;
		double timeToBuy= 0 ;
		double totalTimeToFinish= 0;
		double prevTimeToFinish = 0;
		
		
		try {
			System.out.println("Enter t");
			 t =  Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		for (int i=0; i<t; i++) {
			
			//cleanup
			 c = 0 ; f = 0  ; x = 0;
			 earnPotnl=2;
			 time =0;
			 isGameOn = true;
			
			 timeToSucceed = 0;
			 timeToBuy= 0 ;
			 totalTimeToFinish= 0;
			 prevTimeToFinish = 0;
			
			//readinput
			try {
				System.out.println("Enter cfx");
				String inputs =  br.readLine();
				
				String[] inputArr = inputs.split(" ");
				c= Double.parseDouble(inputArr[0]);
				f= Double.parseDouble(inputArr[1]);
				x= Double.parseDouble(inputArr[2]);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			//processinput
			do{
				
				timeToSucceed = x/earnPotnl;
				timeToBuy = c/earnPotnl;
				
				
				totalTimeToFinish = time + timeToSucceed;
				
//				if((prevTimeToFinish  <=  totalTimeToFinish) && (prevTimeToFinish != 0)){
				if( ( BigDecimal.valueOf(prevTimeToFinish).compareTo(BigDecimal.valueOf(totalTimeToFinish))  <= 0  )   && ( BigDecimal.valueOf(prevTimeToFinish).compareTo(BigDecimal.ZERO) != 0)){
					isGameOn=false;
					break;
				}
				else{
					prevTimeToFinish = totalTimeToFinish;
				}
				
				
//				if(timeToBuy < timeToSucceed){
				if(BigDecimal.valueOf(timeToBuy).compareTo(BigDecimal.valueOf(timeToSucceed)) < 0 ){
					time = timeToBuy + time;
					earnPotnl = earnPotnl + f;
				}
				else{
					time = time + timeToSucceed;
				}
				
//				if(timeToBuy == timeToSucceed){
				if(BigDecimal.valueOf(timeToBuy).compareTo(BigDecimal.valueOf(timeToSucceed)) == 0){
					isGameOn = false;
					prevTimeToFinish = time;
					break;
				}
				
			}while(isGameOn);
			
			
			System.out.println("Case #"+(i+1) + ": " +BigDecimal.valueOf(prevTimeToFinish).setScale(7, RoundingMode.CEILING) );
			
		}
		
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




	
}
