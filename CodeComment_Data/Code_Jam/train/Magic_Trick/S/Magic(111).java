package methodEmbedding.Magic_Trick.S.LYD1127;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

//import org.apache.commons.io.FileUtils;

public class Magic {

	public static void main(String[] args) {
		
		int n,t,r1,r2,count;
		
		
		
		
			
		
//		tmp1 = null;
//		tmp2 = null;
		
		
	try {
		
		BufferedReader reader=new BufferedReader(new FileReader("D:\\CodeJam\\in.txt"));
		
		String fileName = "D:\\CodeJam\\Out.txt";
		File fl = new File( fileName );
		
        
		if(!fl.exists()) {
		    fl.createNewFile();
		}
        
		
		FileOutputStream out = new FileOutputStream(fl, false);
        OutputStreamWriter ow = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(ow);
        
        System.out.println("Start");
        
        
        n=Integer.parseInt(reader.readLine());
        t=n+1;
        
        System.out.println(n);
        
        while(n!=0)
        {
        	bw.write("Case #"+(t-n)+": " );
        	System.out.println("Case #"+(t-n)+": " );
        	
        	List<String> tmp1 = new ArrayList<String>();	
    		List<String> tmp2 = new ArrayList<String>();
    		
        	r1 = Integer.parseInt(reader.readLine());
        	System.out.println(r1);
        	
        	for (int i=0; i<4 ; i++)
        	{
        		tmp1.add(reader.readLine());
        		System.out.println(tmp1.get(i));
        		
        	}
        	
        	r2 = Integer.parseInt(reader.readLine());
        	System.out.println(r2);
        	
        	for (int i=0; i<4 ; i++)
        	{
        		tmp2.add(reader.readLine());
        		System.out.println(tmp2.get(i));
        	}
        	
        	
        	String l1 = tmp1.get(r1-1);
        	System.out.println(l1);
        	
        	String[] items = l1.split(" ");
       		int[] results = new int[items.length];

        	for (int i = 0; i < items.length; i++) {
        	    try {
        	        results[i] = Integer.parseInt(items[i]);
        	    } catch (NumberFormatException nfe) {};
        	}
        	
        	String l2 = tmp2.get(r2-1);
        	String[] items2 = l2.split(" ");
       		int[] results2 = new int[items2.length];

        	for (int i = 0; i < items.length; i++) {
        	    try {
        	        results2[i] = Integer.parseInt(items2[i]);
        	    } catch (NumberFormatException nfe) {};
        	}
        	
        	
        	count = 0;
        	int val = 0;
        	
        	System.out.println(tmp2.get(r2-1));
        	
        	for (int i=0;i<4; i++)
        	{
        		for (int j=0; j<4; j++)
        		{
        			if ( results2[j] == results[i])
        		    {
        			 System.out.println(Integer.toString(results[i]));
        			 if (count == 0)
        				 val = results[i];
        			 count++;
        		     }
        		}		
        	}
        	
        	if (count > 0)
        	{
        		if (count >1)
        		{
        			bw.write("Bad Magician!");
        			bw.newLine();
        		}
                else
                {
                	bw.write(Integer.toString(val));
        			bw.newLine();
                }
            
        	}
        	else
        	{
        		bw.write("Volunteer Cheated!");
    			bw.newLine();
        	}
        	
        	n--;
        }
        
        
        reader.close();
        bw.close();
        ow.close();
        out.close();
        
       // s = FileUtils.readLines(fl).get(5);
        
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	}

}
