public class Conversion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int i=10;
           Integer intobj=new Integer(i);
           System.out.println("int to Integer "+intobj);
           String str = intobj.toString();
           System.out.println("Integer to String "+str);
           int i1=Integer.parseInt(str); 
           System.out.println("String to int "+i1);
           String s=String.valueOf(i1);
           System.out.println("int to String "+s);
           Integer intobj1 = null;
           intobj1=Integer.valueOf(s);
           System.out.println("String to Integer "+intobj1);          
           int i3=intobj1.intValue();
           System.out.println("Integer to int "+i3);
	}
}	
