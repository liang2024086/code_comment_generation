package methodEmbedding.Magic_Trick.S.LYD1996;

import java.util.*;

public class Solution1 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		//System.out.println("Number is: "+N);
		for(int i=0;i<N;i++)
		{
			int choice1=Integer.parseInt(sc.nextLine());
			//System.out.println("choice1 is: "+choice1);
			Hashtable<Integer,ArrayList<String>> data1= new Hashtable<Integer,ArrayList<String>>();
		    for(int j=0;j<4;j++)
		    {
		    	String val=sc.nextLine();
		    	String[] param=val.split(" ");
		      	List<String> value= Arrays.asList(param);
		      	ArrayList d= new ArrayList(value);
		    	data1.put(j+1,d);
		    }
		    int choice2=Integer.parseInt(sc.nextLine());
		    //System.out.println("choice2 is: "+choice2);
			Hashtable<Integer,ArrayList<String>> data2= new Hashtable<Integer,ArrayList<String>>();
		    for(int j=0;j<4;j++)
		    {
		    	String val=sc.nextLine();
		    	String[] param=val.split(" ");
		    	List<String> value= Arrays.asList(param);
		    	ArrayList d= new ArrayList(value);
		    	data2.put(j+1,d);
		    }
		    ArrayList<String> val1=data1.get(choice1);
		    //System.out.println("choice1 list is: "+val1);
		    ArrayList<String> val2=data2.get(choice2);
		    //System.out.println("choice2 list is: "+val2);
		    val1.retainAll(val2);
		    if(val1.size()==1)
		    {
		    	System.out.println("Case #"+(i+1)+": " +val1.get(0));
		    }
		    else if((val1.size()==0))
		    {
		    	System.out.println("Case #"+(i+1)+": Volunteer cheated!" );
		    }
		    else if((val1.size()>1))
		    {
		    	System.out.println("Case #"+(i+1)+": Bad magician!" );
		    }
		    data1.clear();
		    data2.clear();
		}
	}
}
