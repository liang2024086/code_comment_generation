package methodEmbedding.Magic_Trick.S.LYD1656;

import java.util.Scanner;
import java.util.StringTokenizer;
public class A {

	public static void main(String[] args)
	{
		Scanner W = new Scanner(System.in);
		String test = W.nextLine();
		int nbreTest = Integer.parseInt(test);
		int aux = nbreTest;
		String result[] = new String[100];
		int k =0;
		while (nbreTest !=0)
		{
		test = W.nextLine();
		int answer1 = Integer.parseInt(test);
		String line1 = W.nextLine();
		String line2 = W.nextLine();
		String line3 = W.nextLine();
		String line4 = W.nextLine();
		String test1 = W.nextLine();
		int answer2 = Integer.parseInt(test1);
		String line11 = W.nextLine();
		String line22 = W.nextLine();
		String line33 = W.nextLine();
		String line44 = W.nextLine();
		int tab1[] = new int[4];
		int tab2[] = new int[4];
		int i =0;
		int j =0;
		int ctr=0;
		int value=0;
		switch(answer1)
		{
		case 1:
		StringTokenizer st1 = new StringTokenizer(line1," ");
		while(st1.hasMoreTokens())
		{
			tab1[i] = Integer.parseInt(st1.nextToken());
			i++;
		}
		break;
		case 2:
		StringTokenizer st2= new StringTokenizer(line2," ");
		while(st2.hasMoreTokens())
		{
			tab1[i] = Integer.parseInt(st2.nextToken());
			i++;
		}
		break;
		case 3:
		StringTokenizer st3 = new StringTokenizer(line3," ");
		while(st3.hasMoreTokens())
		{
			tab1[i] = Integer.parseInt(st3.nextToken());
			i++;
		}
		break;
		case 4:
		StringTokenizer st4 = new StringTokenizer(line4," ");
		while(st4.hasMoreTokens())
		{
			tab1[i] = Integer.parseInt(st4.nextToken());
			i++;
		}
		break;
	}

		switch(answer2)
		{
		case 1:
		StringTokenizer st1 = new StringTokenizer(line11," ");
		while(st1.hasMoreTokens())
		{
			tab2[j] = Integer.parseInt(st1.nextToken());
			j++;
		}
		break;
		case 2:
		StringTokenizer st2= new StringTokenizer(line22," ");
		while(st2.hasMoreTokens())
		{
			tab2[j] = Integer.parseInt(st2.nextToken());
			j++;
		}
		break;
		case 3:
		StringTokenizer st3 = new StringTokenizer(line33," ");
		while(st3.hasMoreTokens())
		{
			tab2[j] = Integer.parseInt(st3.nextToken());
			j++;
		}
		break;
		case 4:
		StringTokenizer st4 = new StringTokenizer(line44," ");
		while(st4.hasMoreTokens())
		{
			tab2[j] = Integer.parseInt(st4.nextToken());
			j++;
		}
		break;
	}

		for (i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if (tab1[i] == tab2[j])
				{
					ctr++;
				    value = tab1[i];
				}
			}
		}
		if (ctr == 0)
			result[k]="Volunteer cheated!";
		else if(ctr == 1)
			result[k]=String.valueOf(value);
		else
			result[k]="Bad magician!";
		k++;
		nbreTest--;
}
		for (int i=0;i<aux;i++)
			System.out.println("Case #"+(i+1)+": "+result[i]);
}}
