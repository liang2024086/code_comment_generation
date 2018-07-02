package methodEmbedding.Magic_Trick.S.LYD976;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Magic_Trick {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = null;
	    PrintStream writer=null;
	    int test=0;
	    String line;
	    StringTokenizer st;
	    
	    List<Integer> ary_1=new ArrayList<Integer>();
	    List<Integer> ary_2=new ArrayList<Integer>();
	    int row_1,row_2,total,num;
	    
	    
	    try								{  reader = new BufferedReader(new FileReader("Magic.in"));	}
	    catch(FileNotFoundException e)	{  System.out.println("File not found");     					}
		
	    try								{   writer = new PrintStream(new FileOutputStream("Magic_out.txt"));	 }
	    catch(Exception e)				{   System.out.println("Error writing to file");	     		 }
	      
	    
	    test=Integer.parseInt(reader.readLine());
	    System.out.println(test);
	    //reader.readLine();
	    //reader.readLine();
	    
	    for(int x=0;x<test;x++){
	    	ary_1.clear();
	    	ary_2.clear();
	    	total=0;
	    	num=0;
	    	
	    	row_1=Integer.parseInt(reader.readLine());
	    	for(int i=1;i<row_1;i++)	reader.readLine();
	    	st = new StringTokenizer(reader.readLine().toString());
	    	for(int j=0;j<4;j++)  	ary_1.add(Integer.parseInt(st.nextToken()));
	    	for(int j=0;j<4;j++)	System.out.print(ary_1.get(j)+"\t");
	    	System.out.println();
	    
	    	for(int i=0;i<4-row_1;i++)	reader.readLine();
	    	
	    	row_2=Integer.parseInt(reader.readLine());
	    	for(int i=1;i<row_2;i++)	reader.readLine();
	    	st = new StringTokenizer(reader.readLine().toString());
	    	for(int j=0;j<4;j++)  	ary_2.add(Integer.parseInt(st.nextToken()));
	    	for(int j=0;j<4;j++)	System.out.print(ary_2.get(j)+"\t");
	    	System.out.println("\n");
	    	
	    	for(int i=0;i<4-row_2;i++)	reader.readLine();
	    	
	    	//computing
	    	for(int i=0;i<4;i++){
	    		if(ary_2.contains(ary_1.get(i))){
	    			total++;
	    			num=ary_1.get(i);
	    		}
	    		if(total==2)	break;
	    	}
	    	if(total==0){
	    		System.out.println("Volunteer cheated!");
	    		writer.println("Case #"+(x+1)+": Volunteer cheated!");
	    	}
	    	else if(total==1){
	    		System.out.println(num);
	    		writer.println("Case #"+(x+1)+": "+num);
	    	}
	    	else{
	    		System.out.println("Bad magician!");
	    		writer.println("Case #"+(x+1)+": Bad magician!");
	    	}
	    	
	    	
	    }
	    writer.close();
	}

}
