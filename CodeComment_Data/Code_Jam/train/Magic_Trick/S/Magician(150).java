package methodEmbedding.Magic_Trick.S.LYD1897;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Magician {

	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		int arrngmnt_1[][]=new int[4][4];
		int arrngmnt_2[][]=new int[4][4];
		int case_no=1;
		int row_1 = 0;
		int row_2 = 0;
		int result = 0;
		int result_val = 0;
		int no = 0;		
		Map<Integer,Integer> mMap = new HashMap<Integer,Integer>();
		while(t>0)
		{
			row_1=in.nextInt();
			result = 0;
			result_val = 0;		           
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					no=in.nextInt();
					arrngmnt_1[i][j]=no;
					if((i+1)==row_1)
					{
						mMap.put(no, 1);
					}
				}
			}
			
			row_2=in.nextInt();
			
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					no=in.nextInt();
					arrngmnt_2[i][j]=no;
					if((i+1)==row_2)
					{
						if (mMap.containsKey(no))
						{
							result++;
							result_val = no;
						}
					}
				}
			}
			
			if (result == 1 )
			{
				System.out.println("Case #"+case_no+": "+result_val);
			}
			else if (result > 1)
			{
				System.out.println("Case #"+case_no+": Bad magician!");
			}
			else if (result == 0)
			{
				System.out.println("Case #"+case_no+": Volunteer cheated!");
			}
			mMap.clear();
			t--;
			case_no++;
			
		}

	}



}

