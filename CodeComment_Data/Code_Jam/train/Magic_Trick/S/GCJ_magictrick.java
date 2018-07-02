package methodEmbedding.Magic_Trick.S.LYD954;


			
			import java.io.*;
			import java.util.*;
			class GCJ_magictrick
			{
				public static void main(String args[])
				throws IOException
				{
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					int T=Integer.parseInt(br.readLine());
					
					for(int t=1;t<=T;t++)
					{
						ArrayList<Integer> list1=new ArrayList<Integer>();
						ArrayList<Integer> list2=new ArrayList<Integer>();

						int row1=Integer.parseInt(br.readLine());
						String str="";
						
						for(int i=1;i<=4;i++)
						{
							if(i==row1)
							{
								str=br.readLine();
								StringTokenizer st=new StringTokenizer(str);
								while(st.hasMoreTokens())
									list1.add(Integer.parseInt(st.nextToken()));
							}
							else
								str=br.readLine();
						}
						
						int row2=Integer.parseInt(br.readLine());
						for(int i=1;i<=4;i++)
						{
							if(i==row2)
							{
								str=br.readLine();
								StringTokenizer st=new StringTokenizer(str);
								while(st.hasMoreTokens())
								{
									int a=Integer.parseInt(st.nextToken());
									if(list1.contains(a))
										list2.add(a);
								}
							}
							else
								str=br.readLine();
						}
						//
						if(list2.size()==1)
							System.out.println("Case #"+t+": "+list2.get(0));
						else if(list2.size()==0)
							System.out.println("Case #"+t+": Volunteer cheated!");
						else if(list2.size()>1)
							System.out.println("Case #"+t+": Bad magician!");
						
						
					}
				}
			}
