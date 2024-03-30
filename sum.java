import java.io.*;
class sum{
public static void main(String args[]){
int a,b;
DataInputStream num;
String s;
num=new DataInputStream(System.in);
try
{
System.out.println("Enter number1: ");
s=num.readLine();
a=Integer.parseInt(s);
System.out.println("Enter number2: ");
s=num.readLine();
b=Integer.parseInt(s);
System.out.println("sum of "+a+" and "+b+" is "+(a+b));
}
catch(Exception e)
{
System.out.println(e);
}
}
}
