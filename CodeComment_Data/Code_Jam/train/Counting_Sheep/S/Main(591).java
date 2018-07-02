package methodEmbedding.Counting_Sheep.S.LYD297;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		for(int i=0;i<10;i++)
			num[i] = 0;
		File in = new File(args[0]);
		FileReader input = null;
		try {
			input = new FileReader(in);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		BufferedReader ine = new BufferedReader(input);
		File out = new File(args[1]);
		//Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t=0;
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
	    for (int i = 1; i <= t; ++i) {
	      int number=0;
		try {
			number = Integer.parseInt(ine.readLine().trim());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      if (number == 0)
	      {
	    	  try {
				output.write("Case #"+ i +": "+ "INSOMNIA" + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  continue;
	      }
	      int n = number;
	      for(int j=0;j<10;j++)
				num[j] = 0;
	      int mul = 1;
	      int rem = 10;
	      int x;
	      while(rem > 0)
	      {
	    	  while (n > 0) 
		      {
	    	    x = n % 10;
	    	    n = n / 10;
	    	    if(num[x] == 0){
	    	    	num[x] = 1;
	    	    	rem = rem - 1;
	    	    }   
		      }
	    	  if( rem != 0)
	    	  {
	    		  mul = mul+1;
	    		  n = number * mul;
	    	  } else
				try {
					String o = new String("Case #"+ Integer.toString(i) +": "+ Integer.toString(number*mul));
					output.write(o + "\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	  
	      } 
	      
	}
	    try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
