package methodEmbedding.Speaking_in_Tongues.S.LYD705;

import java.io.*;

class SpeakingInTongues {

	static char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//  open up standard input
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      
	      int noOfCases = Integer.parseInt(br.readLine());
	      
	      for (int c = 0; c < noOfCases; c++) {
	    	  String google = br.readLine();
	    	  StringBuffer decoded = new StringBuffer("Case #"+(c+1)+": ");
	    	  for (int ch = 0; ch < google.length(); ch++) {
				 if(google.charAt(ch) != ' '){
	    		 int lookup = google.charAt(ch) - 'a';
				//System.out.println(lookup);
	    		 decoded.append(map[lookup]);
				 }
				 else{
					 decoded.append(' ');
				 }
				
			}
	    	System.out.println(decoded);
	    	decoded.delete(0, decoded.length());
			
		}
	      

	}

}
