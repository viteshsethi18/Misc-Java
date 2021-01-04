import java.io.*;
import java.util.*;
class Occur
{
public static void main(String[]args) throws Exception
{
int len1,len2,last=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the string:");
String s1=sc.nextLine();
System.out.println("Enter searching string:");
String s2=sc.nextLine();
len1=s1.length();
len2=s2.length();
for(int i=0;i<=(len1-len2);i++)
{
if(s1.substring(i,len2+i).equals(s2))
{
if(last==0)
System.out.println("first appear at pos"+(i+1));
last=i+1;
}1
}
if(last!=0)
System.out.println("last occur at pos"+last);
else
System.out.println("not found");
}
}