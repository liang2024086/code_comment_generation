package methodEmbedding.Cookie_Clicker_Alpha.S.LYD326;

/************************
 *                      *
 *   	 NUTJAE		    *
 *                      *
 ***********************/
import java.util.* ;
import java.io.* ;
import java.text.*;

public class QuaB {

	public static void main(String[] args) {

		File file = new File("B-small-attempt0.in");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner reader = new Scanner(fileReader);
		DecimalFormat df = new DecimalFormat("#.#######");
		
		int T = reader.nextInt();
		for(int i=0;i<T;i++){
			
			double cost=reader.nextFloat();
			
			double fee=reader.nextFloat();
			double x=reader.nextFloat();
			double get = 2.0; //get in sec
			double timeTB = 0.0;
			double leastTime = 0.0;
			double total = 0.0;
			double t=0.0;
			//first time reach
			leastTime = x/2;
			
			//second round
			timeTB = cost/get; 		// 15sec
			get=2+(fee*1); 			// become 2+2 = 4
			t=timeTB+(x/get); 		// 15 + (100/4) = 15+25 = 40
			
			int j=2;
			while(t<=leastTime){
				leastTime = t;	
				t=0;
				timeTB = timeTB + cost/get;				//7.5 + 15
				get=2+(fee*j);					//6
				t=t+timeTB+(x/get);				// 15+ 7.5+
				if(t<leastTime) leastTime = t;
				
				j++;
			}
			
			
			
			System.out.println("Case #"+(i+1)+": "+ df.format(leastTime));

	 }
	       
		 
	
	}

}


