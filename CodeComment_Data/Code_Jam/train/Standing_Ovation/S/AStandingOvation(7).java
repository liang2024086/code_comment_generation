package methodEmbedding.Standing_Ovation.S.LYD11;

/* 
* @Author: steve
* @Date:   2015-04-11 12:23:37
* @Last Modified by:   steve
* @Last Modified time: 2015-04-11 12:29:41
*/
import java.io.*;
import java.util.*;

public class AStandingOvation {
    public static void main(String[] args) throws Exception{
    	BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    	int casos=Integer.parseInt(entrada.readLine());
    	for(int i=0;i<casos;i++){
    		String cads[] = entrada.readLine().split(" ");
    		int cont=0,suma=0;
    		for(int j=0;j<cads[1].length();j++){
    			if(cont+suma<j)
    				cont+=j-(suma+cont);
    			suma+=cads[1].charAt(j)-'0';
    		}
    		System.out.println("Case #"+(i+1)+": "+cont);
    	}
    }
}
