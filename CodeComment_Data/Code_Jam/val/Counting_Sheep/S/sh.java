package methodEmbedding.Counting_Sheep.S.LYD536;


import java.util.Scanner;

public class sh {

	public static void main(String[] args) {
		int T;
		int tab[];
		int n,n1,no,bool=0,indx=0;
        Scanner sc = new Scanner(System.in);
		
		T=sc.nextInt();
		tab= new int [T];
		for(int i =0; i< T; i++)
		{
			tab[i]= sc.nextInt();
			
		}
		
		for(int i =0; i< T; i++)
		{
			//System.out.println(tab[i]);
			indx=0;
			no=tab[i];
			int tb []={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
			
			if (no==0)
			{
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			else
			{
				
					loop: while(true)
						
					{n=no;
					//System.out.println("ok1");
					while (n > 0) 
					{//System.out.println("ok");
					    n1= (n % 10);
					    for(int j=0;j<10;j++)
					    {if (n1==tb[j]) { bool=1;break; } }
					   
					    if(bool==0)
					    {
					    	tb[indx]=n1;
					    	indx+=1;
					    }
					    if(indx==10)
					    {
					    	System.out.println("Case #"+(i+1)+": "+no);
					    	break loop;
					    }
					    bool=0;
					    n = n / 10;
					}
					no+=tab[i];
				}
			}
			
		}

	}}
