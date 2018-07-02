package methodEmbedding.Cookie_Clicker_Alpha.S.LYD547;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		int i=0,j=0,z=0;
		double cook_cost=0.0,target=0.0,farm_cost=0.0,current_time=0.0,est_time=0.0,est_stop_time=0.0,current_rate=2.0;
		String output=null;
		String[] temp =null;
		BufferedWriter writer = null;
		BufferedReader reader;
		boolean status=true;
		reader=null;
		try {
			reader = new BufferedReader(new FileReader("C:/CustProgram/input.txt"));
			writer = new BufferedWriter(new FileWriter("C:/CustProgram/output.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line = null;
		line = reader.readLine();
		int No_Of_TCs=Integer.parseInt(line);
		for ( z=1;z<=No_Of_TCs;z++)
	    {
			
			temp=reader.readLine().split(" ");
			cook_cost=Double.parseDouble(temp[0]);
			farm_cost=Double.parseDouble(temp[1]);
			target=Double.parseDouble(temp[2]);
			current_rate=2.0;
			current_time=0.0;
			status=true;
					
			while(status)
			{
				est_stop_time=target/current_rate;
				est_time=(cook_cost/current_rate) + (target/(current_rate+farm_cost)) ;
				
				if (est_time<est_stop_time)
				{
					current_time= (current_time + (cook_cost/current_rate));
					current_rate= current_rate+farm_cost;
					
				} else
				{
					current_time= (current_time + (target/current_rate));
					output="Case #"+z+": " + current_time;
					//System.out.println("Case #"+z+": "+current_time);
					status=false;
				}
				
			}
						
			///Writing to the file at the end	    	 
	    	    try {
	    	        writer.write(output+"\n");
	    	    } catch (IOException e) {
	    	        System.err.println(e);
	    	    } finally {
	    	        if (writer != null) {
	    	            
	    	        }
	    	    }
	    	
	    	
	    }
		
		try {
            writer.close();
        } catch (IOException e) {
            System.err.println(e);
        }
}

}
