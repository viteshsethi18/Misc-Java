class data
{
String name;
data(String n){ name=n; }
void disp()
{
System.out.println("Name :"+name);
int c=0;
int len=name.length();
for(int i=0;i<len;i++)
if(name.charAt(i)=='V'||name.charAt(i)=='v')
{
c++;
System.out.println("number of times alphabet appear :"+c);
System.out.println("Position of alphabet :"+(i+1));
}
if(c==0)
System.out.println("No V is available");
}
}
class Name
{
public static void main(String ar[])
{
data d1=new data("vitesh");
d1.disp();
data d2=new data("sethi");
d2.disp();
}
}