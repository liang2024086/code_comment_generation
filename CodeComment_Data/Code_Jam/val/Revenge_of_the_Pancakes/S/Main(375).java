package methodEmbedding.Revenge_of_the_Pancakes.S.LYD727;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in = new File(args[0]);
		int t = 0;
		FileReader input = null;
		try {
			input = new FileReader(in);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		BufferedReader ine = new BufferedReader(input);
		File out = new File(args[1]);
		BufferedWriter output = null;
	    try {
			output = new BufferedWriter(new FileWriter(out));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    try {
			t = Integer.parseInt(ine.readLine().trim());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    for(int z = 1;z<=t;z++)
	    {
	    	char[] pan = {};
	    	int count =0;
	    	try {
				pan = ine.readLine().trim().toCharArray();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	int len = pan.length;
	    	for(int i = pan.length-1;i>=0;i--){
	    		if(pan[i] == '+')
	    			len--;
	    		else 
	    			break;
	    	}
	    	if(len == 0){
	    		try {
					
					output.write("Case #"+ Integer.toString(z) +": "+ Integer.toString(count)+ "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	try {
					output.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	continue;
	    	}
	    	count = 1;
	    	for(int i=1;i<len;i++)
	    	{
	    		if(pan[i]!=pan[i-1])
	    			count++;
	    	}
	    	/*if(len > 1 && (pan[len-1] != pan[len-2] ))
	    	{
	    		count++;
	    	}*/
	    	try {
				
				output.write("Case #"+ Integer.toString(z) +": "+ Integer.toString(count)+ "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	try {
				output.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		}
	}
