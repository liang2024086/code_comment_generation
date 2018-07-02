package methodEmbedding.Revenge_of_the_Pancakes.S.LYD692;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class A {
	
	private static Scanner sc;

	public static void main(String args[]) {
        try{
          
            sc = new Scanner(new FileInputStream("B-small-attempt0.in"));
          //++++  
            int t=0; // cantidad de escenarios
            t=sc.nextInt();
          //-----
            //Variables a leer
            char[] n = {};
            
			int m=0; // contador de caso
            while (m<t){
            	
            	n = sc.next().toCharArray();
            	
            	int res = 0;
            	boolean ok = false;
            	
          
            	int i = 0;
            	while(i<n.length && n[i]=='+'){
            		i++;
            	}
            	ok = i==n.length;
            	while(n.length > 0 && !ok){
            		
            		i=0;
            		char first = n[0];
            		while(i<n.length && first == n[i]){
            			if (first == '-')
            				n[i] = '+';
            			else
            				n[i] = '-';
            			i++;
            		}
            		res++;
            		
            		i = 0;
                	while(i<n.length && n[i]=='+'){
                		i++;
                	}
                	ok = i==n.length;
            	}
            	
          		System.out.println("Case #"+(m+1)+": "+res);
				m++;
			}
            
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }

	}
	
}
