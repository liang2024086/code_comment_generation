package methodEmbedding.Magic_Trick.S.LYD383;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine()); 
		for(int i = 1; i<=s ; i++)
		{
			int a = Integer.parseInt(br.readLine());
			int arr[][];
			int arr2[][];
			arr = new int [4][4];
			arr2 = new int [4][4];

			for(int j = 0; j<4 ; j++)
			{
				String tem[] = br.readLine().split("\\s"); 
				arr[j][0] = Integer.parseInt(tem[0]);
				arr[j][1] = Integer.parseInt(tem[1]);
				arr[j][2] = Integer.parseInt(tem[2]);
				arr[j][3] = Integer.parseInt(tem[3]);
				
			}
			
			int b = Integer.parseInt(br.readLine());
			for(int j = 0; j<4 ; j++)
			{
				String tem[] = br.readLine().split("\\s"); 
				arr2[j][0] = Integer.parseInt(tem[0]);
				arr2[j][1] = Integer.parseInt(tem[1]);
				arr2[j][2] = Integer.parseInt(tem[2]);
				arr2[j][3] = Integer.parseInt(tem[3]);
			}
			
				HashSet<Integer> hs = new HashSet<Integer>();
				hs.add(arr[a-1][0]);
				hs.add(arr[a-1][1]);
				hs.add(arr[a-1][2]);
				hs.add(arr[a-1][3]);
				if (hs.size() != 4)
					System.out.println("Case #"+i+": Bad magician!");
				else
				{
					int cont = 0;
					
					if(hs.contains(arr2[b-1][0]))
						cont++;
					if(hs.contains(arr2[b-1][1]))
						cont++;
					if(hs.contains(arr2[b-1][2]))
						cont++;
					if(hs.contains(arr2[b-1][3]))
						cont++;
					
					if(cont==0)
						System.out.println("Case #"+i+": Volunteer cheated!");
					else if(cont==1)
					{
						if(hs.contains(arr2[b-1][0]))
							System.out.println("Case #"+i+": "+arr2[b-1][0]);
						else if(hs.contains(arr2[b-1][1]))
							System.out.println("Case #"+i+": "+arr2[b-1][1]);
						else if(hs.contains(arr2[b-1][2]))
							System.out.println("Case #"+i+": "+arr2[b-1][2]);
						else if(hs.contains(arr2[b-1][3]))
							System.out.println("Case #"+i+": "+arr2[b-1][3]);
					}
					else if (cont>1)
						System.out.println("Case #"+i+": Bad magician!");
				}					
		}

	}

}
