package methodEmbedding.Counting_Sheep.S.LYD1672;

import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;
import java.io.*;



public class task1 { 
	public static ArrayList<String> tempList = new ArrayList<String>();
	public static int count = 0;



   public static void main(String[] args) throws IOException { 
      BufferedReader input = new BufferedReader(new FileReader("A-small-attempt2.in"));
      File file = new File("output3.in");
      file.createNewFile();
      FileWriter output = new FileWriter(file); 

        String c;
         while ((c = input.readLine()) != null) {
         	tempList.add(c);
		}


		String total=tempList.get(0);
		tempList.remove(0); 

		while (count < Integer.parseInt(total)){
			ArrayList<Character> myList = new ArrayList<Character>();
			String last="";
			int n=1;

			String val=tempList.get(0);
			last=val;
			while(true){
				if(myList.size()!=10 && last != "0"){
					for (int j =0;j<last.length(); ++j ) {
				 		if((myList.contains(last.charAt(j)))==false){
				 			myList.add(last.charAt(j));
				 		} 
			 		}
				}

			 	if(myList.size()==10){
			 		output.write("Case #"+(count+1)+": "+ last+"\n");
					// System.out.println(last);
					tempList.remove(0);
					break;
				} else {
			 			n=n+1;
			 			int temp=Integer.parseInt(val);
			 			temp=temp*n;
			 			if(temp==0){
			 				output.write("Case #"+(count+1)+": "+ "INSOMNIA\n");
			 				// System.out.println("INSONMIA");
			 				tempList.remove(0);
			 				break;
			 			}else{
			 				last=Integer.toString(temp);	
			 			}
			 			
			 	}
			}
			count=count+1;
		}

		output.close();
           
   }
}



