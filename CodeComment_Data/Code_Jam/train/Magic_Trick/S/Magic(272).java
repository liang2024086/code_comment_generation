package methodEmbedding.Magic_Trick.S.LYD884;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Magic 
{

	public static void main(String[] args) 
	{
	 int t,i,j,z,count = 0,k,selected,numSelect = 0;
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 try
	 {
		 t = Integer.parseInt(br.readLine());
		 String[] result = new String[t + 1];
		 String capture;
		 int[][] formation1 = new int[5][5];
		 int[][] formation2 = new int[5][5];
		 int selection1,selection2;
		 String[] splitted = new String[5];
		 for(i = 1 ; i<=t ; i++)
		 {
			 result[i] = "Case #" + i + ": ";
			 selection1 = Integer.parseInt(br.readLine());
			 for(j = 1 ; j <= 4 ; j++)
			 {
				 capture = br.readLine();
				 splitted = capture.split("\\s+");
				 for(z = 1, k = 0 ; z <= 4 && k < 4 ; z++, k++)
				 {
					 formation1[j][z] = Integer.parseInt(splitted[k]);
				 }
			 }
			 selection2 = Integer.parseInt(br.readLine());
			 for(j = 1 ; j <= 4 ; j++)
			 {
				 capture = br.readLine();
				 splitted = capture.split("\\s+");
				 for(z = 1, k = 0 ; z <= 4 && k < 4 ; z++, k++)
				 {
					 formation2[j][z] = Integer.parseInt(splitted[k]);
				 }
			 }
			 count = 0;
			 for(j = 1 ; j <=4 ; j++)
			 {
				 selected = formation1[selection1][j];
				 for(z = 1 ; z <=4 ; z++)
				 {
					 if((selected - formation2[selection2][z]) == 0)
					 {
						 count++;
						 numSelect = selected;
					 }
				 }
			 }
			 if(count == 1)
				 result[i] = result[i] + numSelect;
			 else if(count > 1)
				 result[i] = result[i] + "Bad magician!";
			 else if(count == 0)
				 result[i] = result[i] + "Volunteer cheated!";
			}
		 for(z = 1 ; z <= t; z++)
			 System.out.println(result[z]);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
	}

}
