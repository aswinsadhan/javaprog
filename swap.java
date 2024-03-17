import java.io.*;
class swap{
public static void main(String args[]){
int a,b,t;
DataInputStream num;
String s;
num=new DataInputStream(System.in);
try
{
System.out.println("ASWIN K S");
System.out.println("WAP to swap two numbers");

System.out.println("Enter number1: ");
s=num.readLine();
a=Integer.parseInt(s);
System.out.println("Enter number2: ");
s=num.readLine();
b=Integer.parseInt(s);
t=a;
a=b;
b=t;
System.out.println("Number1 after swap: "+a);
System.out.println("Number2 after swap: "+b);
}
catch(Exception e){
System.out.println(e);
}
}
}
