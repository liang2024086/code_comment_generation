package methodEmbedding.Standing_Ovation.S.LYD1031;


public class A {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int cases = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < cases; i++)
		{
			String casa = input.nextLine();
			int max = Integer.parseInt(casa.substring(0,1));
			
			// get the array of numbers
			int arr[] = new int[max + 1]; 
			for(int j = 2; j < max + 2 + 1; j++)
			{	
				arr[j - 2] = Integer.parseInt(casa.substring(j, j+1));
			}
			
			
			int ppl = 0;
			int fwends = 0;
			for(int j = 0; j < max + 1; j++)
			{
				if(ppl < j && arr[j] != 0)
				{
					fwends += j - ppl;
					ppl += fwends;
				}
				ppl += arr[j];
			}
			
			System.out.println("Case #"+(i+1)+": "+ fwends);
			
		}

	}

}
