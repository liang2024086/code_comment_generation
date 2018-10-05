package methodEmbedding.Speaking_in_Tongues.S.LYD356;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
	
	static String incoming2 = "rbkd bcpc kd ljsveticp yfrkgyrci rtcsra dcgcs fymkncp wjmm yjre se okfonyfo sykmrbpetksl xyabcx";
	static String out="";
	static String incoming;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
	    BufferedReader br = new BufferedReader(new FileReader("A.in"));
		BufferedWriter bw=  new BufferedWriter(new FileWriter( "A.out" ));

	    try {
	        StringBuilder sb = new StringBuilder();
	         incoming = br.readLine();
	         int h=1;
	        while (incoming != null) {
	        //	System.out.println(incoming);

	        	for( int i=0; i<incoming.length();i++){
	        		

	       		 switch (incoming.charAt(i)) {
	                case 'a':  out = out+'y';
	                         break;
	                case 'b':  out = out+'h';
	                break;
	                case 'c':  out = out+'e';
	                break;
	                case 'd':  out = out+'s';
	                break;
	                case 'e':  out = out+'o';
	                break;
	                case 'f':  out = out+'c';
	                break;
	                case 'g':  out = out+'v';
	                break;
	                case 'h':  out = out+'x';
	                break;
	                case 'i':  out = out+'d';
	                break;
	                case 'j':  out = out+'u';
	                break;
	                case 'k':  out = out+'i';
	                break;
	                case 'l':  out = out+'g';
	                break;
	                case 'm':  out = out+'l';
	                break;
	                case 'n':  out = out+'b';
	                break;
	                
	                case 'o':  out = out+'k';
	                break;
	                case 'p':  out = out+'r';
	                break;
	                case 'q':  out = out+'z';
	                break;
	                case 'r':  out = out+'t';
	                break;
	                case 's':  out = out+'n';
	                break;
	                case 't':  out = out+'w';
	                break;
	                case 'u':  out = out+'j';
	                break;
	                case 'v':  out = out+'p';
	                break;case 'w':  out = out+'f';
	                break;case 'x':  out = out+'m';
	                break;
	                case 'y':  out = out+'a';
	                break;
	                case 'z':  out = out+'q';
	                break;
	                case ' ':  out = out+' ';
	                break;
	                default: break;


	                         
	       	}
	       	


	       	
	       }
	        	if (out!=""){
	        		bw.write("Case #" + (h) + ": " + out + "\n");
		            h++;

	        	}

	            incoming = br.readLine();
	            System.out.println(out);

out="";

	        }
	    } finally {
	        br.close();
	        bw.close();
	    }
	    
	    
		// TODO Auto-generated method stub
	



}}
