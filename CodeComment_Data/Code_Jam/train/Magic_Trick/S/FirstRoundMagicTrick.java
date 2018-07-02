package methodEmbedding.Magic_Trick.S.LYD1251;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FirstRoundMagicTrick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			
			
			int T = Integer.parseInt(br.readLine());
			
			
			for(int i =1; i<=T; i++)
			{
				boolean arraySearcher[]= new boolean[17];
				boolean libre = true;
				int firstRowAnswered = Integer.parseInt(br.readLine());
				String[] firstCardsLayout = new String[4];
				
				for(int j = 0 ; j<4; j++)
				{
					firstCardsLayout[j] = br.readLine()+"";
				}
				
				int secondRowAnswered = Integer.parseInt(br.readLine());;
				String[] secondCardsLayout = new String[4];
				
				for(int j = 0 ; j<4; j++)
				{
					secondCardsLayout[j] = br.readLine()+"";
				}
				
				String firstRowChosen[]=firstCardsLayout[firstRowAnswered-1].split(" ");
				String secondRowChosen[]=secondCardsLayout[secondRowAnswered-1].split(" ");
				
				for(int k = 0; k<firstRowChosen.length;k++)
				{
					arraySearcher[Integer.parseInt(firstRowChosen[k])]=true;
				}
				
				int counter = 0;
				int numberInBothRows=0;
				for(int k = 0; k<secondRowChosen.length;k++)
				{
					
					if(arraySearcher[Integer.parseInt(secondRowChosen[k])]==true)
					{
						counter++;
						if(counter>=2)
						{
							System.out.println("Case #"+i+": Bad magician!");
							libre=false;
							break;
						}
						else
						{
							numberInBothRows=Integer.parseInt(secondRowChosen[k]);
						}
					}
					else
					{
						arraySearcher[Integer.parseInt(secondRowChosen[k])]=true;
					}
				}
				if(libre)
				{
					if(numberInBothRows==0)
					{
						System.out.println("Case #"+i+": Volunteer cheated!");
					}
					else
					{
						System.out.println("Case #"+i+": "+numberInBothRows);
					}
				}
			}
			
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
