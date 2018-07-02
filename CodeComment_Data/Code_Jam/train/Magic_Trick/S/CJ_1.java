package methodEmbedding.Magic_Trick.S.LYD1814;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


class CJ_1
{
public static void main(String a[])
{
int tot_no_cases = 0;
int case_loop = 1;
int call_1,call_2,skip_line,count,match_cnt,selected_card;
int[] arr = new int[4];
int[] arr_1 = new int[4];
String row_prim,row_secondary,result="0";
BufferedReader br = null;
BufferedWriter bw = null;
StringTokenizer strToken;
	try {
 
		String sCurrentLine;
 		br = new BufferedReader(new FileReader("D:\\A-small-attempt3.in"));
		File file = new File("D:\\A-small-attempt_op3.in");
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		bw = new BufferedWriter(fw);
        tot_no_cases = Integer.parseInt(br.readLine());
		for (case_loop = 1; case_loop<=tot_no_cases;case_loop++)
			{
			 match_cnt=0;
			 selected_card=0;
			 skip_line = 0;
			 call_1	= Integer.parseInt(br.readLine());
			 while (call_1-1 != skip_line)
				{
				skip_line++;
				br.readLine();
				}
			  strToken = new StringTokenizer(br.readLine());
			  count = strToken.countTokens();
			  for(int x = 0;x < count;x++)
			        arr[x] = Integer.parseInt((String)strToken.nextElement());	
			
			  while(skip_line<=2)
				{
				br.readLine();skip_line++;
				}
			 skip_line =0;
			 call_2	= Integer.parseInt(br.readLine());
			 while (call_2-1 != skip_line)
				{
				skip_line++;
				br.readLine();
				}
			  strToken = new StringTokenizer(br.readLine());
			  count = strToken.countTokens();
			  for(int x = 0;x < count;x++) 
			        arr_1[x] = Integer.parseInt((String)strToken.nextElement());

              while(skip_line<=2)
				{
				br.readLine();skip_line++;
				}
			
			 match_cnt = 0;
			 for(  int  i=0;i<4;i++)
					for(  int  j=0;j<4;j++)
						{
								if(arr[i] == arr_1[j])
								{
									match_cnt =  match_cnt+1; 
									selected_card = arr[i];
								}
						}
					
			 if(match_cnt == 1)
				 result  =  ""+selected_card;
			 else  if(match_cnt == 0)
				 result  =   "Volunteer cheated!";
			 else
				 result  =   "Bad magician!";
 			 
			 bw.write("Case #"+case_loop+": "+result+"\n");
				 

			}
		}
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

}
}
}	
