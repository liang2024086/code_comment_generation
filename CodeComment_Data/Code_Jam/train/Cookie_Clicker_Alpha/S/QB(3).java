package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1517;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QB {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("test.in"));
		int InputNumber = sc.nextInt();
		sc.nextLine();
		
		for(int index = 1; index <= InputNumber; index++)
		{
		  double c =sc.nextDouble();
		  double f =sc.nextDouble();
		  double x =sc.nextDouble();
		  sc.nextLine();
		  //===================================================
		  double speed = 2;
		  double current = 0;
		  double time = 0;
		  
		  while(current < x)
		  {
			  if((x - current)/speed > (x - current + c)/(speed + f) && (current >= c))
			  {
				 // System.out.println("x: "+ x + " current:"+current +" speed:"+speed +" f:"+f);
				// System.out.println((x - current)/speed);
				// System.out.println((x - current + c)/(speed + f));
				  
				 current -= c;
			     speed += f;
			  }
			  
			  if(c < (x - current))
			  {
				  double nextC = c / speed;
				  time += nextC;
				  current += c;  
				//  System.out.println(current);
				//  System.out.println(speed);
				//  System.out.println(time);
			  }
			  else
			  {
				  time += (x - current) / speed;
				  current = x;  
				 // System.out.println("aaaaaaaaaaaaaaaaaaaaa");
			  }		
			 // System.out.println(current + " " + speed);
			 // System.out.println("===================================");
		  }
		  
		  System.out.println("Case #" + index + ": " + time);
		}
		
	}

}
