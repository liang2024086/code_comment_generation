package methodEmbedding.Standing_Ovation.S.LYD1284;

import java.io.*;

class StandingOvation
{

	public static void main(String[] args) throws IOException
	{


      FileReader in = new FileReader("A-small-attempt2.in");
      BufferedReader br = new BufferedReader(in);
      FileWriter fw = new FileWriter("output.txt");
	  BufferedWriter bw = new BufferedWriter(fw);
			int q=0;
   	  
      try
      {
     
      	int num = Integer.valueOf(br.readLine());
      	int num1 = num;
      	
      	while( num-- != 0)
      	{
      		 int n=0,count=0,aud=0;
      		 n = br.read();
      		
      		n = n - 47;
      		
      		String data = br.readLine();

      		
      		int[] arr = new int[n];

      		for (int i=0; i<n; i++)
      		{
      			arr[i] = Integer.valueOf(data.charAt(i+1)) - 48;
      		}


      	count += arr[0];
		for(int i=1;i<n;i++)
		{	
			int z=0;
			
			if(i > count)
			{			
				z = i - count;
			}

			count = count + arr[i] + z;
			aud += z;
		}
			q = num1 - num;
			String res = "Case #" + q+ ": " + String.valueOf(aud) + "\n";		
			bw.write(res);
			
      		
      	}

      }
      finally{
      	br.close();
      	bw.close();
      }
		
	}
}
