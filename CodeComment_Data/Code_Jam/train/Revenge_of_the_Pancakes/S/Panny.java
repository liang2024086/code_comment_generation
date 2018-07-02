package methodEmbedding.Revenge_of_the_Pancakes.S.LYD882;

import java.util.Scanner;
class Panny {
  public static void main(String a[])
     {int fl=0,m=0, fl1=0,t=0,i=0,index=0,n=0;
                          char b,q='+';
                          Scanner v = new Scanner(System.in);
                             int T = v.nextInt();
                            int arr[]=new int[T+1];
				String list[]=new String[T+1];
			            
                                   

                                     for(i=0;i<T+1;i++)
			                    {  

                                         
				           list[i]=new String(v.nextLine());
					   int p=list[i].length();
                                                  t=0;
 				           for( index=0;index<list[i].length();index++)
					        { 
					            q=list[i].charAt(index);
                                                    if(q=='-')
                                                        fl1=1;
                                                    if(q=='+')
                                                        fl=1;

                                                   if(index!=p-1)
                                                   {  b=list[i].charAt((index+1));
	                                              if(q!=b)
     						            t++;
                                                      }
                                                   }
                                                        if(q=='-')
                                                          t++;
					              
	                                         
                  if(fl==0)
                                                      arr[i]= 1;    
		                                       else if(fl1==0)
                                                        arr[i]=0;
                                                            else
                                                                 arr[i]=t;

                                             }

 for( i = 1; i <T+1; i++)
{ 
System.out.println("Case #" + (i) +": "+ arr[i] );

}


}}


