package login;

public class stringClass {

	public static void main(String[] args) {
		String name="ABCDEFGHIJKLMN";
        String name1="abcdefghijklmn";
        System.out.println(name.length());
        
        System.out.println(name1.charAt(4));
        System.out.println(name.charAt(6));
        
        System.out.println(name.equalsIgnoreCase(name1));
        String name3=name.concat(name1);
        System.out.println(name3);
        
        String [] name4=name.split("H");
        System.out.println(name4[0]);
        System.out.println(name4[1]);
        
        System.out.println(name.startsWith("AB"));
        System.out.println(name1.endsWith("mn"));
        System.out.println(name1.startsWith("ef"));
        }
}
