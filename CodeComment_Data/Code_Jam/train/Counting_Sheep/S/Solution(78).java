package methodEmbedding.Counting_Sheep.S.LYD206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Solution {
    final static String WORK_DIR = "C:/Users/Marius/Downloads/";
    final static String INPUT_FILE_NAME = "A-small-attempt1.in";
    final static String OUTPUT_FILE_NAME = "output.txt";
    
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(WORK_DIR + INPUT_FILE_NAME));
        BufferedWriter bw = new BufferedWriter(new FileWriter(WORK_DIR + OUTPUT_FILE_NAME));
 
        int testCases = Integer.parseInt(br.readLine());
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        for(int i=1;i<=testCases;i++){
        	if(ar1.isEmpty()){
                for(int k=0; k<10; k++){
                	ar1.add(k);
                }	
        	}
        	String input = br.readLine(); 
        	if(Integer.parseInt(input) == 0)
        		bw.write("Case #" + i +": "+ "INSOMNIA" + "\n");
        	else{
        		int num=0;
        		for(int k=0; k<input.length(); k++){
        			num = input.charAt(k) - '0';
        			if(ar1.contains(num))
        				ar1.remove(ar1.indexOf(num));
        		}
        		int count = 2;
        		int num2 = Integer.parseInt(input);
        		
        		while(!ar1.isEmpty()){
            		num = num2 * count++;
            		for(int k=0; k<Integer.toString(num).length(); k++){
            			int num1 = Integer.toString(num).charAt(k) -'0';
            			if(ar1.contains(num1))
            				ar1.remove(ar1.indexOf(num1));
            		}
        		}
        		
        		bw.write("Case #" + i +": "+ num + "\n");
        	}
        }
        br.close();
        bw.close();
    }
}

