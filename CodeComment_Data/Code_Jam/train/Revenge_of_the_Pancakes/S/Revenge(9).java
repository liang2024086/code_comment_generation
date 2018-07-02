package methodEmbedding.Revenge_of_the_Pancakes.S.LYD283;


import java.util.Scanner;

public class Revenge {
						public static void main(String[] args){
							Scanner s = new Scanner(System.in);
							int t = s.nextInt();
							for(int i =0;i<t;i++){
								String a = s.next();
								int l = a.length(),g=0;
									int j=0;
										while(j!=l){
											if(a.charAt(j)=='-'){
												while(j!=l &&a.charAt(j)!='+'){
													j++;}
												g++;
												}
												else{
													while(j!=l &&a.charAt(j)!='-'){
														j++;}
													g++;
												}
											
											}
										if(a.charAt(l-1)=='+')
											System.out.println(g-1);
										else
											System.out.println(g);	
										}
										
							}
						}
