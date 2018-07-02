package methodEmbedding.Revenge_of_the_Pancakes.S.LYD209;

/**
 * Created by aneezjoseph on 31/03/16.
 */
//Write the spiral matrix for a given matrix
import java.util.Scanner;
public class Spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int count_time,i_initial,j_initial,i_final,j_final,flag;
        flag=i_initial=j_initial=0;
        i_final=row-1;
        j_final=column-1;
        int ele_matrix[][]=new int[row][column];
        if(row<=column)
            count_time=row*2-1;
        else
            count_time=column*2;
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++)
                ele_matrix[i][j] = sc.nextInt();
        }
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++)
                System.out.print(ele_matrix[i][j]);
            System.out.println();
        }
        for(int i=0;i<count_time;i++)
        {
            if(flag==0)
            {
                for(int j=j_initial;j<=j_final;j++)
                    System.out.print(ele_matrix[i_initial][j]+" ");
                i_initial++;
                flag=1;
            }
            else if(flag==1)
            {
                for(int j=i_initial;j<=i_final;j++)
                    System.out.print(ele_matrix[j][j_final]+" ");
                j_final--;
                flag=2;
            }
            else if(flag==2)
            {
                for(int j=j_final;j>=j_initial;j--)
                    System.out.print(ele_matrix[i_final][j]+" ");
                i_final--;
                flag=3;
            }
            else
            {
                for(int j=i_final;j>=i_initial;j--)
                    System.out.print(ele_matrix[j][j_initial]+" ");
                j_initial++;
                flag=0;
            }
        }}}
