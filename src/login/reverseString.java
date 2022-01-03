package login;

public class reverseString {

	public static void main(String[] args) {
		String name="B A L A J I";
		String name1="";
		int stringlength=name.length();
		for(int i=stringlength-1;i>=0;i--) {
			name1=name1+name.charAt(i);
		}
        System.out.println(name1);
        }
	}

	


