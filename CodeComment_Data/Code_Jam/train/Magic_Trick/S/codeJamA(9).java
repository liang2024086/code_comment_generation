package methodEmbedding.Magic_Trick.S.LYD451;

/* 
* @Author: steve
* @Date:   2014-04-11 21:51:52
* @Last Modified by:   steve
* @Last Modified time: 2014-04-11 22:51:24
*/
import java.util.*;
import java.io.*;

public class codeJamA {
    public static void main(String[] args) throws IOException {
    	BufferedReader entrada = new BufferedReader(new FileReader(new File("input.txt")));
    	PrintWriter salida = new PrintWriter(new FileWriter("output.txt"));
    	int casos = Integer.parseInt(entrada.readLine());
    	for(int i=0;i<casos;i++){
    		int n1=Integer.parseInt(entrada.readLine());
    		String[] caso1=null;
    		for(int j=0;j<4;j++){
    			String aux=entrada.readLine();
    			if((n1-1)==j)
    				caso1=aux.split(" ");
    		}
    		int n2=Integer.parseInt(entrada.readLine());
    		String[] caso2=null;
    		for(int j=0;j<4;j++){
    			String aux=entrada.readLine();
    			if((n2-1)==j)
    				caso2=aux.split(" ");
    		}
    		Vector<String> resultado = new Vector<String>();
    		for(int k=0;k<4;k++){
    			for(int j=0;j<4;j++){
    				if(caso1[k].equals(caso2[j]))
    					resultado.add(caso1[k]);
    			}
    		}
    		int size= resultado.size();
    		if(size==1)
    			salida.println("Case #"+(i+1)+": "+resultado.get(0));
    		else if(size==0)
    			salida.println("Case #"+(i+1)+": Volunteer cheated!");
    		else
    			salida.println("Case #"+(i+1)+": Bad magician!");
    	}
    	salida.close();
    }
}
