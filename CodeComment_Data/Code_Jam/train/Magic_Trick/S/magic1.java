package methodEmbedding.Magic_Trick.S.LYD1068;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
class magic1
	{
	public static void main(String args[])throws IOException
		{
		try
			{
			File input=new File("input.txt");
			Scanner sc=new Scanner(input);
			String line[]=new String[1050];
			int i,j,k,x,y;
			i=0;
			int count=0;
			int total_cases,counter;
			int first=0;
			int second=0;
			int card1[][]=new int[4][4];
			int card2[][]=new int[4][4];
			int req1[]=new int[4];
			int req2[]=new int[4];
			int ans=0;
			int casenumber=1;
			File output=new File("output1.txt");
			FileWriter f=new FileWriter(output,true);
			while(sc.hasNextLine())
				{
				line[i]=sc.nextLine();
				Scanner sc2=new Scanner(line[i]);
				if(i==0)
					{
					total_cases=sc2.nextInt();
					System.out.println("TOTAL CASES:"+total_cases);
					}
				
				else
					{
					if(count>9)
						{
						for(x=0;x<4;x++)
							{
							if(x==first)
								{
								for(y=0;y<4;y++)
									{
									req1[y]=card1[x][y];
									//System.out.print(card1[x][y]+"\t\t");
									}
								System.out.println();
								}

							}
						for(x=0;x<4;x++)
							{
							if(x==second)
								{
								for(y=0;y<4;y++)
									{
									req2[y]=card2[x][y];
									//System.out.print(card1[x][y]+"\t\t");
									}
								System.out.println();
								}

							}
						counter=0;
						/*
						for(x=0;x<4;x++)
						System.out.print(req1[x]+"\t\t");
						System.out.println();
						for(x=0;x<4;x++)
						System.out.print(req2[x]+"\t\t");
						System.out.println();
						*/
						for(x=0;x<4;x++)
							{
								
									for(y=0;y<4;y++)
										if(req1[x]==req2[y])
											{
											ans=req1[x];
											counter++;
											}
		
							}		
						if(counter==0)
							{
							System.out.println("Case #"+(casenumber)+": Volunteer cheated!");
							f.write("Case #"+(casenumber++)+": Volunteer cheated!\n");
							}
						else if(counter==1)
							{
							System.out.println("Case #"+(casenumber)+":"+ans);
							f.write("Case #"+(casenumber++)+": "+ans+"\n");
							}
						else
							{
							System.out.println("Case #"+(casenumber)+": Bad magician");
							f.write("Case #"+(casenumber++)+": Bad magician\n");
							}
						
						/*
						try
							{
							Thread.sleep(1000);
							}
						catch (Exception e)
							{
							System.out.print(e);
							}
						*/
						count=0;		
						}
					if(count==0)
						{
						first=sc2.nextInt();
						first--;
						//System.out.println("First row is"+first--);
						}
					if(count==5)
						{
						second=sc2.nextInt();
						second--;
						//System.out.println("Second row is"+second--);
						}
					if(count>0 && count <5)
						{
						x=count-1;
						for(y=0;y<4;y++)
							{
							card1[x][y]=sc2.nextInt();
							}
						/*	
						for(y=0;y<4;y++)	
						System.out.print(card1[x][y]+"\t\t");
						
						System.out.println();
						*/
						}
					if(count>5 && count <10)
						{
						x=count-6;
						for(y=0;y<4;y++)
							{
							card2[x][y]=sc2.nextInt();
							}
						/*	
						for(y=0;y<4;y++)	
						System.out.print(card2[x][y]+"\t\t");
						
						System.out.println();
						*/
						}	
					count++;	
					}
				/*	
				try
				{
				Thread.sleep(1000);
				}
				catch (Exception e)
				{
				System.out.print(e);
				}	
				*/
				i++;
				}	
				if(count>9)
						{
						for(x=0;x<4;x++)
							{
							if(x==first)
								{
								for(y=0;y<4;y++)
									{
									req1[y]=card1[x][y];
									//System.out.print(card1[x][y]+"\t\t");
									}
								System.out.println();
								}

							}
						for(x=0;x<4;x++)
							{
							if(x==second)
								{
								for(y=0;y<4;y++)
									{
									req2[y]=card2[x][y];
									//System.out.print(card1[x][y]+"\t\t");
									}
								System.out.println();
								}

							}
						counter=0;
						/*
						for(x=0;x<4;x++)
						System.out.print(req1[x]+"\t\t");
						System.out.println();
						for(x=0;x<4;x++)
						System.out.print(req2[x]+"\t\t");
						System.out.println();
						*/
						for(x=0;x<4;x++)
							{
								
									for(y=0;y<4;y++)
										if(req1[x]==req2[y])
											{
											ans=req1[x];
											counter++;
											}
		
							}		
						if(counter==0)
							{
							System.out.println("Case #"+(casenumber)+": Volunteer cheated!");
							f.write("Case #"+(casenumber++)+": Volunteer cheated!\n");
							}
						else if(counter==1)
							{
							System.out.println("Case #"+(casenumber)+":"+ans);
							f.write("Case #"+(casenumber++)+": "+ans+"\n");
							}
						else
							{
							System.out.println("Case #"+(casenumber)+": Bad magician");
							f.write("Case #"+(casenumber++)+": Bad magician\n");
							}
					}	
				f.flush();
				f.close();				
				}
		catch(FileNotFoundException e)
			{
			e.printStackTrace();
			}
		
		/*
		FileReader finput=new FileReader(input);

		char nums[]=new char[10000];
		finput.read(nums);
		String numbers=new String(nums);
		numbers=numbers.trim();
		//System.out.print(numbers);
		
		int i=0;
		int j,k;
		int number_of_lines=0;
		while(i<numbers.length())
			{
			if(numbers.charAt(i)==(char)13)
				number_of_lines++;
			i++;	
			}
		number_of_lines++;
		String line[]=new String[number_of_lines];
		line=numbers.split(""+(char)13);
		for(i=0;i<number_of_lines;i++)
			{
			line[i]=line[i].trim();
			//System.out.println(line[i]+"\t\t\t\t\t"+line[i].length());
			}
		//System.out.println("\n\nNo. of lines are"+number_of_lines);
		
		String line_number[][]=new String[number_of_lines][20];
		
		int spaces[]=new int[number_of_lines];
		for(i=0;i<number_of_lines;i++)
			spaces[i]=0;
		for(i=0;i<number_of_lines;i++)
			{
			for(j=0;j<line[i].length();j++)
			if(line[i].charAt(j)==' ')
				spaces[i]++;
			spaces[i]++;
			}
		*/	
		/*	
		for(i=0;i<number_of_lines;i++)
			{
			System.out.println(line[i]+"\t\t\t\t\t"+spaces[i]);
			try
				{
				Thread.sleep(2000);
				}
			catch (Exception e)
				{
				System.out.print(e);
				}
			}
		*/	
		/*
		for(i=0;i<number_of_lines;i++)
		line_number[i]=line[i].split(" ");
		*/
		/*
		for(i=0;i<number_of_lines;i++)
			{
			for(j=0;j<spaces[i];j++)
				{
				System.out.print(line_number[i][j]+"  ");
				}
			try
				{
				Thread.sleep(1);
				}
			catch (Exception e)
				{
				System.out.print(e);
				}	
			System.out.println();
			}
				
		*/
		/*
		int test_case=Integer.parseInt(line_number[0][0]);
		
	
		k=0;
		int first,second;
		int count=0;
		int card1[][]=new int[10][10];
		int card2[][]=new int[10][10];
		int x,y,z;
		for(i=1;i<11;i++)
			{
				if(count>9)
					count=0;

				if(count==0)
					{
					first=Integer.parseInt(line[i]);
					count++;
					}
				else if(count==5)
					{
					second=Integer.parseInt(line[i]);
					count++;
					}
				else if(count==1)
					{
					for(x=0;x<4;x++)
						for(y=0;y<4;y++)
							card1[x][y]=Integer.parseInt(line_number[i][y]);
					count=count+4;
					}
				
				else if(count==6)
					{
					for(x=0;x<4;x++)
						for(y=0;y<4;y++)
							card2[x][y]=Integer.parseInt(line_number[i][y]);	
					count=count+4;	
					}
				else
					{
					}
			}
		
		for(x=0;x<4;x++)
			{
			for(y=0;y<4;y++)
				System.out.print(card1[x][y]);
			System.out.println();		
			}	
		*/
		}
	}
	
