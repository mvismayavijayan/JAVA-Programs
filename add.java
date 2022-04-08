import java.util.Scanner;
class add
 {
  public static void main(String args[])
   {
     int r1,c1,r2,c2,i,k,j;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the number of rows of first matrix");
     r1=s.nextInt();
     System.out.println("enter the number of columns of first matrix");
     c1=s.nextInt();
     System.out.println("enter the number of rows of second matrix");
     r2=s.nextInt();
     System.out.println("enter the number of columns of second matrix");
     c2=s.nextInt();
     if(r1==r2 && c1==c2)
     {
       int a[][]=new int[r1][c1];
       int b[][]=new int[r2][c2];
       int c[][]=new int[r1][c1];
     System.out.println("enter the elements of first matrix");
     for(i=0;i<r1;i++)
     {
        for(j=0;j<c1;j++)
          {
             a[i][j]=s.nextInt();
          }
           System.out.println("");
      }

     System.out.println("enter the elements of second matrix");
     for(i=0;i<r2;i++)
     {
        for(j=0;j<c2;j++)
          {
             b[i][j]=s.nextInt();
          }
         System.out.println("");
      }
    System.out.println("result");
     for(i=0;i<r2;i++)
     {
        for(j=0;j<c2;j++)
          {
             c[i][j]=a[i][j]+b[i][j];
             System.out.print(c[i][j]+" ");
          }
     System.out.println("");
      }
}
else
{
     System.out.println("error"); 
}
}
}
