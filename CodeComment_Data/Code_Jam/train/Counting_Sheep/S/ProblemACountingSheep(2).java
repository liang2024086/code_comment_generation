package methodEmbedding.Counting_Sheep.S.LYD1515;

import java.io.*;


public class ProblemACountingSheep {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
		DataInputStream entrada = new DataInputStream(fstream);
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
	    
	   	int t = Integer.parseInt(buffer.readLine());
	    for (int i = 0; i < t; i++) {
	    	int n = Integer.parseInt(buffer.readLine());	
	    	int res=0;
	    	int cont0=0, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0, cont8=0, cont9=0;
	    	int mul=1;
	    	int cont=0;
	    	if(n==0){
	    		System.out.print("Case #"+(i+1)+": ");
				System.out.print("INSOMNIA");
				System.out.println();
				continue;
	    	}
	    	while (cont <10){
	    		//System.out.println(res);
	    		res=n*mul;
	    		mul++;
	    		String res1= res+"";
	    		for (int j = 0; j < res1.length(); j++) {
	    			char test = res1.charAt(j);		
	    			switch (test) {
					case '0':
						cont0=1;
						break;
					case '1':
						cont1=1;
						break;
					case '2':
						cont2=1;
						break;
					case '3':
						cont3=1;
						break;
					case '4':
						cont4=1;
						break;
					case '5':
						cont5=1;
						break;
					case '6':
						cont6=1;
						break;
					case '7':
						cont7=1;
						break;
					case '8':
						cont8=1;
						break;
					case '9':
						cont9=1;
						break;
					default:
						break;
					}
	    			cont= cont0 + cont1+ cont2 + cont3 + cont4 + cont5 + cont6 + cont7 + cont8 + cont9;
	    			if(cont==10)
	    				break;
				}
	    		
	    	}
			
			System.out.print("Case #"+(i+1)+": ");
			System.out.print(res);
			System.out.println();
		}
	    /*
	    for (int j = 0; j < 10001; j++) {
			System.out.println(j);
		}
		*/
	            
	    entrada.close();
	}

}
