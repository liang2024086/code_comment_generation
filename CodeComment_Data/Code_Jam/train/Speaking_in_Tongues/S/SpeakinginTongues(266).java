package methodEmbedding.Speaking_in_Tongues.S.LYD1542;

/**
 * @(#)SpeakinginTongues.java
 *
 * SpeakinginTongues application
 *
 * @author Ariel Leonardo Molina Viteri
 * @version 1.00 2012/4/13
 */
 import java.awt.*;
 import java.applet.*;
 import java.util.*;
 import java.io.*;

public class SpeakinginTongues{
    
    public static void main(String[] args) throws IOException {
    char in[]={'a',' ','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char out[]={'y',' ','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	String linea[]=new String[100];
	BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
	int caso,opc=0;
	byte[] separacion;
	int h=0;
		
		System.out.println("Input # case: ");
		caso = Integer.parseInt(lectura.readLine());
		do{
		System.out.println("");
		linea[h]=lectura.readLine();	
		h++;
		}while(h<=caso);
		opc=0;
		
		while(opc<caso){
			
			separacion = linea[opc].getBytes();
        	System.out.print("Case #"+(opc+1)+": ");
        		
        		for(int j=0; j<separacion.length; j++){
        			for(int i=0;i<27;i++){
        				if((char)separacion[j]==in[i])
        				System.out.print(out[i]);
        			}
        		}
        		System.out.println("");	
        		opc++;
		}
    	SpeakinginTongues ob=new SpeakinginTongues();
    }
}
