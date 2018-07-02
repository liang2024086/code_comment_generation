package methodEmbedding.Counting_Sheep.S.LYD417;

import java.util.*;
public class Main {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
for(int j=0;j<n;j++)
{
	int a= sc.nextInt();
	sc.nextLine();
	int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c0= 0;
	if(a!=0){
		
		for(int i=1;i<=1000000000;i++)
	  {
		String b=String.valueOf(a*i); 
		//System.out.println(b.length());
		int t=0;
		  while(t< b.length())
		  {
			  if(b.charAt(t) == '0')
			  	{
				    c0++;
			  	}
			  else if(b.charAt(t) == '1')
				{
					c1++;
				}  
			  
			  else if(b.charAt(t) == '2')
				{
					c2++;
				}
			  else if(b.charAt(t) == '3')
				{
					c3++;
				}
			  else if(b.charAt(t) == '4')
				{
					c4++;
				}
			  else if(b.charAt(t) == '5')
				{
					c5++;
				}
			  else if(b.charAt(t) == '6')
				{
					c6++;
				}
			  else if(b.charAt(t) == '7')
				{
					c7++;
				}
			  else if(b.charAt(t) == '8')
				{
					c8++;
				}
			  else if(b.charAt(t) == '9')
				{
					c9++;
				}
			  else break;
			  
			 t++;
		  }
		  
		  
		  if(c0!=0 && c1!=0 && c2!=0 && c3!=0 && c4!=0 && c5!=0 && c6!=0 && c7!=0 && c8!=0 && c9!=0){System.out.println("Case #" + (j+1)+ ": " + b);break;}
		  else continue;
		  
		}
}
	else {System.out.println("Case #" + (j+1)+ ": " +"INSOMNIA");}
}

}
}



