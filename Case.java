
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sr = "upes is best";
		StringBuffer newSry = new StringBuffer(sr);
		for (int i=0; i<sr.length();i++) {
			if(Character.isLowerCase(sr.charAt(i)));
			newSry.setCharAt(i, Character.toUpperCase(sr.charAt(i)));
		}
		System.out.println("string is " + newSry);
	}
	

}
