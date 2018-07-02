package methodEmbedding.Counting_Sheep.S.LYD1491;


import java.io.*;
 
public class DataInputStreamTest {
 
       public static void main(String[] args) {
    	    FileReader fis = null;
    	    BufferedReader dis = null;
    	    BufferedWriter wis = null;
              int number =0 ;
              int s =1;
              String str;
              int array[];
              int count;
              int real_count;
              int i_s = 0;
              int temp_real;
              String input_number;
              try {
                     fis = new FileReader("a.txt");
                     dis = new BufferedReader(fis);
                     wis = new BufferedWriter(new FileWriter("out.txt", true));
                     str = dis.readLine();
                     number = Integer.parseInt(str);
                     
                     while(s <= number ){
                    	 count=0;
                    	 real_count =0 ;
                    	 array = new int[10];
                    	 input_number= dis.readLine();
                    	 temp_real= Integer.parseInt(input_number);
                    	 if(temp_real !=0){
	                    	 while(count != 10){
	                    		i_s = temp_real * ++real_count;
	                    	 	input_number = Integer.toString(i_s); 
	                    		 for(int i = 0 ; i < input_number.length(); i++){
	                    			 int j = input_number.charAt(i)- 48;
	                    			 if( array[j] == 0){
	                    				 array[j] = 1; count++;
	                    			 }
	                    		 }
	                    	 }
                    	 wis.write("Case #"+s+": "+i_s+"\n");
	                     } else{
	                    	 wis.write("Case #"+s+": INSOMNIA\n");
	                     }
                    	 s++;
                     }
                     
                     
              } catch (Exception e)
      		{
      			System.out.println("error" + e);
      		}
      		finally
      		{
      			try
      			{
      				dis.close();
      				wis.close();
      			}
      			catch (Exception e)
      			{
      				System.out.println("error" + e);
      			}
      		}
       }
}
