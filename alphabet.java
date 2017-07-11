import java.util.*;
import java.io.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char i=sc.nextLine();
if((i>='a' && i<='z') ||(i>='A' && i<='Z'))
{
System.out.println("Alphabet");
}
else
{
System.out.println("Not a alphabet");
}
}
}
