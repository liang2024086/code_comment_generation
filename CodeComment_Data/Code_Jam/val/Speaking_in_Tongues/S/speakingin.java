package methodEmbedding.Speaking_in_Tongues.S.LYD205;


/**
 *
 *
 * @Author      :Yasith Maduranga(Merlin)
 * @version     :1.0
 * @Date        :2012/4/14
 * @Copyright GSharp Lab, All Rights Reserved....
 */
import java.io.*;
import java.util.*;

class speakingin {
	public static void main(String args[]){
		try{
	    	BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
	    	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt0.out")));

	    	int noOfCases = Integer.parseInt(br.readLine());
	    	char code[]={'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p',
	    		'd','r','j','g','t','h','a','q'};

	    	char alphabet[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
	    		's','t','u','v','w','x','y','z'};

	    	for(int i=0;i<noOfCases;i++){
				String sentence[]=br.readLine().split(" ");
				String newString="";
				for(int j=0;j<sentence.length;j++){
					for(int k=0;k<sentence[j].length();k++){
						for(int l=0;l<code.length;l++){
							if(sentence[j].charAt(k)==code[l]){
								newString+=alphabet[l];
							}
						}
					}
					newString+=" ";
				}

				out.println("Case #"+(i+1)+": "+newString);
	    	}



	    	out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	    	System.exit(0);
	}
}
