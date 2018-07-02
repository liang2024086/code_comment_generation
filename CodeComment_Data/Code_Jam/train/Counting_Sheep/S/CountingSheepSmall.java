package methodEmbedding.Counting_Sheep.S.LYD1202;

import java.util.*;
import java.io.*;
public class CountingSheepSmall {
	public static void main(String [] args){
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int num;
        int l = 0;
		int TestCase = in.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i<10; i++)
        {
            array.add(i);
        }
        int output = 0;
		for (int i = 1; i <= TestCase; i++)
			{
			num = in.nextInt();
            if (num == 0)
            {
                System.out.println("Case #"+ i +": INSOMNIA");
            }
            else 
            {
            
            String a = String.valueOf(num);
			outerloop :
                for (int k = 2; k<200; k++)
                    {
                    output = num *k;
					a = a + output; 
                   for (int x = 0; x < 10; x++)
                    {
                        if (a.contains(String.valueOf(x))) 
                        {
							
                            array.remove(new Integer(x)); 
                            
                            if (array.isEmpty()){
                            	array.add(0);
								array.add(1);
								array.add(2);
								array.add(3);
								array.add(4);
								array.add(5);
								array.add(6);
								array.add(7);
								array.add(8);
								array.add(9);
							   break outerloop;
                            }
                        }
                    }
                }
                System.out.println("Case #"+ i+": "+output);
                  
                
			}
                
        }
	
            


}
}
