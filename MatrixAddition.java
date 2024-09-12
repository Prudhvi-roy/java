import java.io.*;
import java.util.*;
class Matrixaddition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter rows and columns of first matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter rows and columns of second matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        if(r1!=r2 && c1!=c2)
        {
            System.out.println("Matrix addition not possible");
            System.out.println("order of the matrix does not match");
        }
        else
        {
            System.out.println("Enter" +(r1*c1)+ "Elements into first matrix");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter" +(r2*c2)+ "Elements into second matrix");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
                
            }
        }
        int c[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        
        System.out.println("After addition the resultant matrix is:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+ "" );
            }
            System.out.println("");
         }
    }
}
}
