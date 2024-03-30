import java.io.*;
class sort
{
public static void main(String args[])
{
int n,t,i,j;
DataInputStream dr=new DataInputStream(System.in);
try
{

System.out.println("ASWIN K S");
System.out.println("program to sort elements");
System.out.println("enter size");
n=Integer.parseInt(dr.readLine());

int a[]=new int[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(dr.readLine());
}
System.out.println("elements after sorting");
for(i=0;i<n;i++)
{
for(j=1;j<n-i;j++)
{

        if(a[j-1]>a[j])
        {
            t=a[j-1];
a[j-1]=a[j];
a[j]=t;
        }
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]+ " ");
}  
}
catch(Exception e)
{
System.out.println(e);
}
}
}
