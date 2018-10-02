package methodEmbedding.Counting_Sheep.S.LYD1385;

import java.util.*;
import java.io.*;
public class CountingSheep{
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      int n=in.nextInt();
      ArrayList<Integer> arrlist=new ArrayList<Integer>(10);
      arrlist.add(0);arrlist.add(1);arrlist.add(2);arrlist.add(3);arrlist.add(4);
      arrlist.add(5);arrlist.add(6);arrlist.add(7);arrlist.add(8);arrlist.add(9);
      if (n==0)
      	System.out.println("Case #" + i + ": INSOMNIA" );
      else
      {
      	int cnt=1;
      	while(true)
      	{
      		int temp=n*cnt;
      		String no=""+temp;
      		int j=0;
	      	while(j<arrlist.size())
	      	{
	      		if(no.contains(""+arrlist.get(j)))
	      		{	arrlist.remove(j);
	      			//for(int a=0;a<arrlist.size();a++)
	      				//System.out.print(" "+arrlist.get(a));
	      		}
	      		else
	      			j++;

	      	}
	      	//System.out.println(no+ " "+arrlist.size());
	      	if(arrlist.size()==0)
	      	{	System.out.println("Case #" + i + ": " +temp);
	      		break;
	      	}
	      	cnt++;
      	}
      }
    }
  }
}
