package methodEmbedding.Counting_Sheep.S.LYD1628;

import  java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
	import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class task{
	static Vector <String> numbers = new Vector <String> ();
	
	
	public static void main(String[] args) throws IOException {
		try
		{
		

		    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		    int t = in.nextInt();

		    for(int i=0 ; i<t ; i++){
		    	numbers.addElement( Integer.toString(in.nextInt()) );


		    }	

			for(int i=0;i<numbers.size();i++){
				Vector <String> digits = new Vector <String> ();
				String mynum = numbers.get(i);
				int increment = 1;
				int mark = 1;

				while(mark == 1){
					int loop_num = increment * (Integer.parseInt(mynum));
					String loop_number = Integer.toString(loop_num);

					for(int j=0;j<loop_number.length();j++){
						if(digits.contains(Character.toString(loop_number.charAt(j))) ) {
							continue;
						}else{
						   digits.addElement(Character.toString(loop_number.charAt(j)));
						}	
					}
					if(loop_number.equals("0")){
						mark = 0;
						System.out.println("Case #" + (i+1) + ": " + "INSOMNIA");
					}

					if(digits.size() == 10){
						mark =  0;
						System.out.println("Case #" + (i+1) + ": " + loop_number);
					}

					increment++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

		
	}
	
}
