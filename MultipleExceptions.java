import java.io.*;
import java.util.*;
class Trycatch6
{
public static void main(String args[])
{
int a=5,b=0,c;
int arr[]=new int[5];
String str=null;
try
{
    arr[10]=200;
    c=a/b;
    System.out.println("length of the string is" +str.length());
    throw  new IOException();
}
catch(NullPointerException npe)
{
    System.out.println("NullpointerException caught" );
}
catch(ArithmeticException ae)
{
    System.out.println("ArithmeticException caught");
}
catch(ArrayIndexOutOfBoundsException aioobe)
{
    System.out.println("ArrayindexOutOfBoundsException caught");
}
catch(Exception e)
{
    System.out.println("Exception caught");
}
finally
{
    System.out.println("this is final block");
}
}
}
