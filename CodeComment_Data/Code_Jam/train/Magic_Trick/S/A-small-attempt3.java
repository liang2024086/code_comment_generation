package methodEmbedding.Magic_Trick.S.LYD1851;

public class MagicTrick {

	public static void main(String[] args)
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		int[][]board = new int[4][4];
		for(int i = 0; i < T; i++)
		{
			int count = 0;
			String x = "";
			int row = Integer.parseInt(scan.nextLine())-1;
			for(int j = 0; j < 4; j++)
			{
				String[] line = scan.nextLine().split(" ");
				for(int k = 0; k < 4; k++)
					board[j][k] = Integer.parseInt(line[k]);
			}
			String n = "";
			for(int j = 0; j < board[row].length; j++)
				n+=" "+board[row][j];
			n+=" ";
			row = Integer.parseInt(scan.nextLine())-1;
			for(int j = 0; j < 4; j++)
			{
				String[] line = scan.nextLine().split(" ");
				for(int k = 0; k < 4; k++)
					board[j][k] = Integer.parseInt(line[k]);
			}
			
			for(int j = 0; j < board[row].length; j++)
				if(n.contains(" "+board[row][j]+" "))
				{
					count++;
					x+=""+board[row][j];
				}
			System.out.print("Case #"+(i+1) + ": ");
			if(count == 0)
				System.out.println("Volunteer cheated!");
			if(count == 1)
				System.out.println(x);
			if(count > 1)
				System.out.println("Bad magician!");	
		}
	}
}
