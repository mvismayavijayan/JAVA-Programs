import java.util.Scanner;
public class symmetric
{
public static void main(String[] args)
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number the rows:");
int rows=sc.nextInt();
System.out.println("enter the number of columns:");
int cols=sc.nextInt();
int matrix[][]=new int[rows][cols];
System.out.println("Enter the elements:");
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
matrix[i][j]=sc.nextInt();
}
}
System.out.println("the matrix is:");
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
System.out.print(matrix[i][j]+"\t");
}
System.out.println();
}
if(rows!=cols)
{
System.out.println("the given matrix is not square matrix..soit cant be symmetric!!");
}
else
{
boolean symmetric = true;
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
if(matrix[i][j] != matrix[j][i])
{
symmetric=false;
break;
}
}
}
if(symmetric)
{
System.out.println("the given matrix is symmetric!!");
}
else
{
System.out.println("the given matrix is notsymmetric!!");
}
}
sc.close();
}
}
